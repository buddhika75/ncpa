package ncpa.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ncpa.entity.WebUser;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-10-04T02:37:40")
@StaticMetamodel(ContactType.class)
public class ContactType_ { 

    public static volatile SingularAttribute<ContactType, Long> id;
    public static volatile SingularAttribute<ContactType, String> description;
    public static volatile SingularAttribute<ContactType, Date> createdAt;
    public static volatile SingularAttribute<ContactType, String> name;
    public static volatile SingularAttribute<ContactType, WebUser> retirer;
    public static volatile SingularAttribute<ContactType, Boolean> retired;
    public static volatile SingularAttribute<ContactType, String> retireComments;
    public static volatile SingularAttribute<ContactType, WebUser> creater;
    public static volatile SingularAttribute<ContactType, Date> retiredAt;

}