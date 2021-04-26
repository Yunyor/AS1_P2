package gt.com.impoauto.Model;

import java.util.*;

/**
 * 
 */
public class AppointmentEntity {

    /**
     * Default constructor
     */
    public AppointmentEntity() {
    }

    /**
     * 
     */
    private int idAppointment;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private int idCompany;

    /**
     * 
     */
    private String date;

    /**
     * @return
     */
    public int getIdAppointment() {
        // TODO implement here
        return this.idAppointment;
    }

    /**
     * @param id 
     * @return
     */
    public void setIdAppointment(int id) {
        // TODO implement here
        this.idAppointment=id;
    }

    /**
     * @return
     */
    public String getName() {
        // TODO implement here
        return this.name;
    }

    /**
     * @param name 
     * @return
     */
    public void setName(String name) {
        // TODO implement here
        this.name=name;
    }

    /**
     * @return
     */
    public int getIdCompany() {
        // TODO implement here
        return this.idCompany;
    }

    /**
     * @param idCom 
     * @return
     */
    public void setIdCompany(int idCom) {
        // TODO implement here
        this.idCompany=idCom;
    }

    /**
     * @return
     */
    public String getDate() {
        // TODO implement here
        return this.date;
    }

    /**
     * @param date 
     * @return
     */
    public void setDate(String date) {
        // TODO implement here
        this.date=date;
    }

}