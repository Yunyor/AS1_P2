package gt.com.impoauto.Model;

import java.util.*;

/**
 * 
 */
public class VehicleEntity {

    /**
     * Default constructor
     */
    public VehicleEntity() {
    }

    /**
     * 
     */
    public int idVehicle;

    /**
     * 
     */
    public String name;

    /**
     * 
     */
    public String brand;

    /**
     * 
     */
    public float Price;

    /**
     * 
     */
    public int NumberVehicle;

    /**
     * @return
     */
    public int getIdVehicle() {
        // TODO implement here
        return this.idVehicle;
    }

    /**
     * @param idvehicle 
     * @return
     */
    public void setIdVehicle(int idvehicle) {
        // TODO implement here
        this.idVehicle = idvehicle;
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
    public String getBrand() {
        // TODO implement here
        return this.brand;
    }

    /**
     * @param brand 
     * @return
     */
    public void setBrand(String brand) {
        // TODO implement here
        this.brand=brand;
    }

    /**
     * @return
     */
    public float getPrice() {
        // TODO implement here
        return this.Price;
    }

    /**
     * @param price 
     * @return
     */
    public void setPrice(float price) {
        // TODO implement here
        this.Price=price;
    }

    /**
     * @return
     */
    public int getNumberVehicle() {
        // TODO implement here
        return this.NumberVehicle;
    }

    /**
     * @param num 
     * @return
     */
    public void setNumberVehicle(int num) {
        // TODO implement here
        this.NumberVehicle=num;
    }

}