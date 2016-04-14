/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import view.FRM_Main;
/**
 *
 * @author JorgeIgnacio
 */
public class Controller_Main implements ActionListener {

    FRM_Main fRM_Main;//Reference
    
    public Controller_Main(FRM_Main fRM_Main) {
        this.fRM_Main = fRM_Main;
    }
   
    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand().equals("CONSULT")) {
            System.out.print("F");
        }
        
        if(e.getActionCommand().equals("ADD")) {
            System.out.print("F");
        }
        
        if(e.getActionCommand().equals("MODIFY")) {
            System.out.print("F");
        }
        
        if(e.getActionCommand().equals("DELETE")) {
            System.out.print("F");
        }
        
    }
    
}//End Controller_Main
