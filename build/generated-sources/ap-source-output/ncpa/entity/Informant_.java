package ncpa.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ncpa.entity.Informant;
import ncpa.entity.Person;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-10-04T02:37:40")
@StaticMetamodel(Informant.class)
public class Informant_ { 

    public static volatile SingularAttribute<Informant, Date> activatedAt;
    public static volatile SingularAttribute<Informant, Person> person;
    public static volatile SingularAttribute<Informant, Boolean> retired;
    public static volatile SingularAttribute<Informant, Informant> creater;
    public static volatile SingularAttribute<Informant, Long> id;
    public static volatile SingularAttribute<Informant, String> activateComments;
    public static volatile SingularAttribute<Informant, String> description;
    public static volatile SingularAttribute<Informant, Date> createdAt;
    public static volatile SingularAttribute<Informant, String> name;
    public static volatile SingularAttribute<Informant, Informant> retirer;
    public static volatile SingularAttribute<Informant, Boolean> activated;
    public static volatile SingularAttribute<Informant, String> retireComments;
    public static volatile SingularAttribute<Informant, Informant> activator;
    public static volatile SingularAttribute<Informant, Date> retiredAt;

}