package Wyklad2;

public class Tester1 {

    public static void main(String[] args) {

        Time1 time1 = new Time1(); //konstruktor domyślny, inicjalizuje atrybuty (hour, minute, second) obiektu Time1
        Time1 time2 = new Time1(16,32,15); //konstruktor z 3 parametrami
        Time1 time3 = new Time1(15); //konstruktor z 1 parametrem
        // ^przeciążanie konstruktorów

        try {
            time1.setHour(56);
            System.out.println(time1.getHour());
        }
        catch(IllegalArgumentException e){
            System.out.println("Coś nie tak");
        }
        //time1.hour = 12;
        //System.out.println(time1.hour);
        System.out.println(time2);
        // konstruktor - inicjalizuje stan obiektu w czasie tworzenia - ma nazwę taką samą jak nazwa klasy

    }
}
