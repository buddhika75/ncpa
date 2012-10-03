package ncpa.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ncpa.entity.WebUser;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-10-04T02:37:41")
@StaticMetamodel(Sex.class)
public class Sex_ { 

    public static volatile SingularAttribute<Sex, Long> id;
    public static volatile SingularAttribute<Sex, String> description;
    public static volatile SingularAttribute<Sex, Date> createdAt;
    public static volatile SingularAttribute<Sex, String> name;
    public static volatile SingularAttribute<Sex, WebUser> retirer;
    public static volatile SingularAttribute<Sex, Boolean> retired;
    public static volatile SingularAttribute<Sex, String> retireComments;
    public static volatile SingularAttribute<Sex, WebUser> creater;
    public static volatile SingularAttribute<Sex, Date> retiredAt;

}