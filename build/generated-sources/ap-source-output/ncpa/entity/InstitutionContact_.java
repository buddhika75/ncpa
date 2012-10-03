package ncpa.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ncpa.entity.ContactType;
import ncpa.entity.Institution;
import ncpa.entity.WebUser;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-10-04T02:37:40")
@StaticMetamodel(InstitutionContact.class)
public class InstitutionContact_ { 

    public static volatile SingularAttribute<InstitutionContact, Long> id;
    public static volatile SingularAttribute<InstitutionContact, String> description;
    public static volatile SingularAttribute<InstitutionContact, Date> createdAt;
    public static volatile SingularAttribute<InstitutionContact, String> name;
    public static volatile SingularAttribute<InstitutionContact, WebUser> retirer;
    public static volatile SingularAttribute<InstitutionContact, Boolean> retired;
    public static volatile SingularAttribute<InstitutionContact, String> retireComments;
    public static volatile SingularAttribute<InstitutionContact, ContactType> contactType;
    public static volatile SingularAttribute<InstitutionContact, WebUser> creater;
    public static volatile SingularAttribute<InstitutionContact, Date> retiredAt;
    public static volatile SingularAttribute<InstitutionContact, Institution> institution;

}