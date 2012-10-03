/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ncpa.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author Buddhika
 */
@Entity
public class ChildCase implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
    
    
    //Main Properties
    String name;
    String description;
    //Created Properties
    @ManyToOne
    WebUser creater;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    Date createdAt;
    //Retairing properties
    boolean retired;
    @ManyToOne
    WebUser retirer;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    Date retiredAt;
    String retireComments;
    @ManyToOne
    Category category;
//    List<Informant> victims;
//    List<Suspect> suspects;
//    List<String> suspectSpositiOnvizVictim;
    
    @ManyToOne
    Staff investigatingOfficer;
    @ManyToOne
    Court traialCourt;
    String agDatabaseRegistrationNo;
    String agDeptFileNo;
    String policeDirectorCrimesReference;
    @ManyToOne
    PoliceStation policeStation;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date dateOfComplaintFirstInformation;
    @ManyToOne
    Informant informant;
    @Lob
    String nameOfTheAllegation;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date dateOfoffence;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date dateInWhichTheReportWasReceivedByAb;
    String breportNo;
    @ManyToOne
    Staff supervisingOfficer;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date dateOnWhichTheIbesWereReceived;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date dateOnWhichTheMlrWasReceived;
    String locationOfTheIncident;
    @Lob
    String agsDecision;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date dateoftheindictment;
    String caseNo;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date trailCommencementDate;
    
    /**
     * 
     * 
     * @return 
     */
    double longi;
    double lati;
    
    @ManyToOne
    Province province;

    @ManyToOne
    Court court;

    public Court getCourt() {
        return court;
    }

    public void setCourt(Court court) {
        this.court = court;
    }
    
    
    
    
    public double getLati() {
        return lati;
    }

    public void setLati(double lati) {
        this.lati = lati;
    }

    public double getLongi() {
        return longi;
    }

    public void setLongi(double longi) {
        this.longi = longi;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }
    
    
    
    
    
    public String getAgDatabaseRegistrationNo() {
        return agDatabaseRegistrationNo;
    }

    public void setAgDatabaseRegistrationNo(String agDatabaseRegistrationNo) {
        this.agDatabaseRegistrationNo = agDatabaseRegistrationNo;
    }

    public String getAgDeptFileNo() {
        return agDeptFileNo;
    }

    public void setAgDeptFileNo(String agDeptFileNo) {
        this.agDeptFileNo = agDeptFileNo;
    }

    public String getAgsDecision() {
        return agsDecision;
    }

    public void setAgsDecision(String agsDecision) {
        this.agsDecision = agsDecision;
    }

    public String getBreportNo() {
        return breportNo;
    }

    public void setBreportNo(String breportNo) {
        this.breportNo = breportNo;
    }

   

    public String getCaseNo() {
        return caseNo;
    }

    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public WebUser getCreater() {
        return creater;
    }

    public void setCreater(WebUser creater) {
        this.creater = creater;
    }

    public Date getDateInWhichTheReportWasReceivedByAb() {
        return dateInWhichTheReportWasReceivedByAb;
    }

    public void setDateInWhichTheReportWasReceivedByAb(Date dateInWhichTheReportWasReceivedByAb) {
        this.dateInWhichTheReportWasReceivedByAb = dateInWhichTheReportWasReceivedByAb;
    }

    public Date getDateOfComplaintFirstInformation() {
        return dateOfComplaintFirstInformation;
    }

    public void setDateOfComplaintFirstInformation(Date dateOfComplaintFirstInformation) {
        this.dateOfComplaintFirstInformation = dateOfComplaintFirstInformation;
    }

    public Date getDateOfoffence() {
        return dateOfoffence;
    }

    public void setDateOfoffence(Date dateOfoffence) {
        this.dateOfoffence = dateOfoffence;
    }

    public Date getDateOnWhichTheMlrWasReceived() {
        return dateOnWhichTheMlrWasReceived;
    }

    public void setDateOnWhichTheMlrWasReceived(Date dateOnWhichTheMlrWasReceived) {
        this.dateOnWhichTheMlrWasReceived = dateOnWhichTheMlrWasReceived;
    }

    public Date getDateoftheindictment() {
        return dateoftheindictment;
    }

    public void setDateoftheindictment(Date dateoftheindictment) {
        this.dateoftheindictment = dateoftheindictment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Informant getInformant() {
        return informant;
    }

    public void setInformant(Informant informant) {
        this.informant = informant;
    }

    public Staff getInvestigatingOfficer() {
        return investigatingOfficer;
    }

    public void setInvestigatingOfficer(Staff investigatingOfficer) {
        this.investigatingOfficer = investigatingOfficer;
    }


    public String getLocationOfTheIncident() {
        return locationOfTheIncident;
    }

    public void setLocationOfTheIncident(String locationOfTheIncident) {
        this.locationOfTheIncident = locationOfTheIncident;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameOfTheAllegation() {
        return nameOfTheAllegation;
    }

    public void setNameOfTheAllegation(String nameOfTheAllegation) {
        this.nameOfTheAllegation = nameOfTheAllegation;
    }

    public String getPoliceDirectorCrimesReference() {
        return policeDirectorCrimesReference;
    }

    public void setPoliceDirectorCrimesReference(String policeDirectorCrimesReference) {
        this.policeDirectorCrimesReference = policeDirectorCrimesReference;
    }

    public PoliceStation getPoliceStation() {
        return policeStation;
    }

    public void setPoliceStation(PoliceStation policeStation) {
        this.policeStation = policeStation;
    }

    public String getRetireComments() {
        return retireComments;
    }

    public void setRetireComments(String retireComments) {
        this.retireComments = retireComments;
    }

    public boolean isRetired() {
        return retired;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }

    public Date getRetiredAt() {
        return retiredAt;
    }

    public void setRetiredAt(Date retiredAt) {
        this.retiredAt = retiredAt;
    }

    public WebUser getRetirer() {
        return retirer;
    }

    public void setRetirer(WebUser retirer) {
        this.retirer = retirer;
    }

    public Date getDateOnWhichTheIbesWereReceived() {
        return dateOnWhichTheIbesWereReceived;
    }

    public void setDateOnWhichTheIbesWereReceived(Date dateOnWhichTheIbesWereReceived) {
        this.dateOnWhichTheIbesWereReceived = dateOnWhichTheIbesWereReceived;
    }

    public Staff getSupervisingOfficer() {
        return supervisingOfficer;
    }

    public void setSupervisingOfficer(Staff supervisingOfficer) {
        this.supervisingOfficer = supervisingOfficer;
    }

    public Court getTraialCourt() {
        return traialCourt;
    }

    public void setTraialCourt(Court traialCourt) {
        this.traialCourt = traialCourt;
    }

    public Date getTrailCommencementDate() {
        return trailCommencementDate;
    }

    public void setTrailCommencementDate(Date trailCommencementDate) {
        this.trailCommencementDate = trailCommencementDate;
    }
    
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ChildCase)) {
            return false;
        }
        ChildCase other = (ChildCase) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ncpa.entity.Case[ id=" + id + " ]";
    }
    
}
