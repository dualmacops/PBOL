package es.polarbear.PBOL;

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
    public static void printf(String x,Object ... args) {
        System.out.printf(x,args);
    }
}
