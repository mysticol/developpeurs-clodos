package pojos;
// Generated 30 nov. 2010 15:49:20 by Hibernate Tools 3.2.1.GA


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ReservationManif generated by hbm2java
 */
@Entity
@Table(name="RESERVATION_MANIF"
    ,schema="ROOT"
)
public class ReservationManif  implements java.io.Serializable {


     private int reservationManifId;
     private Date date;
     private Integer fkIdClient;
     private Integer fkIdManif;

    public ReservationManif() {
    }

	
    public ReservationManif(int reservationManifId) {
        this.reservationManifId = reservationManifId;
    }
    public ReservationManif(int reservationManifId, Date date, Integer fkIdClient, Integer fkIdManif) {
       this.reservationManifId = reservationManifId;
       this.date = date;
       this.fkIdClient = fkIdClient;
       this.fkIdManif = fkIdManif;
    }
   
     @Id 
    
    @Column(name="RESERVATION_MANIF_ID", unique=true, nullable=false)
    public int getReservationManifId() {
        return this.reservationManifId;
    }
    
    public void setReservationManifId(int reservationManifId) {
        this.reservationManifId = reservationManifId;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="DATE", length=10)
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    
    @Column(name="FK_ID_CLIENT")
    public Integer getFkIdClient() {
        return this.fkIdClient;
    }
    
    public void setFkIdClient(Integer fkIdClient) {
        this.fkIdClient = fkIdClient;
    }
    
    @Column(name="FK_ID_MANIF")
    public Integer getFkIdManif() {
        return this.fkIdManif;
    }
    
    public void setFkIdManif(Integer fkIdManif) {
        this.fkIdManif = fkIdManif;
    }




}


