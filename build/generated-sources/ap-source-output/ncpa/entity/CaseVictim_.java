package ncpa.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ncpa.entity.ChildCase;
import ncpa.entity.Victim;
import ncpa.entity.WebUser;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-10-04T02:37:40")
@StaticMetamodel(CaseVictim.class)
public class CaseVictim_ { 

    public static volatile SingularAttribute<CaseVictim, Long> id;
    public static volatile SingularAttribute<CaseVictim, Victim> victim;
    public static volatile SingularAttribute<CaseVictim, String> description;
    public static volatile SingularAttribute<CaseVictim, Date> createdAt;
    public static volatile SingularAttribute<CaseVictim, String> name;
    public static volatile SingularAttribute<CaseVictim, WebUser> retirer;
    public static volatile SingularAttribute<CaseVictim, Boolean> retired;
    public static volatile SingularAttribute<CaseVictim, String> retireComments;
    public static volatile SingularAttribute<CaseVictim, WebUser> creater;
    public static volatile SingularAttribute<CaseVictim, ChildCase> childCase;
    public static volatile SingularAttribute<CaseVictim, Date> retiredAt;

}