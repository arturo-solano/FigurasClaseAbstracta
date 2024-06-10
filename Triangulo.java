/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

public class Triangulo extends Figura {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(String color, double lado1, double lado2, double lado3) {
        super(color);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    public Triangulo(String color, double lado){
    super(color);
    this.lado1=lado;
    this.lado2=lado;
    this.lado3=lado;
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    @Override
    public double calcularArea() {
        // Usamos la fórmula de Herón para calcular el área del triángulo
        double s = calcularPerimetro() / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }
}