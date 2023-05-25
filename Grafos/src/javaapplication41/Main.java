import java.util.Scanner;
//K.J Guzmán Ramirez 7690-21-2903 Universidad Mariano Gálvez
//I.R Elmer Eduardo 7690-21-10969 Universidad Mariano Gálvez
//H.G Santos Genaro 7690-21-21318 Universidad Mariano Gálvez
//J.C José    Medina 7690-20-1729 Universidad Mariano Gálvez

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Agregue el número de vértices del grafo ");
        int numer = scanner.nextInt();
        int[][] matriz = new int[numer][numer];


        for (int i = 0; i < numer; i++) {
            for (int j = 0; j < numer; j++) {
                if (i != j) {
                    System.out.print("Ingrese la longitud del vertice,  "  +  " del vértice " + (i + 1)  +  " al vértice " + (j + 1) + ": " );
                    matriz[i][j] = scanner.nextInt();
                }            }
        }
        System.out.println("Matriz de adyacencia:");
        for (int i = 0; i < numer; i++) {
            for (int j = 0; j < numer; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

