import java.util.Scanner;

public class Zad2 {

    public static void main(String[] args) {
        String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj hasło: ");
        String haslo = sc.nextLine();
        System.out.println("Odgadnięte hasło to: " + odgadniecieHasla(haslo, alfabet));
    }

    public static String odgadniecieHasla(String haslo, String alfabet){
        String odgadnieteHaslo = "";
        for (int i = 0; i < haslo.length(); i++) {
            for (int j = 0; j < alfabet.length(); j++) {
                if (haslo.charAt(i) == alfabet.charAt(j)) {
                    odgadnieteHaslo = odgadnieteHaslo + alfabet.charAt(j);
                } else {
                    odgadnieteHaslo = odgadnieteHaslo + "";
                }
            }

        }
        return odgadnieteHaslo;
    }

}
