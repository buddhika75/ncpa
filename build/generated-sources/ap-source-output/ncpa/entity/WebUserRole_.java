package ncpa.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ncpa.entity.WebUser;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-10-04T02:37:40")
@StaticMetamodel(WebUserRole.class)
public class WebUserRole_ { 

    public static volatile SingularAttribute<WebUserRole, Date> activatedAt;
    public static volatile SingularAttribute<WebUserRole, Boolean> retired;
    public static volatile SingularAttribute<WebUserRole, WebUser> creater;
    public static volatile SingularAttribute<WebUserRole, Long> id;
    public static volatile SingularAttribute<WebUserRole, String> activateComments;
    public static volatile SingularAttribute<WebUserRole, String> description;
    public static volatile SingularAttribute<WebUserRole, Date> createdAt;
    public static volatile SingularAttribute<WebUserRole, String> name;
    public static volatile SingularAttribute<WebUserRole, WebUser> retirer;
    public static volatile SingularAttribute<WebUserRole, Boolean> activated;
    public static volatile SingularAttribute<WebUserRole, String> retireComments;
    public static volatile SingularAttribute<WebUserRole, WebUser> activator;
    public static volatile SingularAttribute<WebUserRole, Date> retiredAt;

}