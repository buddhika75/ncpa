package ncpa.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ncpa.entity.Category;
import ncpa.entity.Court;
import ncpa.entity.Informant;
import ncpa.entity.PoliceStation;
import ncpa.entity.Province;
import ncpa.entity.Staff;
import ncpa.entity.WebUser;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-10-04T02:37:40")
@StaticMetamodel(ChildCase.class)
public class ChildCase_ { 

    public static volatile SingularAttribute<ChildCase, String> locationOfTheIncident;
    public static volatile SingularAttribute<ChildCase, Date> dateOfComplaintFirstInformation;
    public static volatile SingularAttribute<ChildCase, Date> dateOnWhichTheIbesWereReceived;
    public static volatile SingularAttribute<ChildCase, Court> traialCourt;
    public static volatile SingularAttribute<ChildCase, String> agsDecision;
    public static volatile SingularAttribute<ChildCase, Boolean> retired;
    public static volatile SingularAttribute<ChildCase, String> breportNo;
    public static volatile SingularAttribute<ChildCase, Court> court;
    public static volatile SingularAttribute<ChildCase, WebUser> creater;
    public static volatile SingularAttribute<ChildCase, Date> dateOnWhichTheMlrWasReceived;
    public static volatile SingularAttribute<ChildCase, Date> dateoftheindictment;
    public static volatile SingularAttribute<ChildCase, Date> dateOfoffence;
    public static volatile SingularAttribute<ChildCase, Double> longi;
    public static volatile SingularAttribute<ChildCase, Long> id;
    public static volatile SingularAttribute<ChildCase, String> agDeptFileNo;
    public static volatile SingularAttribute<ChildCase, String> nameOfTheAllegation;
    public static volatile SingularAttribute<ChildCase, String> agDatabaseRegistrationNo;
    public static volatile SingularAttribute<ChildCase, Date> createdAt;
    public static volatile SingularAttribute<ChildCase, String> description;
    public static volatile SingularAttribute<ChildCase, WebUser> retirer;
    public static volatile SingularAttribute<ChildCase, String> name;
    public static volatile SingularAttribute<ChildCase, Province> province;
    public static volatile SingularAttribute<ChildCase, String> retireComments;
    public static volatile SingularAttribute<ChildCase, Staff> supervisingOfficer;
    public static volatile SingularAttribute<ChildCase, String> caseNo;
    public static volatile SingularAttribute<ChildCase, Informant> informant;
    public static volatile SingularAttribute<ChildCase, String> policeDirectorCrimesReference;
    public static volatile SingularAttribute<ChildCase, Date> trailCommencementDate;
    public static volatile SingularAttribute<ChildCase, Category> category;
    public static volatile SingularAttribute<ChildCase, PoliceStation> policeStation;
    public static volatile SingularAttribute<ChildCase, Double> lati;
    public static volatile SingularAttribute<ChildCase, Date> dateInWhichTheReportWasReceivedByAb;
    public static volatile SingularAttribute<ChildCase, Date> retiredAt;
    public static volatile SingularAttribute<ChildCase, Staff> investigatingOfficer;

}