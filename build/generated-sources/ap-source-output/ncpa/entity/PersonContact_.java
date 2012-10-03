package ncpa.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ncpa.entity.ContactType;
import ncpa.entity.Person;
import ncpa.entity.WebUser;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-10-04T02:37:40")
@StaticMetamodel(PersonContact.class)
public class PersonContact_ { 

    public static volatile SingularAttribute<PersonContact, Long> id;
    public static volatile SingularAttribute<PersonContact, Person> person;
    public static volatile SingularAttribute<PersonContact, String> description;
    public static volatile SingularAttribute<PersonContact, Date> createdAt;
    public static volatile SingularAttribute<PersonContact, String> name;
    public static volatile SingularAttribute<PersonContact, WebUser> retirer;
    public static volatile SingularAttribute<PersonContact, Boolean> retired;
    public static volatile SingularAttribute<PersonContact, String> retireComments;
    public static volatile SingularAttribute<PersonContact, ContactType> contactType;
    public static volatile SingularAttribute<PersonContact, WebUser> creater;
    public static volatile SingularAttribute<PersonContact, Date> retiredAt;

}