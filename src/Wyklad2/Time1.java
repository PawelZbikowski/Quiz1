package Wyklad2;

/**
 * Klasa Time1 reprezentująca czas.\
 *
 * @author Pablo
 * @version 1.0
 * @since 2019-10-15
 *
 */

public class Time1 {

    /**
     * Reprezentuje godziny
     */
    private int hour; //modyfikator private - hermetyzacja

    /**
     * Reprezentuje minuty
     */
    private int minute;

    /**
     * Reprezentuje sekundy
     */
    private int second; //użytkownik może modyfikować atrybuty tylko dzięki zapewnionym przez twórcę metod
    // ukrywamy przed użytkownikiem klasy specyfikacje atrybutow

    // konstruktor - inicjalizuje stan obiektu w czasie tworzenia - ma nazwę taką samą jak nazwa klasy

//    public Time1(int hour, int minute, int second) {
//        this.hour = hour;
//    }

    //Po zdefiniowaniu jakiegokolwiek konstruktora z parametrami JVM nie generuje
    // domyślnego konstruktora

    /**
     * Konstrutor domyślny
     */
    public Time1() { //konstruktor domyślny
        hour = 10;
        minute = 45;
        second = 31;
    }

    /**
     * Konstrutor z parametrem - tworzy obiekt Time1 z zadaną godziną
     * @param hour godzina (typ int)
     */
    public Time1(int hour) {
        this(hour, 0, 0); // wykorzystujemy wcześniej zdefiniowany konstruktor
    }

    /**
     * Konstrutor z parametrami - tworzy obiekt Time1 z zadaną godziną, minutą i sekundą
     * @param hour godzina (typ int)
     * @param minute minuta (typ int)
     * @param second sekunda (typ int)
     */
    public Time1(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    /**
     * Ustawia godzinę
     *
     */
    public void setHour(int hour) {
        if(hour > 24 || hour < 0)
            throw new IllegalArgumentException("Godzina musi być z zakresu 0 - 24");
        else
            this.hour = hour;
    }
    /**
     * Zwraca godzinę
     * @return hour godzina (jako int)
     */
    public int getHour() {
        return hour;
    }
}

