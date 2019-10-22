import java.util.Scanner;

public class Zad1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Witaj! Wpisz swój dochód: ");
        int dochod = sc.nextInt();
        System.out.println("Musisz zapłacić podatek w wysokości: " + liczeniePodatku(dochod));
    }

    public static double liczeniePodatku(double dochod){
        double podatek = 0;
                if(dochod < 11000)
                    podatek = dochod*0;
                else if(dochod >= 11000 && dochod < 18000)
                    podatek = dochod*0.25;
                else if(dochod >= 18000 && dochod < 31000)
                    podatek = dochod*0.35;
                else if(dochod >= 31000 && dochod < 60000)
                    podatek = dochod*0.42;
                else if(dochod >= 60000 && dochod < 90000)
                    podatek = dochod*0.48;
                else if(dochod >= 90000 && dochod < 1000000)
                    podatek = dochod*0.50;
                else if(dochod >= 1000000)
                    podatek = dochod*0.55;
                return podatek;
    }
}
