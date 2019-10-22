import java.util.Arrays;
import java.util.Random;

public class Zad5rzutKostka {
    public static void main(String[] args) {
        Random gen = new Random();
        int wymiarTablicy = 10;
        int[] tablicaRzutow = new int[wymiarTablicy];
        for (int i = 0; i < wymiarTablicy; i++) {
            tablicaRzutow[i] = rzutKostka(gen);
        }
        System.out.println(Arrays.toString(tablicaRzutow));
        double[] tablicaPrawdopodobienstw = new double[6];
        for (int i = 0; i < tablicaPrawdopodobienstw.length; i++) {
            tablicaPrawdopodobienstw[i] = prawdopodobienstwoWyrzucenia(tablicaRzutow, i+1); //
        }
        System.out.println("Tablica prawdopodobieństw wyrzucenia danej liczby oczek w 10 rzutach kostką");
        System.out.println("(pierwsza wartość w tabeli odpowiada prawdopodobieństwu wyrzucenia 1 oczka itd.): ");
        System.out.println(Arrays.toString(tablicaPrawdopodobienstw));
    }

    public static int rzutKostka(Random gen){
        int wynikRzutu = gen.nextInt(6) + 1;
        return wynikRzutu;
    }

    public static double prawdopodobienstwoWyrzucenia(int[] tablicaRzutow, int wartoscRzutu){
        double licznik = 0; //liczba wyrzuconych oczek w 10 rzutach
        for (int i = 0; i < tablicaRzutow.length; i++) {
            if(tablicaRzutow[i] == wartoscRzutu) //inkrementacja licznika, jeżeli wartość w tablicy rzutów jest równa zadanej w argumencie metody wartosci rzutu
                licznik++;
        }
        double prawdopodobienstwo = licznik/(double)tablicaRzutow.length;
        return prawdopodobienstwo;
    }
}
