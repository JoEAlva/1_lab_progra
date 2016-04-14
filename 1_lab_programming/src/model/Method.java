/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.ArrayList;
/**
 *
 * @author JorgeIgnacio
 */
public class Method {

    ArrayList<Car> arrayCar; //Reference
    public String vectorInformationCar[] = new String [4];
    
    public Method() {
        
        arrayCar = new ArrayList<Car>();
        
    }
    
    /*
    This method search a car in arraycar
    @param value of idCar
    */
    public void consultCar(String registryNumber) {
        
        if(existCar(registryNumber)) {
            
            vectorInformationCar[0] = arrayCar.get(indexCar(registryNumber)).getRegistryNumber();
            vectorInformationCar[1] = arrayCar.get(indexCar(registryNumber)).getOwnerName();
            vectorInformationCar[2] = arrayCar.get(indexCar(registryNumber)).getIdOwner();
            vectorInformationCar[3] = arrayCar.get(indexCar(registryNumber)).getIdCar();
            
        }
        
    }//End consultCar
    
    /*
    This method return the information saved into vectorInformationCar
    */
    public String[] get_vectorInformationCar() {
        
        return this.vectorInformationCar;
        
    }//End get_vectorInformationCar
    
    public void clean_vectorInformationCar() {
        vectorInformationCar[0] = "";
        vectorInformationCar[1] = "";
        vectorInformationCar[2] = "";
        vectorInformationCar[3] = "";
        
    }
    
    /*
    This add a new Car into arrayCar
    @param infoCar is a vector with car´s information
    */
    public void addCar(String infoCar[]) {
        
        Car tmp = new Car(infoCar[0], infoCar[1], infoCar[2], infoCar[3]);
        arrayCar.add(tmp);
        
    }//End addCar
    
    /*
    
    */
    public void modifyCar(String registryNumber, String infoCar[]) {
        
        if(existCar(registryNumber)) {
            
            arrayCar.get(indexCar(registryNumber)).setOwnerName(infoCar[0]);
            arrayCar.get(indexCar(registryNumber)).setIdOwner(infoCar[1]);
            arrayCar.get(indexCar(registryNumber)).setIdCar(infoCar[2]);
            
        }
        
    }//End modifyCar
    
    /*
    
    */
    public void deleteCar(String registryNumber) {
        
        arrayCar.remove(indexCar(registryNumber));
    
    }
    
    /*
    This method find a index
    @param value of idCar
    */
    public int indexCar(String registryNumber) {
        
        int index = 0;
        
        for(int j = 0; j<arrayCar.size(); j++) {
            
            if(arrayCar.get(j).getRegistryNumber().equals(registryNumber)) {
                
                index = j;
                
            }
            
        }
        
        return index;
        
    }
    
    /*
    This method know if a car exist
    @param value of idCar
    */
    public boolean existCar(String registryNumber) {
        
        boolean exist = false;
        
        for(int j = 0; j<arrayCar.size(); j++) {
            
            if(arrayCar.get(j).getRegistryNumber().equals(registryNumber)) {
                
                exist = true;
                
            }
            
        }
        
        return exist;
        
    }//End existCar
    
    /*
    
    */
    public int generateRegistryNumber() {
        
        int registryNumber = 0;
        
        if(arrayCar.isEmpty()) {
            
            registryNumber = 1;
            
        }else {
            
            for(int j = 0; j<arrayCar.size(); j++) {
                
                registryNumber = arrayCar.size()+1;
                
            }
                                    
        }
        
        return registryNumber;
        
    }//End generateRegistryNumber
        
}//End Method
