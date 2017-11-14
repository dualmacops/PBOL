package es.polarbear.PBOL.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.*;

import static es.polarbear.PBOL.Parse.*;
import static es.polarbear.PBOL.Print.*;
import static es.polarbear.PBOL.main.lineSeparator;
import static junit.framework.TestCase.assertEquals;

public class Print {
    @Test
    public void printfTest() throws Exception {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        printf("%f, %1$+020.10f", Math.PI);
        String expectedOutput  = "3,141593, +00000003,1415926536"+ lineSeparator();// Notice the \n for new line.
        assertEquals(expectedOutput, outContent.toString());
    }
    @Test
    public void printmfTest() throws Exception {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        printmf("Hello its {0} {1}", 8,"PM");
        String expectedOutput  = "Hello its 8 PM"+ lineSeparator();// Notice the \n for new line.
        assertEquals(expectedOutput, outContent.toString());
    }
    @Test
    public void psfTest() throws Exception {
        String out = psf("%f, %1$+020.10f", Math.PI);
        String expectedOutput  = "3,141593, +00000003,1415926536";// Notice the \n for new line.
        assertEquals(expectedOutput, out);
    }
    @Test
    public void psmfTest() throws Exception {
        String out = psmf("Hello its {0} {1}", 8,"PM");
        String expectedOutput  = "Hello its 8 PM"+lineSeparator();// Notice the \n for new line.
        assertEquals(expectedOutput, out);
    }
}
