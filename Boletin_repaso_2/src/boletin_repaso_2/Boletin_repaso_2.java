/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_repaso_2;

import javax.swing.JOptionPane;

/**
 *
 * @author drodriguezguardiola
 */
public class Boletin_repaso_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int  mi_array []=new int[5];
       
       for(int i=0;i<mi_array.length;i++){
           
           i=Integer.parseInt(JOptionPane.showInputDialog("Introduce numeros"));
           
       }
        
       for(int i=0;i<mi_array.length;i++){
           
           System.out.println("Numeros = "+i);
           
           
       }
       
        
    }
    
}
