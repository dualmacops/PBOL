package es.polarbear.PBOL.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.*;
import static es.polarbear.PBOL.Print.printf;
import static junit.framework.TestCase.assertEquals;

public class Print {
    @Test
    public void printfTest() throws Exception {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        printf("%f, %1$+020.10f%n", Math.PI);
        String expectedOutput  = "3,141593, +00000003,1415926536"+ System.lineSeparator();// Notice the \n for new line.
        assertEquals(expectedOutput, outContent.toString());
    }
}
