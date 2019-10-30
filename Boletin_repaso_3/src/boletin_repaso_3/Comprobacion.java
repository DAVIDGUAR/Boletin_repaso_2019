/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_repaso_3;

import javax.swing.JOptionPane;

/**
 *
 * @author drodriguezguardiola
 */
public class Comprobacion {
    
    int num;
    
    boolean a=true;

    public Comprobacion(int num) {
        this.num = num;
    }

    public Comprobacion() {
    }
    
    
    
    
    
    public void comprobacion_numero(){
        
        if (num==0){
            
            JOptionPane.showMessageDialog(null,"FIN");
            
        }else{
            
            System.out.println("El numero introducido es : "+num);
            
            
        }
        
        
    }

    public void setNum() {
        
        
        
        while(a){
        
        this.num = Integer.parseInt(JOptionPane.showInputDialog("Introduce numero"));
        
        
           if (num==0){
            
            JOptionPane.showMessageDialog(null,"FIn del programa");
            
            a=false;
            
        }else{
            
            System.out.println("El numero introducido es : "+num);
            
            
        }
        
    }
    }
    
    
    
    
    
}
