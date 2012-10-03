package ncpa.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ncpa.entity.Person;
import ncpa.entity.WebTheme;
import ncpa.entity.WebUser;
import ncpa.entity.WebUserRole;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-10-04T02:37:40")
@StaticMetamodel(WebUser.class)
public class WebUser_ { 

    public static volatile SingularAttribute<WebUser, Date> activatedAt;
    public static volatile SingularAttribute<WebUser, String> defLocale;
    public static volatile SingularAttribute<WebUser, Boolean> retired;
    public static volatile SingularAttribute<WebUser, WebTheme> userWebTheme;
    public static volatile SingularAttribute<WebUser, WebUser> creater;
    public static volatile SingularAttribute<WebUser, String> primeTheme;
    public static volatile SingularAttribute<WebUser, Long> id;
    public static volatile SingularAttribute<WebUser, String> activateComments;
    public static volatile SingularAttribute<WebUser, String> webUserPassword;
    public static volatile SingularAttribute<WebUser, String> description;
    public static volatile SingularAttribute<WebUser, Date> createdAt;
    public static volatile SingularAttribute<WebUser, WebUser> retirer;
    public static volatile SingularAttribute<WebUser, Boolean> activated;
    public static volatile SingularAttribute<WebUser, String> name;
    public static volatile SingularAttribute<WebUser, String> retireComments;
    public static volatile SingularAttribute<WebUser, WebUserRole> role;
    public static volatile SingularAttribute<WebUser, WebUser> activator;
    public static volatile SingularAttribute<WebUser, Date> retiredAt;
    public static volatile SingularAttribute<WebUser, Person> webUserPerson;

}