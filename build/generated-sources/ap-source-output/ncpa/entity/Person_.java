package ncpa.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ncpa.entity.Area;
import ncpa.entity.Institution;
import ncpa.entity.Sex;
import ncpa.entity.WebUser;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-10-04T02:37:41")
@StaticMetamodel(Person.class)
public class Person_ { 

    public static volatile SingularAttribute<Person, String> otherName;
    public static volatile SingularAttribute<Person, String> familyName;
    public static volatile SingularAttribute<Person, Boolean> retired;
    public static volatile SingularAttribute<Person, WebUser> creater;
    public static volatile SingularAttribute<Person, String> givenName;
    public static volatile SingularAttribute<Person, Long> id;
    public static volatile SingularAttribute<Person, Area> area;
    public static volatile SingularAttribute<Person, String> description;
    public static volatile SingularAttribute<Person, Date> createdAt;
    public static volatile SingularAttribute<Person, String> name;
    public static volatile SingularAttribute<Person, WebUser> retirer;
    public static volatile SingularAttribute<Person, String> retireComments;
    public static volatile SingularAttribute<Person, Sex> personSex;
    public static volatile SingularAttribute<Person, Date> retiredAt;
    public static volatile SingularAttribute<Person, Date> dOB;
    public static volatile SingularAttribute<Person, Institution> institution;

}