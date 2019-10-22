import java.time.DayOfWeek;
import java.time.LocalDate;

public class Zad2Kalendarz {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2019, 6, 1);
        //DayOfWeek weekday = date.getDayOfWeek(); //pobierany jest dzień tygodnia
        int month = date.getMonth().getValue(); //pobierana jest wartość danego miesiąca -> Czerwiec to 6, a Listopad to 11
        int value = date.getDayOfWeek().getValue(); //pobierana jest wartość dnia tygodnia
        System.out.println(month);

        System.out.println(" Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < value; i++) //wydrukowanie wcięcia, aby pierwszy dzień miesiąca był przyporządkowany do odpowiedniego dnia tygodnia
            System.out.print("    ");
        while (date.getMonthValue() == month) {
            System.out.printf("%4s", date.getDayOfMonth()); //wyświetlenie wartości dnia miesiąca
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) //jeżeli wartość dnia tygodnia wyniesie 1 (poniedziałek)...
                System.out.println(); //... to następuje przeskok do następnego tygodnia (np. z 1 tygodnia do 2)

        }
    }
}
