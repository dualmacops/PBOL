package es.polarbear.PBOL;

import java.text.MessageFormat;

public class Parse {

    public static int pi(String s) {
        return Integer.parseInt(s);
    }
    public static String ps(int i){
        return Integer.toString(i);
    }
    public static String ps(Double d){
        return Double.toString(d);
    }
    public static String ps(long l){
        return Long.toString(l);
    }
    public static String ps(boolean b) {
        return b ? "true" : "false";
    }
    public static String ps(char c) {
        return String.valueOf(c);
    }
    public static String ps(char[] c) {
        return String.valueOf(c);
    }

    public static double pd(String s){
        return Double.parseDouble(s);
    }
    public static float pf(String s){
        return Float.parseFloat(s);
    }

    public static String psf(String x, Object ... args) {
        return String.format(x,args);
    }
    public static String psmf(String x, Object ... args) {
        return MessageFormat.format(x, args);
    }
}
