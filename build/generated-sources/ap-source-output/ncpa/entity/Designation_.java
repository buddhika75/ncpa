package ncpa.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ncpa.entity.DesignationCategory;
import ncpa.entity.DesignationLevel;
import ncpa.entity.WebUser;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-10-04T02:37:40")
@StaticMetamodel(Designation.class)
public class Designation_ { 

    public static volatile SingularAttribute<Designation, Long> id;
    public static volatile SingularAttribute<Designation, DesignationCategory> category;
    public static volatile SingularAttribute<Designation, DesignationLevel> level;
    public static volatile SingularAttribute<Designation, Integer> orderNo;
    public static volatile SingularAttribute<Designation, Date> createdAt;
    public static volatile SingularAttribute<Designation, String> description;
    public static volatile SingularAttribute<Designation, WebUser> retirer;
    public static volatile SingularAttribute<Designation, String> name;
    public static volatile SingularAttribute<Designation, String> retireComments;
    public static volatile SingularAttribute<Designation, Boolean> retired;
    public static volatile SingularAttribute<Designation, WebUser> creater;
    public static volatile SingularAttribute<Designation, Date> retiredAt;

}