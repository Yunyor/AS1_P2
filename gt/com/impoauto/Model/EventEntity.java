package gt.com.impoauto.Model;

import java.util.*;

/**
 * 
 */
public class EventEntity {

    /**
     * Default constructor
     */
    public EventEntity() {
    }

    /**
     * 
     */
    public int idEvent;

    /**
     * 
     */
    public String name;

    /**
     * 
     */
    public String date;

    /**
     * 
     */
    public int idCompany;

    /**
     * 
     */
    public String address;

    /**
     * @return
     */
    public int getIdEvent() {
        // TODO implement here
        return this.idEvent;
    }

    /**
     * @param id 
     * @return
     */
    public void setIdEvent(int id) {
        // TODO implement here
        this.idEvent=id;
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
    public String getAddress() {
        // TODO implement here
        return this.address;
    }

    /**
     * @param address 
     * @return
     */
    public void setAddress(String address) {
        // TODO implement here
        this.address=address;
    }

}