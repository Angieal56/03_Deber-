/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kelly
 */
public class Vehiculos {

 class Vehiculos {
    // Atributos:
    public String marca;
    public String modelo;
    public int year;
    private String placa;

    // Constructor
    public Vehiculo(String marca, String modelo, int year, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.placa = placa;
    }

    // Métodos
    public void arrancar() {
        System.out.println("Vehiculo está en movimiento...");
    }

    public void detener() {
        System.out.println("Vehiculo esta estacionado");
    }
}
}
