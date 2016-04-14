/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import view.FRM_Main;
import model.Method;

/**
 *
 * @author JorgeIgnacio
 */
public class Controller_Main implements ActionListener {
    //Hola
    FRM_Main fRM_Main;//Reference
    Method method;//Reference
    
    public Controller_Main(FRM_Main fRM_Main) {
        
        this.fRM_Main = fRM_Main;
        method = new Method();
        fRM_Main.addRegisterNumber(""+method.generateRegistryNumber());
    }
   
    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand().equals("CONSULT")) {
            
            method.consultCar(fRM_Main.get_jT_RegistryNumber());
            fRM_Main.set_jT_CarInformation(method.get_vectorInformationCar());
            method.clean_vectorInformationCar();
            fRM_Main.afterConsult();
            
        }
        
        if(e.getActionCommand().equals("ADD")) {
                
                method.addCar(fRM_Main.get_jT_CarInformation());
                fRM_Main.clean_jT();
                fRM_Main.addRegisterNumber(""+method.generateRegistryNumber());
                fRM_Main.afterAdd(); 
            
        }
        
        if(e.getActionCommand().equals("MODIFY")) {
            
            method.modifyCar(fRM_Main.get_jT_RegistryNumber(), fRM_Main.get_jT_CarInformation());
            fRM_Main.clean_jT();
            fRM_Main.addRegisterNumber(""+method.generateRegistryNumber());
            fRM_Main.afterModify_or_Delete();
                       
        }
        
        if(e.getActionCommand().equals("DELETE")) {
            
            method.deleteCar(fRM_Main.get_jT_RegistryNumber());
            fRM_Main.clean_jT();
            fRM_Main.addRegisterNumber(""+method.generateRegistryNumber());
            fRM_Main.afterModify_or_Delete();
            
        }
        
    }
    
    public void getMethodConsult() {
        
        method.consultCar(fRM_Main.get_jT_RegistryNumber());
        fRM_Main.set_jT_CarInformation(method.get_vectorInformationCar());
        fRM_Main.afterConsult();
        
    }
    
}//End Controller_Main
