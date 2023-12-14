/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kelly
 */
public class Carro {
    class Carro extends Vehiculos {
    // Atributos
    public int numPuertas;
    public String tipoCombustible;

    // Constructor
    public Carro(String marca, String modelo, int anio, String placa, int numPuertas, String tipoCombustible) {
       
    }

    // Métodos
    public void acelerar() {
        System.out.println("Carro acelerando...");
    }

    public void frenar() {
        System.out.println("Carro frenando...");
    }
}

}
