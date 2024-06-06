/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import javax.swing.JOptionPane;
/**
 *
 * @author sebas
 */
public class Programaparasacarpromedios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        JOptionPane.showMessageDialog(null,"Bienvenido " +nombre+ " este es un programa para calcular el promedio de numeros");
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el primer numero:"));
        int num2= Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el segundo numero:"));
        int num3= Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el tercer numero:"));
        int num4= Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el cuarto numero:"));
        double promedio= (num1+num2+num3+num4) / 4;
        JOptionPane.showMessageDialog(null,"El promedio es de: "+promedio);
        
    }
    
}
