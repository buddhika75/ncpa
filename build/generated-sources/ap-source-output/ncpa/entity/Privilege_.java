package ncpa.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ncpa.entity.Area;
import ncpa.entity.Institution;
import ncpa.entity.WebUser;
import ncpa.entity.WebUserRole;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-10-04T02:37:40")
@StaticMetamodel(Privilege.class)
public class Privilege_ { 

    public static volatile SingularAttribute<Privilege, Boolean> manageAccounts;
    public static volatile SingularAttribute<Privilege, Boolean> caderEdit;
    public static volatile SingularAttribute<Privilege, Boolean> vehicleDelete;
    public static volatile SingularAttribute<Privilege, Boolean> inventoryEdit;
    public static volatile SingularAttribute<Privilege, WebUser> creater;
    public static volatile SingularAttribute<Privilege, WebUser> webUser;
    public static volatile SingularAttribute<Privilege, String> description;
    public static volatile SingularAttribute<Privilege, String> retireComments;
    public static volatile SingularAttribute<Privilege, Boolean> bmeDelete;
    public static volatile SingularAttribute<Privilege, Boolean> libraryEdit;
    public static volatile SingularAttribute<Privilege, Boolean> financeDelete;
    public static volatile SingularAttribute<Privilege, Boolean> libraryView;
    public static volatile SingularAttribute<Privilege, Boolean> postDelete;
    public static volatile SingularAttribute<Privilege, Boolean> bmeEdit;
    public static volatile SingularAttribute<Privilege, Boolean> activateAccounts;
    public static volatile SingularAttribute<Privilege, Boolean> msEdit;
    public static volatile SingularAttribute<Privilege, WebUser> activator;
    public static volatile SingularAttribute<Privilege, Boolean> caderAdd;
    public static volatile SingularAttribute<Privilege, Boolean> postAdd;
    public static volatile SingularAttribute<Privilege, Boolean> vehicleView;
    public static volatile SingularAttribute<Privilege, Date> activatedAt;
    public static volatile SingularAttribute<Privilege, Boolean> postView;
    public static volatile SingularAttribute<Privilege, Boolean> retired;
    public static volatile SingularAttribute<Privilege, Boolean> financeView;
    public static volatile SingularAttribute<Privilege, Boolean> demographyView;
    public static volatile SingularAttribute<Privilege, Boolean> bmeAdd;
    public static volatile SingularAttribute<Privilege, Long> id;
    public static volatile SingularAttribute<Privilege, Boolean> vehicleAdd;
    public static volatile SingularAttribute<Privilege, Boolean> caderView;
    public static volatile SingularAttribute<Privilege, Date> createdAt;
    public static volatile SingularAttribute<Privilege, Boolean> activated;
    public static volatile SingularAttribute<Privilege, WebUser> retirer;
    public static volatile SingularAttribute<Privilege, Institution> restrictedInstitution;
    public static volatile SingularAttribute<Privilege, String> name;
    public static volatile SingularAttribute<Privilege, Boolean> msAdd;
    public static volatile SingularAttribute<Privilege, Boolean> vehicleEdit;
    public static volatile SingularAttribute<Privilege, Boolean> libraryAdd;
    public static volatile SingularAttribute<Privilege, Boolean> inventoryAdd;
    public static volatile SingularAttribute<Privilege, Boolean> bmeView;
    public static volatile SingularAttribute<Privilege, Boolean> msDelete;
    public static volatile SingularAttribute<Privilege, Boolean> libraryDelete;
    public static volatile SingularAttribute<Privilege, Boolean> inventoryDelete;
    public static volatile SingularAttribute<Privilege, WebUserRole> webUserRole;
    public static volatile SingularAttribute<Privilege, Boolean> inventoryView;
    public static volatile SingularAttribute<Privilege, Boolean> demographyEdit;
    public static volatile SingularAttribute<Privilege, Boolean> deleteAccounts;
    public static volatile SingularAttribute<Privilege, Boolean> dectivateAccounts;
    public static volatile SingularAttribute<Privilege, Boolean> postEdit;
    public static volatile SingularAttribute<Privilege, String> activateComments;
    public static volatile SingularAttribute<Privilege, Boolean> financeAdd;
    public static volatile SingularAttribute<Privilege, Area> restrictedArea;
    public static volatile SingularAttribute<Privilege, Boolean> demographyAdd;
    public static volatile SingularAttribute<Privilege, Boolean> msView;
    public static volatile SingularAttribute<Privilege, Boolean> demographyDelete;
    public static volatile SingularAttribute<Privilege, Boolean> financeEdit;
    public static volatile SingularAttribute<Privilege, Date> retiredAt;
    public static volatile SingularAttribute<Privilege, Boolean> caderDelete;

}