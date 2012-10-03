package ncpa.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ncpa.entity.Designation;
import ncpa.entity.Person;
import ncpa.entity.Suspect;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-10-04T02:37:40")
@StaticMetamodel(Suspect.class)
public class Suspect_ { 

    public static volatile SingularAttribute<Suspect, Date> activatedAt;
    public static volatile SingularAttribute<Suspect, Person> person;
    public static volatile SingularAttribute<Suspect, Designation> designation;
    public static volatile SingularAttribute<Suspect, Boolean> retired;
    public static volatile SingularAttribute<Suspect, Suspect> creater;
    public static volatile SingularAttribute<Suspect, Long> id;
    public static volatile SingularAttribute<Suspect, String> activateComments;
    public static volatile SingularAttribute<Suspect, String> description;
    public static volatile SingularAttribute<Suspect, Date> createdAt;
    public static volatile SingularAttribute<Suspect, String> name;
    public static volatile SingularAttribute<Suspect, Suspect> retirer;
    public static volatile SingularAttribute<Suspect, Boolean> activated;
    public static volatile SingularAttribute<Suspect, String> retireComments;
    public static volatile SingularAttribute<Suspect, Suspect> activator;
    public static volatile SingularAttribute<Suspect, Date> retiredAt;

}