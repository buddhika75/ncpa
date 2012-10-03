package ncpa.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ncpa.entity.Country;
import ncpa.entity.Institution;
import ncpa.entity.InstitutionContact;
import ncpa.entity.InstitutionType;
import ncpa.entity.Province;
import ncpa.entity.WebUser;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-10-04T02:37:40")
@StaticMetamodel(Institution.class)
public class Institution_ { 

    public static volatile SingularAttribute<Institution, String> fax;
    public static volatile SingularAttribute<Institution, String> website;
    public static volatile SingularAttribute<Institution, Boolean> retired;
    public static volatile SingularAttribute<Institution, Institution> superInstitution;
    public static volatile SingularAttribute<Institution, InstitutionType> institutionType;
    public static volatile ListAttribute<Institution, InstitutionContact> institutionContacts;
    public static volatile SingularAttribute<Institution, WebUser> creater;
    public static volatile SingularAttribute<Institution, String> code;
    public static volatile SingularAttribute<Institution, Boolean> outSide;
    public static volatile SingularAttribute<Institution, Country> country;
    public static volatile SingularAttribute<Institution, Long> id;
    public static volatile SingularAttribute<Institution, String> email;
    public static volatile SingularAttribute<Institution, String> address;
    public static volatile SingularAttribute<Institution, Date> createdAt;
    public static volatile SingularAttribute<Institution, String> description;
    public static volatile SingularAttribute<Institution, WebUser> retirer;
    public static volatile SingularAttribute<Institution, String> name;
    public static volatile SingularAttribute<Institution, Province> province;
    public static volatile SingularAttribute<Institution, String> retireComments;
    public static volatile SingularAttribute<Institution, Date> retiredAt;
    public static volatile SingularAttribute<Institution, String> telephone;
    public static volatile SingularAttribute<Institution, String> comments;
    public static volatile SingularAttribute<Institution, String> mobile;

}