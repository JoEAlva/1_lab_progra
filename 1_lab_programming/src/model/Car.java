/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author JorgeIgnacio
 */
public class Car {
    
    private String registryNumber;
    private String ownerName;
    private String idOwner;
    private String idCar;

    public Car(String registryNumber, String ownerName, String idOwner, String idCar) {
        this.registryNumber = registryNumber;
        this.ownerName = ownerName;
        this.idOwner = idOwner;
        this.idCar = idCar;
    }

    public String getRegistryNumber() {
        return registryNumber;
    }

    public void setRegistryNumber(String registryNumber) {
        this.registryNumber = registryNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(String idOwner) {
        this.idOwner = idOwner;
    }

    public String getIdCar() {
        return idCar;
    }

    public void setIdCar(String idCar) {
        this.idCar = idCar;
    }
    
        
}//End Car
