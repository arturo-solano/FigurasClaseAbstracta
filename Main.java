/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author R2-D2
 */
public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Hexagono
        Hexagono hexagono;
        hexagono = new Hexagono("rojo", 5.0);
        Triangulo triangulo = new Triangulo("azul", 5.0);
        Rectangulo rectangulo = new Rectangulo("amarillo", 4.0,5.0);
        Circulo circulo = new Circulo("verde", 8.0);
        

        // Imprimir el color, perímetro y área del hexágono
        System.out.println("Color del hexágono: " + hexagono.getColor());
        System.out.println("Perímetro del hexágono: " + hexagono.calcularPerimetro());
        System.out.println("Área del hexágono: " + hexagono.calcularArea());
        
        // Imprimir el color, perímetro y área del triangulo
        System.out.println("Color del hexágono: " + triangulo.getColor());
        System.out.println("Perímetro del hexágono: " + triangulo.calcularPerimetro());
        System.out.println("Área del hexágono: " + triangulo.calcularArea());
        
         // Imprimir el color, perímetro y área del circulo
        System.out.println("Color del hexágono: " + circulo.getColor());
        System.out.println("Perímetro del hexágono: " + circulo.calcularPerimetro());
        System.out.println("Área del hexágono: " + circulo.calcularArea());
        
         // Imprimir el color, perímetro y área del rectangulo
        System.out.println("Color del hexágono: " + rectangulo.getColor());
        System.out.println("Perímetro del hexágono: " + rectangulo.calcularPerimetro());
        System.out.println("Área del hexágono: " + rectangulo.calcularArea());
    }
}
