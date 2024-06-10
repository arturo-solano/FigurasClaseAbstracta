/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

public class Hexagono extends Figura {
    private double lado;

    // Constructor que inicializa el color y el lado del hexágono
    public Hexagono(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    // Implementación del método para calcular el perímetro
    @Override
    public double calcularPerimetro() {
        return 6 * lado;
    }

    // Implementación del método para calcular el área
    @Override
    public double calcularArea() {
        return (3 * Math.sqrt(3) * Math.pow(lado, 2)) / 2;
    }
}

