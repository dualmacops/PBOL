package es.polarbear.PBOL;

import java.util.Scanner;

public class input {
    public Scanner reader = new Scanner(System.in);

    String input() {
        return reader.nextLine();
    }

    public String input(String s) {
        System.out.println(s);
        return reader.nextLine();
    }
    int iinput() {
        return Integer.parseInt(reader.nextLine());
    }

    public int iinput(String s) {
        System.out.println(s);
        return Integer.parseInt(reader.nextLine());
    }
}
