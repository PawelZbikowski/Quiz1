import java.util.Scanner;

public class Zad4wzorSumaryczny {

    public static int licznikC = 0;
    public static int licznikH = 0;
    public static int licznikN = 0;
    public static int licznikO = 0;
    public static int licznikP = 0;
    public static int licznikS = 0;

    public static void main(String[] args) {
        System.out.println("Proszę wpisać wzór strukturalny oraz nazwę związku w postaci: " +
                "(wzór strukturalny, nazwa zmiązku)"); //HSCHHCHNHHCOOH, cysteina
        Scanner sc = new Scanner(System.in);
        String wzorStruktNazwa = sc.nextLine();
        String[] zwiazekTabela = wzorStruktNazwa.split(", ");
        System.out.println("Wzór sumaryczny - " +
                zwiazekTabela[1] + ": " + wzorSumaryczny(zwiazekTabela));

    }

    public static String wzorSumaryczny(String[] zwiazekTabela){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < zwiazekTabela[0].length(); i++) {
            if(zwiazekTabela[0].charAt(i) == 'C')
                licznikC++;
            else if(zwiazekTabela[0].charAt(i) == 'H')
                licznikH++;
            else if(zwiazekTabela[0].charAt(i) == 'O')
                licznikO++;
            else if(zwiazekTabela[0].charAt(i) == 'N')
                licznikN++;
            else if(zwiazekTabela[0].charAt(i) == 'P')
                licznikP++;
            else if(zwiazekTabela[0].charAt(i) == 'S')
                licznikS++;
        }
        if(licznikC != 0)
            sb.append("C"+licznikC);
        if(licznikH != 0)
            sb.append("H"+licznikH);
        if(licznikO != 0)
            sb.append("O"+licznikO);
        if(licznikN != 0)
            sb.append("N"+licznikN);
        if(licznikP != 0)
            sb.append("P"+licznikP);
        if(licznikS != 0)
            sb.append("S"+licznikS);

        String gotowe = sb.toString();
return gotowe;
    }

}
