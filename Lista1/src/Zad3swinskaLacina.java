import java.util.Arrays;
import java.util.Scanner;

public class Zad3swinskaLacina {

    public static void main(String[] args) {
        StringBuilder sb2 = new StringBuilder();
        System.out.println("Wprowadź zdanie (po angielsku): "); //Always look on the bright side of life
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        System.out.println("Zdanie w świnskiej łacinie: " + pigLatineSentence(sentence, sb2));
    }

    public static String pigLatineSentence(String sentence, StringBuilder sb2){
        String[] sentenceTable = sentence.split(" ");
        //builder.append(sentence);
        for(int i = 0; i < sentenceTable.length; i++) {
            if (Character.isUpperCase(sentenceTable[i].charAt(0)))
                sb2.append(sentenceTable[i] + " ");
            else if (sentenceTable[i].startsWith("a") || sentenceTable[i].startsWith("e") || sentenceTable[i].startsWith("i") || sentenceTable[i].startsWith("o") || sentenceTable[i].startsWith("u") || sentenceTable[i].startsWith("y"))
                sb2.append(sentenceTable[i] + "way ");
            else {
//                sentenceTable[i].substring(1);
                sb2.append(sentenceTable[i].substring(1) + "ay ");
            }

        }
String completedString = sb2.toString();
        return  completedString;
    }
}
