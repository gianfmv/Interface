/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfaces_jva;

/**
 *
 * @author Gian Marrufo
 */
public class Interfaces_jva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        IAnimal leon = new Leon();
        IAnimal caballo = new Caballo();

        // Comportamiento del león
        leon.correr();
        leon.alimentarse();
        leon.dormir();

        System.out.println();

        // Comportamiento del caballo
        caballo.correr();
        caballo.alimentarse();
        caballo.dormir();
    }
    
}
