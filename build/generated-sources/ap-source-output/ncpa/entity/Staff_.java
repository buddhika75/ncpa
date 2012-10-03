package ncpa.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ncpa.entity.Area;
import ncpa.entity.Designation;
import ncpa.entity.Institution;
import ncpa.entity.WebUser;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-10-04T02:37:40")
@StaticMetamodel(Staff.class)
public class Staff_ { 

    public static volatile SingularAttribute<Staff, Long> id;
    public static volatile SingularAttribute<Staff, Area> area;
    public static volatile SingularAttribute<Staff, Date> createdAt;
    public static volatile SingularAttribute<Staff, String> description;
    public static volatile SingularAttribute<Staff, WebUser> retirer;
    public static volatile SingularAttribute<Staff, String> name;
    public static volatile SingularAttribute<Staff, String> retireComments;
    public static volatile SingularAttribute<Staff, Designation> designation;
    public static volatile SingularAttribute<Staff, Boolean> retired;
    public static volatile SingularAttribute<Staff, WebUser> creater;
    public static volatile SingularAttribute<Staff, Date> retiredAt;
    public static volatile SingularAttribute<Staff, Institution> institution;

}