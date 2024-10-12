/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces_jva;

/**
 *
 * @author Gian Marrufo
 */
public class Leon implements IAnimal {
    
    // Método particular de la clase Leon
    public void cazar() {
        System.out.println("El león está cazando.");
    }
    
    @Override
    public void dormir() {
        System.out.println("El león está durmiendo.");
    }

    @Override
    public void correr() {
        System.out.println("El león está corriendo.");
    }

    @Override
    public void alimentarse() {
        cazar();  // El león debe cazar antes de alimentarse
        System.out.println("El león se está alimentando de su presa.");
    }

}
