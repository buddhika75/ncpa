package ncpa.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ncpa.entity.Area;
import ncpa.entity.WebUser;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-10-04T02:37:41")
@StaticMetamodel(Area.class)
public class Area_ { 

    public static volatile SingularAttribute<Area, Long> id;
    public static volatile SingularAttribute<Area, String> description;
    public static volatile SingularAttribute<Area, Date> createdAt;
    public static volatile SingularAttribute<Area, String> name;
    public static volatile SingularAttribute<Area, WebUser> retirer;
    public static volatile SingularAttribute<Area, Boolean> retired;
    public static volatile SingularAttribute<Area, String> retireComments;
    public static volatile SingularAttribute<Area, WebUser> creater;
    public static volatile SingularAttribute<Area, String> code;
    public static volatile SingularAttribute<Area, Date> retiredAt;
    public static volatile SingularAttribute<Area, Area> superArea;

}