import java.util.Arrays;
import java.util.Random;

public class Zad6SladMacierzy {

    public static void main(String[] args) {
        Random gen = new Random();
        int wymiar = 5;
        int[][] macierzKwadratowa = new int[wymiar][wymiar];
        for (int i = 0; i < wymiar; i++) {
            for (int j = 0; j < wymiar; j++) {
                macierzKwadratowa[i][j] = gen.nextInt(16) - 10;
            }
        }
        System.out.println("Macierz kwadratowa liczb całkowitych z zakresu [-10, 5]: " + Arrays.deepToString(macierzKwadratowa));
        System.out.println();
        System.out.println("ślad powyższej macierzy kwadratowej o wymiarach " + wymiar + "x" + wymiar + " wynosi = " + sladMacierzy(macierzKwadratowa, wymiar));
    }

    public  static int sladMacierzy(int[][] macierzKwadratowa, int wymiar){
        int suma = 0;
        for (int i = 0; i < wymiar; i++) {
            for (int j = 0; j < wymiar; j++) {
                if(i == j)
                    suma += macierzKwadratowa[i][j];
            }
        }
    return suma;
    }
}
