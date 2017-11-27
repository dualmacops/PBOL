package es.polarbear.PBOL;

import java.text.MessageFormat;

public class Print {
    public static void print() {
        System.out.println();
    }

    public static void print(String s) {
        System.out.println(s);
    }

    public static void print(int s) {
        System.out.println(s);
    }

    public static void print(String[] strings) {
        for (String x : strings) {
            System.out.println(x);
        }
    }
    public static void print(Object ... args) {
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i]);
            if(args.length-1!=i){
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    public static void printf(String x,Object ... args) {
        System.out.printf(x+System.lineSeparator(),args);
    }
    public static void printmf(String x,Object ... args) {
        print(MessageFormat.format(x, args));
    }
}
