/*
 * MSc(Biomedical Informatics) Project
 *
 * Development and Implementation of a Web-based Combined Data Repository of Genealogical, Clinical, Laboratory and Genetic Data
 * and
 * a Set of Related Tools
 */
package ncpa.bean;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import org.primefaces.component.submenu.Submenu;
import org.primefaces.model.DefaultMenuModel;
import org.primefaces.model.MenuModel;
import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import org.primefaces.component.menuitem.MenuItem;

/**
 *
 * @author Dr. M. H. B. Ariyaratne, MBBS, PGIM Trainee for MSc(Biomedical
 * Informatics)
 */
@ManagedBean
@RequestScoped
public class Menu implements Serializable {

    @ManagedProperty(value = "#{sessionController}")
    private SessionController sessionController;
    @ManagedProperty(value = "#{messageProvider}")
    private MessageProvider messageProvider;
    MenuModel model;
    String temIx = "";

    public MessageProvider getMessageProvider() {
        return messageProvider;
    }

    public void setMessageProvider(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    private String getLabel(String key) {
        return getMessageProvider().getValue(key);
    }

    public Menu() {
    }

    public Submenu editSubmenu() {
        Submenu submenu = new Submenu();
        submenu.setLabel("edit");

        MenuItem item;

        item = new MenuItem();
        item.setValue(getLabel("policeStations"));
        item.setUrl("police_station.xhtml");
        submenu.getChildren().add(item);

        
        item = new MenuItem();
        item.setValue(getLabel("province"));
        item.setUrl("province.xhtml");
        submenu.getChildren().add(item);
        
        
        item = new MenuItem();
        item.setValue(getLabel("courts"));
        item.setUrl("court.xhtml");
        submenu.getChildren().add(item);

        item = new MenuItem();
        item.setValue(getLabel("policeOfficers"));
        item.setUrl("police_officers.xhtml");
        submenu.getChildren().add(item);

        item = new MenuItem();
        item.setValue(getLabel("magistrates"));
        item.setUrl("magistrates.xhtml");
        submenu.getChildren().add(item);

        return submenu;
    }

    public Submenu casesSubmenu() {
        Submenu submenu = new Submenu();
        submenu.setLabel("cases");

        MenuItem item;

        item = new MenuItem();
        item.setValue(getLabel("addCase"));
        item.setUrl("add_case.xhtml");
        submenu.getChildren().add(item);

        item = new MenuItem();
        item.setValue(getLabel("searchCase"));
        item.setUrl("search_case.xhtml");
        submenu.getChildren().add(item);

        return submenu;
    }

    public Submenu reportsSubmenu() {
        Submenu submenu = new Submenu();
        submenu.setLabel("reports");

        MenuItem item;

        item = new MenuItem();
        item.setValue(getLabel("registredCases"));
        item.setUrl("registered_cases.xhtml");
        submenu.getChildren().add(item);



        return submenu;
    }

    public SessionController getSessionController() {
        return sessionController;
    }

    public void setSessionController(SessionController sessionController) {
        this.sessionController = sessionController;
    }

    public void createMenu() {
        model = new DefaultMenuModel();
        MenuItem item;
        item = new MenuItem();
        item.setValue(getLabel("home"));
        item.setUrl("index.xhtml");
        model.addMenuItem(item);
        model.addSubmenu(editSubmenu());
        model.addSubmenu(casesSubmenu());
        model.addSubmenu(reportsSubmenu());
        model.addSubmenu(adminSubmenu());
    }

    private Submenu adminSubmenu() {
        Submenu submenu;

        MenuItem item;

        submenu = new Submenu();
        submenu.setLabel(getLabel("admin"));

        item = new MenuItem();
        item.setValue(getLabel("activateAccounts"));
        item.setUrl("admin_activate_users.xhtml");
        submenu.getChildren().add(item);

        item = new MenuItem();
        item.setValue("Add Persons as Users");
        item.setUrl("admin_person_to_user.xhtml");
        submenu.getChildren().add(item);

        item = new MenuItem();
        item.setValue("Manage Accounts");
        item.setUrl("admin_user_previlages.xhtml");
        submenu.getChildren().add(item);

        item = new MenuItem();
        item.setValue("Remove User Accounts");
        item.setUrl("admin_remove_users.xhtml");
        submenu.getChildren().add(item);

        return submenu;
    }

    public MenuModel getModel() {
        return model;
    }

    public void setModel(MenuModel model) {
        this.model = model;
    }

    @PostConstruct
    public void init() {
        try {
            createMenu();
        } catch (Exception e) {
            System.out.println("Error in init method. It is " + e.getMessage());
        }
    }
}
