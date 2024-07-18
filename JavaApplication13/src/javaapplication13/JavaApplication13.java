/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication13;

/**
 *
 * @author sebas
 */
import javax.swing.JOptionPane;
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiantes arreglo[]= new Estudiantes[1];
        for(int x=0; x< arreglo.length; x++){
            JOptionPane.showMessageDialog(null, "Se solicitaran los datos del estudiante");
            int cedula= Integer.parseInt(JOptionPane.showInputDialog(null,"Escriba la cedula: "));
            String nombre= JOptionPane.showInputDialog(null,"Ingrese su nombre: ");
            String apellidos= JOptionPane.showInputDialog(null,"Ingrese sus apellidos: ");
            arreglo [x]= new Estudiantes(cedula,nombre,apellidos);
        }
        for(int x=0;x<4;x++){
            JOptionPane.showMessageDialog(null, arreglo [x].getCedula()+" "+ arreglo[x].getNombre()+" "+ 
                    arreglo[x].getApellidos());
        }
     
    }
    
}
