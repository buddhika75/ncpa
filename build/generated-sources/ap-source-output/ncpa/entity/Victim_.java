package ncpa.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ncpa.entity.Person;
import ncpa.entity.Victim;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-10-04T02:37:41")
@StaticMetamodel(Victim.class)
public class Victim_ { 

    public static volatile SingularAttribute<Victim, Date> activatedAt;
    public static volatile SingularAttribute<Victim, Person> person;
    public static volatile SingularAttribute<Victim, Boolean> retired;
    public static volatile SingularAttribute<Victim, Victim> creater;
    public static volatile SingularAttribute<Victim, Long> id;
    public static volatile SingularAttribute<Victim, String> activateComments;
    public static volatile SingularAttribute<Victim, String> description;
    public static volatile SingularAttribute<Victim, Date> createdAt;
    public static volatile SingularAttribute<Victim, String> name;
    public static volatile SingularAttribute<Victim, Victim> retirer;
    public static volatile SingularAttribute<Victim, Boolean> activated;
    public static volatile SingularAttribute<Victim, String> retireComments;
    public static volatile SingularAttribute<Victim, Victim> activator;
    public static volatile SingularAttribute<Victim, Date> retiredAt;

}