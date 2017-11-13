package es.polarbear.PBOL.Test;

import java.text.MessageFormat;

import static es.polarbear.PBOL.Print.*;

public class SampleTest{
    public static void main(String[] args) {
        print("Hello");
        MessageFormat.format("Hello its {0} {1}", 8,"PM");
    }
}
