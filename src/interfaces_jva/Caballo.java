/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces_jva;

/**
 *
 * @author Gian Marrufo
 */
public class Caballo implements IAnimal {
    
    // Método particular de la clase Caballo
    public void pastar() {
        System.out.println("El caballo está pastando.");
    }
    
    @Override
    public void dormir() {
        System.out.println("El caballo está durmiendo.");
    }

    @Override
    public void correr() {
        System.out.println("El caballo está corriendo.");
    }

    @Override
    public void alimentarse() {
        pastar();  // El caballo debe pastar antes de alimentarse
        System.out.println("El caballo se está alimentando de pasto.");
    }

}
