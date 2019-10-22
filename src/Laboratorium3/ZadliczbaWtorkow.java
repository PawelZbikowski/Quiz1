package Laboratorium3;

import java.time.LocalDate;
import java.util.Scanner;

public class ZadliczbaWtorkow {
    public static void main(String[] args) {
        System.out.println("Podaj rok:");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        System.out.println("Podaj miesiąc:");
        int month = scanner.nextInt();
        System.out.println("Liczba wtorków w danym miesiącu: " + liczbaWtorkow(year, month));
    }

    public static int liczbaWtorkow(int year, int month){
        LocalDate localDate = LocalDate.of(year, month,1);
        int liczba = 0;
        int wtorek = 2;
            while(localDate.getMonthValue() == month){
                if(localDate.getDayOfWeek().getValue() == wtorek)
                    liczba++;
                localDate = localDate.plusDays(1);
            }

        return liczba;
    }
}


