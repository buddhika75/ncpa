package ncpa.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ncpa.entity.ChildCase;
import ncpa.entity.Suspect;
import ncpa.entity.WebUser;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-10-04T02:37:40")
@StaticMetamodel(CaseSuspect.class)
public class CaseSuspect_ { 

    public static volatile SingularAttribute<CaseSuspect, Long> id;
    public static volatile SingularAttribute<CaseSuspect, String> description;
    public static volatile SingularAttribute<CaseSuspect, Date> createdAt;
    public static volatile SingularAttribute<CaseSuspect, String> name;
    public static volatile SingularAttribute<CaseSuspect, WebUser> retirer;
    public static volatile SingularAttribute<CaseSuspect, Boolean> retired;
    public static volatile SingularAttribute<CaseSuspect, String> retireComments;
    public static volatile SingularAttribute<CaseSuspect, Suspect> suspect;
    public static volatile SingularAttribute<CaseSuspect, WebUser> creater;
    public static volatile SingularAttribute<CaseSuspect, ChildCase> childCase;
    public static volatile SingularAttribute<CaseSuspect, Date> retiredAt;

}