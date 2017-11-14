package es.polarbear.PBOL;

import java.util.ArrayList;
import java.util.ListIterator;

public class main {
    public static String split(String s, int start, int end) {
        return s.substring(start, end);
    }

    public static void indexEnumerator(ArrayList<String> sv) {
        for (ListIterator<String> it = sv.listIterator(); it.hasNext(); ) {
            System.out.println(it.nextIndex() + " " + it.next());
        }
    }
    public static void indexEnumerator(String[] sv) {
        for (int i = 0; i < sv.length; i++) {
            System.out.println(i + " " + sv[i]);
        }
    }
    public static String lineSeparator(){
        return System.lineSeparator();
    }
}
