import java.math.BigInteger;
import java.util.Arrays;

public class Cwiczenie {
    public static double x = 0.5;
    public static int N = 1;//2, 3, 4, 5, 6, 30;
    public static double trueValue = Math.exp(x);
    public static double sigmaS = 0.1;

//    metoda obliczająca silnię z liczby n za pomocą pętli for (poprawna dla n <= 20)
    public static long factorialUsingForLoop(int n){
        long factor = 1;
        for(int i = 2; i <= n; i++) {
            factor *= i; //   factor = i*factor
        }
        return factor;
    }

//    metoda obliczająca silnię z liczby n za pomocą pętli for (dla n > 20) BIGINTIGER
    public static BigInteger factorialHavingLargeResult(int n){
        BigInteger result = BigInteger.ONE;
        for(int i = 2; i <= n; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

//    metoda obliczajaca przybliżoną wartość (aproksymację) rozwinięcia Maclaurina
    public static double approximation(double x, int n){
        double suma = 1;
        for(int i = 1; i <= n; i++){
            suma += Math.pow(x, i)/factorialUsingForLoop(i);
        }
        return suma;
    }

    public static double truePercentRelativeError(double truValue, double approximation){
        double sigmaT = ((truValue - approximation)/truValue)*100;
        return sigmaT;
    }

    public static double approximatePercentRelativeError(int N){
        double sigmaA = ((approximation(x, N) - approximation(x, N - 1))/approximation(x, N))*100;
        return sigmaA;
    }

    public static double approximationSigmaS(double x, double sigmaS){
        double suma = 1;
        int licznik = 1;
        while (approximatePercentRelativeError(licznik) > sigmaS) {
            suma += Math.pow(x, licznik)/factorialUsingForLoop(licznik);
            ++licznik;
        }
        return suma;
    }

    public static void main(String[] args) {
        System.out.println("N = " + N);
        System.out.println("x = " + x);
        System.out.println("Silnia (z użyciem klasy BigInteger) = " + factorialHavingLargeResult(N));
        System.out.print("Silnia = ");
        System.out.println(factorialUsingForLoop(N));
        System.out.println("Prawdziwa wartość = " + trueValue);
        System.out.println("Suma częściowa (rozwnięcie Maclaurina) = " + approximation(x, N));
        System.out.println("True percent relative error (%) = " + truePercentRelativeError(trueValue, approximation(x, N)));
        System.out.println("Approximate percent relative error (%) = " + approximatePercentRelativeError(N));
        System.out.println("Suma częściowa, która obliczona jest do czasu, gdy sigma A > sigma S (sigma S = "+ sigmaS + ") = " + approximationSigmaS(x, sigmaS));
    }
}
