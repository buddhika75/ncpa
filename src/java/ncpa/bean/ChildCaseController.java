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
import ncpa.facade.ChildCaseFacade;
import ncpa.entity.ChildCase;
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
import ncpa.entity.*;
import ncpa.facade.CaseSuspectFacade;
import ncpa.facade.CaseVictimFacade;
import ncpa.facade.PersonFacade;
import ncpa.facade.SuspectFacade;
import ncpa.facade.VictimFacade;

/**
 *
 * @author Dr. M. H. B. Ariyaratne, MBBS, PGIM Trainee for MSc(Biomedical
 * Informatics)
 */
@ManagedBean
@SessionScoped
public final class ChildCaseController implements Serializable {

    /**
     *
     * EJBs for facade
     *
     */
    @EJB
    private ChildCaseFacade ejbFacade;
    @EJB
    InstitutionFacade institutionFacade;
    @EJB
    CaseSuspectFacade csFacade;
    @EJB
    CaseVictimFacade cvFacade;
    @EJB
    ContactTypeFacade ctFacade;
    @EJB
    PersonFacade perFacade;
    @EJB
    SuspectFacade ssFacade;
    @EJB
    VictimFacade vvFacade;
    /**
     * Managed Properties
     */
    @ManagedProperty(value = "#{sessionController}")
    SessionController sessionController;
    /**
     * Selected ChildCase
     */
    private ChildCase current;
    List<CaseVictim> caseVictims;
    List<CaseSuspect> caseSuspects;
    CaseSuspect currentCs;
    CaseVictim currentVi;
    /**
     * All ChildCases
     */
    private List<ChildCase> items = null;
    String selectText = "";

    
    String victimName;
    String victimGender;
    Long victimAge;
    
    String suspectsName;
    Long suspectsAge;
    String suspectsRelation;
    String suspectsDesignation;
    
    String informantName;
    
    
    public void addSuspect(){
        if (suspectsName == null ) {
            return;
        }
        if (suspectsName.trim().equals("")){
            JsfUtil.addErrorMessage("Please enter all dtails of the suspect");
            return;
        }
        CaseSuspect cs = new CaseSuspect();
        Person p = new Person();
        Suspect s = new Suspect();
        
        p.setName(suspectsName);
        s.setPerson(p);
        
        cs.setChildCase(current);
        cs.setSuspect(s);
        
        caseSuspects.add(cs);
    }

    public PersonFacade getPerFacade() {
        return perFacade;
    }

    public void setPerFacade(PersonFacade perFacade) {
        this.perFacade = perFacade;
    }

    public Long getSuspectsAge() {
        return suspectsAge;
    }

    public void setSuspectsAge(Long suspectsAge) {
        this.suspectsAge = suspectsAge;
    }

    public String getSuspectsDesignation() {
        return suspectsDesignation;
    }

    public void setSuspectsDesignation(String suspectsDesignation) {
        this.suspectsDesignation = suspectsDesignation;
    }

    public CaseSuspect getCurrentCs() {
        return currentCs;
    }

    public void setCurrentCs(CaseSuspect currentCs) {
        this.currentCs = currentCs;
    }

    public CaseVictim getCurrentVi() {
        return currentVi;
    }

    public void setCurrentVi(CaseVictim currentVi) {
        this.currentVi = currentVi;
    }

    
    
    public String getSuspectsName() {
        return suspectsName;
    }

    public void setSuspectsName(String suspectsName) {
        this.suspectsName = suspectsName;
    }

    public String getSuspectsRelation() {
        return suspectsRelation;
    }

    public void setSuspectsRelation(String suspectsRelation) {
        this.suspectsRelation = suspectsRelation;
    }

    public Long getVictimAge() {
        return victimAge;
    }

    public void setVictimAge(Long victimAge) {
        this.victimAge = victimAge;
    }

    public String getVictimGender() {
        return victimGender;
    }

    public void setVictimGender(String victimGender) {
        this.victimGender = victimGender;
    }

    public String getVictimName() {
        return victimName;
    }

    public void setVictimName(String victimName) {
        this.victimName = victimName;
    }

    public SuspectFacade getSsFacade() {
        return ssFacade;
    }

    public void setSsFacade(SuspectFacade ssFacade) {
        this.ssFacade = ssFacade;
    }

    public VictimFacade getVvFacade() {
        return vvFacade;
    }

    public void setVvFacade(VictimFacade vvFacade) {
        this.vvFacade = vvFacade;
    }
    

    
    
    public void addVictim(){
        if (victimName.trim().equals("")){
            JsfUtil.addErrorMessage("Please enter all dtails of the victim");
            return;
        }
        CaseVictim cs = new CaseVictim();
        Person p = new Person();
        Victim s = new Victim();
        
        p.setName(suspectsName);
        s.setPerson(p);
        
        cs.setChildCase(current);
        cs.setVictim(s);
        
        caseVictims.add(cs);
    }
    
    public CaseSuspectFacade getCsFacade() {
        return csFacade;
    }

    public void setCsFacade(CaseSuspectFacade csFacade) {
        this.csFacade = csFacade;
    }

    public CaseVictimFacade getCvFacade() {
        return cvFacade;
    }

