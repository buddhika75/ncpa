package ncpa.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ncpa.entity.Category;
import ncpa.entity.WebUser;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-10-04T02:37:40")
@StaticMetamodel(Category.class)
public class Category_ { 

    public static volatile SingularAttribute<Category, Category> parentCategory;
    public static volatile SingularAttribute<Category, Boolean> retired;
    public static volatile SingularAttribute<Category, WebUser> creater;
    public static volatile SingularAttribute<Category, Long> id;
    public static volatile SingularAttribute<Category, Double> dblValue;
    public static volatile SingularAttribute<Category, Integer> orderNo;
    public static volatile SingularAttribute<Category, String> description;
    public static volatile SingularAttribute<Category, Date> createdAt;
    public static volatile SingularAttribute<Category, Long> longValue;
    public static volatile SingularAttribute<Category, String> name;
    public static volatile SingularAttribute<Category, WebUser> retirer;
    public static volatile SingularAttribute<Category, String> retireComments;
    public static volatile SingularAttribute<Category, Date> retiredAt;

}