package Wyklad2;

public class Zad2 {

    public static int N = 20;
    public static double x = 10;
    public static void main(String[] args) {
        System.out.println(sumaCzesciowaI(x, N));
    }

    public static double factorial(int n){
        long factor = 1;
        for(int i = 2; i <= n; i++) {
            factor *= i; //   factor = i*factor
        }
        return factor;
    }

    public static double sumaCzesciowaI(double x, int n){
        double sumaDodatnie = 1;
        double sumaUjemne = 0;
        for (int i = 1; i <= n; i++){
            if(i%2 == 0)
                sumaDodatnie += Math.pow(x, i)/factorial(i);
            else if(i%2 != 0)
                sumaUjemne -= Math.pow(x, i)/factorial(i);
        }
return sumaDodatnie + sumaUjemne;
    }
}
