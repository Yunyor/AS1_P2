package gt.com.impoauto.Model;

import java.util.*;

/**
 * 
 */
public class UserEntity {

    /**
     * Default constructor
     */
    public UserEntity() {
    }

    /**
     * 
     */
    private int id;

    /**
     * 
     */
    private String fullname;

    /**
     * 
     */
    private String direction;

    /**
     * 
     */
    private String mail;

    /**
     * @return
     */
    public int getId() {
        // TODO implement here
        return this.id;
    }

    /**
     * @param id 
     * @return
     */
    public void setId(int id) {
        // TODO implement here
         this.id=id;
    }

    /**
     * @return
     */
    public String getFullname() {
        // TODO implement here
        return this.fullname;
    }

    /**
     * @param fullName 
     * @return
     */
    public void setFullname(String fullName) {
        // TODO implement here
        this.fullname=fullname;
    }

    /**
     * @return
     */
    public String getDirection() {
        // TODO implement here
        return this.direction;
    }

    /**
     * @param direction 
     * @return
     */
    public void setDirection(String direction) {
        // TODO implement here
        this.direction=direction;
    }

    /**
     * @return
     */
    public String getMail() {
        // TODO implement here
        return this.mail;
    }

    /**
     * @param mail 
     * @return
     */
    public void setMail(String mail) {
        // TODO implement here
        this.mail=mail;
    }

}