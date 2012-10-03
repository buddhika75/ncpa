/*
 * MSc(Biomedical Informatics) Project
 * 
 * Development and Implementation of a Web-based Combined Data Repository of 
 Genealogical, Clinical, Laboratory and Genetic Data 
 * and
 * a Set of Related Tools
 */
package ncpa.bean;

import ncpa.entity.Institution;
import ncpa.facade.CaseSuspectFacade;
import ncpa.entity.CaseSuspect;
import ncpa.facade.ContactTypeFacade;
import ncpa.facade.InstitutionFacade;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author Dr. M. H. B. Ariyaratne, MBBS, PGIM Trainee for MSc(Biomedical
 * Informatics)
 */
@ManagedBean
@SessionScoped
public final class CaseSuspectController implements Serializable {
    
/**
 *
 * EJBs for facade
 * 
 */    
    @EJB
    private CaseSuspectFacade ejbFacade;
    @EJB
    InstitutionFacade institutionFacade;
    @EJB
    ContactTypeFacade ctFacade;
    /**
     * Managed Properties
     */
    @ManagedProperty(value = "#{sessionController}")
    SessionController sessionController;
    /**
     * Selected CaseSuspect
     */
    private CaseSuspect current;
    /**
     * All CaseSuspects
     */
    private List<CaseSuspect> items = null;
   
    String selectText = "";

    public ContactTypeFacade getCtFacade() {
        return ctFacade;
    }

    public void setCtFacade(ContactTypeFacade ctFacade) {
        this.ctFacade = ctFacade;
    }

/**
 * Returns the selected contact
 * If no contact is selected, new contact is created for the current user
 *
 */
   

    
    public void setItems(List<CaseSuspect> items) {
        this.items = items;
    }

    
    public CaseSuspectController() {
    }

    public InstitutionFacade getInstitutionFacade() {
        return institutionFacade;
    }

    public void setInstitutionFacade(InstitutionFacade institutionFacade) {
        this.institutionFacade = institutionFacade;
    }

    
     public CaseSuspect getCurrent() {
        if (current == null) {
            current = new CaseSuspect();
        }
        return current;
    }

    public void setCurrent(CaseSuspect current) {
        this.current = current;
            }

    private CaseSuspectFacade getFacade() {
        return ejbFacade;
    }

    public List<CaseSuspect> getItems() {
        String temSql;
        if (selectText.trim().equals("")) {
            temSql = "select p from CaseSuspect p where p.retired=false order by p.name";
        } else {
            temSql = "select p from CaseSuspect p where p.retired=false and lower(p.name) like '%" + selectText.toLowerCase() + "%' order by p.name";
        }
        List<CaseSuspect> temLstPer = getFacade().findBySQL(temSql);
        items =temLstPer;
        return items;
    }

    public static int intValue(long value) {
        int valueInt = (int) value;
        if (valueInt != value) {
            throw new IllegalArgumentException(
                    "The long value " + value + " is not within range of the int type");
        }
        return valueInt;
    }


    public void prepareAdd() {
        setCurrent(new CaseSuspect());
        
    }

    public void saveSelected() {
//        if (sessionController.getPrivilege().isInventoryEdit()==false){
//            JsfUtil.addErrorMessage("You are not autherized to make changes to any content");
//            return;
//        }            
        if (current==null){
            JsfUtil.addErrorMessage("Nothing to save");
            return;
        }
        if (current.getName().trim().equals("")){
            JsfUtil.addErrorMessage("Please enter a name to save");
            return;
        }
        if (current.getId()!=null  && current.getId() !=0) {
            getFacade().edit(current);
            JsfUtil.addSuccessMessage(new MessageProvider().getValue("savedOldSuccessfully"));
        } else {
            current.setCreatedAt(Calendar.getInstance().getTime());
            current.setCreater(sessionController.loggedUser);
            getFacade().create(current);
            JsfUtil.addSuccessMessage(new MessageProvider().getValue("savedNewSuccessfully"));
        }
        getItems();
        selectText = "";
    }

    public void delete() {
//        if (sessionController.getPrivilege().isInventoryDelete()==false){
//            JsfUtil.addErrorMessage("You are not autherized to delete any content");
//            return;
//        }
        if (current != null) {
            current.setRetired(true);
            current.setRetiredAt(Calendar.getInstance().getTime());
            current.setRetirer(sessionController.loggedUser);
            getFacade().edit(current);
            JsfUtil.addSuccessMessage(new MessageProvider().getValue("deleteSuccessful"));
        } else {
            JsfUtil.addErrorMessage(new MessageProvider().getValue("nothingToDelete"));
        }
        getItems();
    }

    public String getSelectText() {
        return selectText;
    }

    public void setSelectText(String selectText) {
        this.selectText = selectText;
    }

    public CaseSuspectFacade getEjbFacade() {
        return ejbFacade;
    }

    public void setEjbFacade(CaseSuspectFacade ejbFacade) {
        this.ejbFacade = ejbFacade;
    }

    public SessionController getSessionController() {
        return sessionController;
    }

    public void setSessionController(SessionController sessionController) {
        this.sessionController = sessionController;
    }

    @FacesConverter(forClass = CaseSuspect.class)
    public static class CaseSuspectControllerConverter implements Converter {

        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            CaseSuspectController controller = (CaseSuspectController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "caseSuspectController");
            return controller.ejbFacade.find(getKey(value));
        }

        java.lang.Long getKey(String value) {
            java.lang.Long key;
            key = Long.valueOf(value);
            return key;
        }

        String getStringKey(java.lang.Long value) {
            StringBuffer sb = new StringBuffer();
            sb.append(value);
            return sb.toString();
        }

        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof CaseSuspect) {
                CaseSuspect o = (CaseSuspect) object;
                return getStringKey(o.getId());
            } else {
                throw new IllegalArgumentException("object " + object + " is of type "
                        + object.getClass().getName() + "; expected type: " + CaseSuspectController.class.getName());
            }
        }
    }
}
