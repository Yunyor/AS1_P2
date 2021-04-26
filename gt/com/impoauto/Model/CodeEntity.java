package gt.com.impoauto.Model;

import java.util.*;

/**
 * 
 */
public class CodeEntity {

    /**
     * Default constructor
     */
    public CodeEntity() {
    }

    /**
     * 
     */
    private int idcode;

    /**
     * 
     */
    private int number;

    /**
     * 
     */
    private int idCompany;

    /**
     * @return
     */
    public int getIdcode() {
        // TODO implement here
        return this.idcode;
    }

    /**
     * @param idCode 
     * @return
     */
    public void setId(int idCode) {
        // TODO implement here
        this.idcode=idCode;
    }

    /**
     * @return
     */
    public int getNumber() {
        // TODO implement here
        return this.number;
    }

    /**
     * @param number 
     * @return
     */
    public void setNumber(int number) {
        // TODO implement here
        this.number=number;
    }

    /**
     * @return
     */
    public int getId() {
        // TODO implement here
        return this.idCompany;
    }

    /**
     * @param idCompany 
     * @return
     */
    public void setIdCompany(int idCompany) {
        // TODO implement here
        this.idCompany=idCompany;
    }

}