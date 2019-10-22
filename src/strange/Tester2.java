package strange;

import Wyklad2.Time1;

public class Tester2 {

    public static void main(String[] args) {
        Time1 time2 = new Time1(); //Tester2 jest w innym pakiecie niż Time1, więc metody hour, minute i second (modyfikator dostepu domyślny to protected) nie są dlań dostępne
        //time2.hour = 12;
    }
}
