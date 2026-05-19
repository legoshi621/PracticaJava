package ejercicios;

public class Ejercicio4 {
    public static void main(String[] args) {

        String[][] elementos = {
                {"H", "He", "Li", "Be"},
                {"B", "C", "N", "O"},
                {"F", "Ne", "Na", "Mg"},
                {"Al", "Si", "P", "S"}
        };

        System.out.println("Elementos con filas y columnas pares:");

        for (int i = 0; i < elementos.length; i += 2) {
            for (int j = 0; j < elementos[i].length; j += 2) {
                System.out.print(elementos[i][j] + " ");
            }
            System.out.println();
        }
    }
}