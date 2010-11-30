package mvca.entity;
// Generated 30 nov. 2010 15:49:20 by Hibernate Tools 3.2.1.GA


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Voyage generated by hbm2java
 */
@Entity
@Table(name="VOYAGE"
    ,schema="ROOT"
)
public class Voyage  implements java.io.Serializable {


     private int voyageId;
     private Integer fkLocalisationDepart;
     private Integer fkLocalisationArrive;
     private Integer fkClientId;
     private Date date;

    public Voyage() {
    }

	
    public Voyage(int voyageId) {
        this.voyageId = voyageId;
    }
    public Voyage(int voyageId, Integer fkLocalisationDepart, Integer fkLocalisationArrive, Integer fkClientId, Date date) {
       this.voyageId = voyageId;
       this.fkLocalisationDepart = fkLocalisationDepart;
       this.fkLocalisationArrive = fkLocalisationArrive;
       this.fkClientId = fkClientId;
       this.date = date;
    }
   
     @Id 
    
    @Column(name="VOYAGE_ID", unique=true, nullable=false)
    public int getVoyageId() {
        return this.voyageId;
    }
    
    public void setVoyageId(int voyageId) {
        this.voyageId = voyageId;
    }
    
    @Column(name="FK_LOCALISATION_DEPART")
    public Integer getFkLocalisationDepart() {
        return this.fkLocalisationDepart;
    }
    
    public void setFkLocalisationDepart(Integer fkLocalisationDepart) {
        this.fkLocalisationDepart = fkLocalisationDepart;
    }
    
    @Column(name="FK_LOCALISATION_ARRIVE")
    public Integer getFkLocalisationArrive() {
        return this.fkLocalisationArrive;
    }
    
    public void setFkLocalisationArrive(Integer fkLocalisationArrive) {
        this.fkLocalisationArrive = fkLocalisationArrive;
    }
    
    @Column(name="FK_CLIENT_ID")
    public Integer getFkClientId() {
        return this.fkClientId;
    }
    
    public void setFkClientId(Integer fkClientId) {
        this.fkClientId = fkClientId;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="DATE", length=10)
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }




}


