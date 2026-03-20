/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadsemana14;


   import java.util.Scanner;

public class Compra {
    // Función que calcula el total
    public static double calcularTotal(double precio, int cantidad) {
        double total = precio * cantidad;
        return total;
    }
    
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
          // Entrada de datos
        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        
         System.out.print("Ingrese la cantidad: ");
        int cantidad = sc.nextInt();

         // Llamada a la función
        double resultado = calcularTotal(precio, cantidad);
        
        // Mostrar resultado
        System.out.println("El precio total a pagar es: " + resultado);
    }
    
}
