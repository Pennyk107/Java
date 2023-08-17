package Lab2.Classes;

import org.testng.annotations.Test;
import static org.junit.Assert.*;


public class laba2Test {

    @Test
    public void IsOrNotZeroInList() throws InterruptedException {
        Matrix testMatrix = new Matrix();
        assertEquals("Нулей в списке нет!",testMatrix.IsOrNotZeroInList(0));
        System.out.println("(Лаб 2) ---ТЕСТ -1-  ПРОЙДЕН---");
        Thread.sleep(500);
    }
    @Test
    public void CheckCorrectInput() throws InterruptedException {
        Matrix testMatrix = new Matrix();
        assertEquals(true,testMatrix.CheckCorrectInput(5));
        System.out.println("(Лаб 2) ---ТЕСТ -2-  ПРОЙДЕН---");
        Thread.sleep(500);
    }
    @Test
    public void CheckCorrectOutputCountSymbols() throws InterruptedException {
        Matrix testMatrix = new Matrix();
        assertEquals(true,testMatrix.CheckCorrectOutput_CountSymbols(14));
        System.out.println("(Лаб 2) ---ТЕСТ -3-  ПРОЙДЕН---");
        Thread.sleep(500);
    }
    @Test
    public void CheckIncorrectOutputCount() throws InterruptedException {
        Matrix testMatrix = new Matrix();
        assertEquals(false,testMatrix.CheckCorrectOutput_CountSymbols(10));
        System.out.println("(Лаб 2) ---ТЕСТ -4-  ПРОЙДЕН---");
        Thread.sleep(500);
    }
    @Test
    public void CheckCorrectOutputCountStrings() throws InterruptedException {
        Matrix testMatrix = new Matrix();
        assertEquals(true,testMatrix.CheckCorrectOutput_CountStrings(5));
        System.out.println("(Лаб 2) ---ТЕСТ -5-  ПРОЙДЕН---");
        Thread.sleep(500);
    }
    @Test
    public void CheckInCorrectOutputCount() throws InterruptedException {
        Matrix testMatrix = new Matrix();
        assertEquals(false,testMatrix.CheckCorrectOutput_CountStrings(15));
        System.out.println("(Лаб 2) ---ТЕСТ -6-  ПРОЙДЕН---");
        Thread.sleep(500);
    }
    @Test
    public void CheckCorrectOutput_CountSymbolsAfterDeleteZero() throws InterruptedException {
        Matrix testMatrix = new Matrix();
        assertEquals(false,testMatrix.CheckCorrectOutput_CountStrings(0));
        System.out.println("(Лаб 2) ---ТЕСТ -7-  ПРОЙДЕН---");
        Thread.sleep(500);
    }
    @Test
    public void FlagSum() throws InterruptedException {
        Matrix testMatrix = new Matrix();
        assertEquals(5,testMatrix.FlagSum(4));
        System.out.println("(Лаб 2) ---ТЕСТ -8-  ПРОЙДЕН---");
        Thread.sleep(500);
    }
    @Test
    public void CheckCorrectFlagIterator2() throws InterruptedException {
        Matrix testMatrix = new Matrix();
        assertEquals(7,testMatrix.FlagSum(6));
        System.out.println("(Лаб 2) ---ТЕСТ -9-  ПРОЙДЕН---");
        Thread.sleep(500);
    }
    @Test
    public void CheckInCorrectInput() throws InterruptedException {
        Matrix testMatrix = new Matrix();
        assertEquals(false,testMatrix.CheckCorrectInput(10));
        System.out.println("(Лаб 2) ---ТЕСТ -10- ПРОЙДЕН---");
        System.out.println("");
        Thread.sleep(500);
    }
}