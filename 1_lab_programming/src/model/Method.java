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
    String vectorInformationCar[] = new String [4];
    
    public Method() {
        
        arrayCar = new ArrayList<Car>();
        
    }
    
    /*
    This method search a car in arraycar
    @param value of idCar
    */
    public void consultCar(String idCar) {
        
        if(existCar(idCar)) {
            
            vectorInformationCar[0] = arrayCar.get(indexCar(idCar)).getRegistryNumber();
            vectorInformationCar[1] = arrayCar.get(indexCar(idCar)).getOwnerName();
            vectorInformationCar[2] = arrayCar.get(indexCar(idCar)).getIdOwner();
            vectorInformationCar[3] = arrayCar.get(indexCar(idCar)).getIdCar();
            
        }
        
    }//End consultCar
    
    /*
    This method return the information saved into vectorInformationCar
    */
    public String[] get_vectorInformationCar() {
        
        return this.vectorInformationCar;
        
    }//End get_vectorInformationCar
    
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
    public void modifyCar(String inforCar[]) {
        
        
        
    }//End modifyCar
    
    /*
    This method find a index
    @param value of idCar
    */
    public int indexCar(String idCar) {
        
        int index = 0;
        
        for(int j = 0; j<arrayCar.size(); j++) {
            
            if(arrayCar.get(j).getIdCar().equals(idCar)) {
                
                index = j;
                
            }
            
        }
        
        return index;
        
    }
    
    /*
    This method know if a car exist
    @param value of idCar
    */
    public boolean existCar(String idCar) {
        
        boolean exist = false;
        
        for(int j = 0; j<arrayCar.size(); j++) {
            
            if(arrayCar.get(j).getIdCar().equals(idCar)) {
                
                exist = true;
                
            }
            
        }
        
        return exist;
        
    }//End existCar
        
}//End Method
