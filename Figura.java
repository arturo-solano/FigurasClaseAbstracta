/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

public abstract class Figura {
    // Atributo para almacenar el color de la figura
    private String color;

    // Constructor para inicializar el color
    public Figura(String color) {
        this.color = color;
    }

    // Método para recuperar el color
    public String getColor() {
        return color;
    }

    // Método abstracto para calcular el perímetro
    public abstract double calcularPerimetro();

    // Método abstracto para calcular el área
    public abstract double calcularArea();
}

