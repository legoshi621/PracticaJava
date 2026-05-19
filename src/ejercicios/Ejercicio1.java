package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Partidos ganados:");
        int ganados = sc.nextInt();

        System.out.println("Partidos empatados:");
        int empatados = sc.nextInt();

        System.out.println("Partidos perdidos:");
        int perdidos = sc.nextInt();

        int puntos = (ganados * 3) + (empatados * 1);

        System.out.println("Puntos obtenidos: " + puntos);
    }
}