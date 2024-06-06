/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import javax.swing.JOptionPane;
/**
 *
 * @author Aulas Heredia
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double promedio = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite la nota final del curso anterior")); 
        if (promedio < 70){
            JOptionPane.showMessageDialog(null,"No aprobo el curso");
        }else{
          JOptionPane.showMessageDialog(null,"Aprobo el curso");  
        }
    }  
}