    public void setCvFacade(CaseVictimFacade cvFacade) {
        this.cvFacade = cvFacade;
    }

    public ContactTypeFacade getCtFacade() {
        return ctFacade;
    }

    public void setCtFacade(ContactTypeFacade ctFacade) {
        this.ctFacade = ctFacade;
    }

    public List<CaseSuspect> getCaseSuspects() {
        if (caseSuspects==null){
            caseSuspects = new ArrayList<CaseSuspect>();
        }
        return caseSuspects;
    }

    public void setCaseSuspects(List<CaseSuspect> caseSuspects) {
        this.caseSuspects = caseSuspects;
    }

    public List<CaseVictim> getCaseVictims() {
        if (caseVictims==null){
            caseVictims=new ArrayList<CaseVictim>();
        }
        return caseVictims;
    }

    public void setCaseVictims(List<CaseVictim> caseVictims) {
        this.caseVictims = caseVictims;
    }

    /**
     * Returns the selected contact If no contact is selected, new contact is
     * created for the current user
     *
     */
    public void setItems(List<ChildCase> items) {
        this.items = items;
    }

    public ChildCaseController() {
    }

    public InstitutionFacade getInstitutionFacade() {
        return institutionFacade;
    }

    public void setInstitutionFacade(InstitutionFacade institutionFacade) {
        this.institutionFacade = institutionFacade;
    }

    public ChildCase getCurrent() {
        if (current == null) {
            current = new ChildCase();
        }
        return current;
    }

    public void setCurrent(ChildCase current) {
        this.current = current;
        if (current == null) {
            caseSuspects = new ArrayList<CaseSuspect>();
            caseVictims = new ArrayList<CaseVictim>();
        } else {
            String temSql = "";
            temSql = "Select cs from CaseSuspect cs where cs.retired=false and cs.childCase.id = " + current.getId();
            caseSuspects = getCsFacade().findBySQL(temSql);
            temSql = "Select cs from CaseVictim cs where cs.retired=false and cs.childCase.id = " + current.getId();
            caseVictims = getCvFacade().findBySQL(temSql);
        }
    }

    private ChildCaseFacade getFacade() {
        return ejbFacade;
    }

    public List<ChildCase> getItems() {
        String temSql;
        if (selectText.trim().equals("")) {
            temSql = "select p from ChildCase p where p.retired=false order by p.name";
        } else {
            temSql = "select p from ChildCase p where p.retired=false and lower(p.name) like '%" + selectText.toLowerCase() + "%' order by p.name";
        }
        List<ChildCase> temLstPer = getFacade().findBySQL(temSql);
        items = temLstPer;
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
        setCurrent(new ChildCase());

    }

    public void saveSelected() {
//        if (sessionController.getPrivilege().isInventoryEdit()==false){
//            JsfUtil.addErrorMessage("You are not autherized to make changes to any content");
//            return;
//        }            
        if (current == null) {
            JsfUtil.addErrorMessage("Nothing to save");
            return;
        }
        if (current.getId() != null && current.getId() != 0) {
            getFacade().edit(current);
            JsfUtil.addSuccessMessage(new MessageProvider().getValue("savedOldSuccessfully"));
        } else {
            current.setCreatedAt(Calendar.getInstance().getTime());
            current.setCreater(sessionController.loggedUser);
            getFacade().create(current);
            JsfUtil.addSuccessMessage(new MessageProvider().getValue("savedNewSuccessfully"));
        }
        saveSuspects();
        getItems();
        selectText = "";
    }

    private void saveSuspects(){
        for (CaseSuspect cs:caseSuspects){
            if (cs.getSuspect().getPerson().getId()==null || cs.getSuspect().getPerson().getId()==0){
                perFacade.create(cs.getSuspect().getPerson());
            }else{
                perFacade.edit(cs.getSuspect().getPerson());
            }
             if (cs.getSuspect().getId()==null || cs.getSuspect().getId()==0){
                ssFacade.create(cs.getSuspect());
            }else{
                ssFacade.edit(cs.getSuspect());
            }
             if (cs.getId()==null || cs.getId()==0){
                csFacade.create(cs);
            }else{
                csFacade.edit(cs);
            }
        }
    }
    
    public void delete() {
        if (sessionController.getPrivilege().isInventoryDelete() == false) {
            JsfUtil.addErrorMessage("You are not autherized to delete any content");
            return;
        }
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

    public ChildCaseFacade getEjbFacade() {
        return ejbFacade;
    }

    public void setEjbFacade(ChildCaseFacade ejbFacade) {
        this.ejbFacade = ejbFacade;
    }

    public SessionController getSessionController() {
        return sessionController;
    }

    public void setSessionController(SessionController sessionController) {
        this.sessionController = sessionController;
    }

    @FacesConverter(forClass = ChildCase.class)
    public static class ChildCaseControllerConverter implements Converter {

        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            ChildCaseController controller = (ChildCaseController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "childCaseController");
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
            if (object instanceof ChildCase) {
                ChildCase o = (ChildCase) object;
                return getStringKey(o.getId());
            } else {
                throw new IllegalArgumentException("object " + object + " is of type "
                        + object.getClass().getName() + "; expected type: " + ChildCaseController.class.getName());
            }
        }
    }
}
