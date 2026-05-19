package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el sueldo:");
        double sueldo = sc.nextDouble();
        double descuento;

        if (sueldo < 500) {
            descuento = 0;
        } else if (sueldo < 750) {
            descuento = sueldo * 0.05;
        } else {
            descuento = sueldo * 0.10;
        }

        System.out.println("Descuento de renta: $" + descuento);
    }
}