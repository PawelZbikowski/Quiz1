import java.lang.reflect.Array;
import java.util.Arrays;

public class Zad7tablice {

    public static int wymiar = 4;

    public static void main(String[] args) {
        System.out.println("a) I tablica dwuwymiarowa: " + Arrays.deepToString(tablica1()));
        System.out.println("b) II tablica dwuwymiarowa: " + Arrays.deepToString(tablica2()));
        System.out.println("c) III tablica dwuwymiarowa: " + Arrays.deepToString(tablica3()));
    }

    public static int[][] tablica1(){
        int[][] macierz = new int[wymiar][wymiar];
        for (int i = 0; i < wymiar; i++) {
            for (int j = 0; j < wymiar; j++) {
                if(j == i + 1)
                macierz[i][j] = 1;
            }
        }
        return macierz;
    }

    public static int[][] tablica2(){
        int[][] macierz = new int[wymiar][wymiar];
        for (int i = 0; i < wymiar; i++) {
            for (int j = 0; j < wymiar; j++) {
                if(j == 1)
                    macierz[i][j] = 1;
            }
        }
        return macierz;
    }

    public static int[][] tablica3(){
        int[][] macierz = new int[wymiar][wymiar];
        for (int i = 0; i < wymiar; i++) {
            for (int j = 0; j < wymiar; j++) {
                if(j == wymiar - 1 - i)
                    macierz[i][j] = 1;
            }
        }
        return macierz;
    }
}
