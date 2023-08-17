package Lab3.Classes;

import Lab1.Classses.Calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class laba3Test {
    @Test
    public void OrBit11() throws InterruptedException {
        Calculator testObject = new Calculator(5, true);

        assertEquals(7, testObject.OrBit(2));
        assertEquals(3, testObject.OrBit(4));
        assertEquals(15, testObject.OrBit(12));
        System.out.println("(Лаб 3) ---ТЕСТ -1-  ПРОЙДЕН---");
        System.out.println("");
        Thread.sleep(500);
    }


}