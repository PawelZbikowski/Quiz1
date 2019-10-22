public class Scr {
    public static void main(String[] args) {

        Object o1 = new Object();
        System.out.println(o1);

        String s = "Ala";
        System.out.println(s.hashCode());

        int hash = 0;
        for (int i = 0; i < s.length(); i++) {
            hash = 31*hash+s.charAt(i);
        }
        System.out.println(hash);
    }
}
