package Lab1.Classses;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import Lab1.Classses.Calculator;

public class laba1Test {
    @Test
    public void Addition() throws InterruptedException {
        Calculator testObject = new Calculator(5, true);
        //testObject.Calculator(15, true);
        assertEquals(12, testObject.Addition(7));
        assertEquals(14, testObject.Addition(9));
        assertEquals(16, testObject.Addition(11));
        System.out.println("(Лаб 1) ---ТЕСТ -1-  ПРОЙДЕН---");
        Thread.sleep(500);
    }
    @Test
    public void RemainderOfTheDivision() throws InterruptedException {
        Calculator testObject = new Calculator(5,true);
        //testObject.Calculator(20, true);
        assertEquals(5,5, testObject.RemainderOfTheDivision(5));
        assertEquals(8,8, testObject.RemainderOfTheDivision(10));
        assertEquals(5,5, testObject.RemainderOfTheDivision(4));
        System.out.println("(Лаб 1) ---ТЕСТ -1-  ПРОЙДЕН---");
        Thread.sleep(500);
    }

    @Test
    public void Increment() throws InterruptedException {
        Calculator testObject = new Calculator(5, true);
        //testObject.Calculator(2, true);
        assertEquals(5, testObject.Increment(4));
        assertEquals(8, testObject.Increment(7));
        assertEquals(9, testObject.Increment(8));
        System.out.println("(Лаб 1) ---ТЕСТ -1-  ПРОЙДЕН---");
        Thread.sleep(500);
    }

    @Test
    public void OrBit() throws InterruptedException {
        Calculator testObject = new Calculator(5, true);
        //testObject.Calculator(11, true);
        assertEquals(7, testObject.OrBit(2));
        assertEquals(3, testObject.OrBit(4));
        assertEquals(15, testObject.OrBit(12));
        System.out.println("(Лаб 1) ---ТЕСТ -1-  ПРОЙДЕН---");
        Thread.sleep(500);
    }

    @Test
    public void AndBit() throws InterruptedException {
        Calculator testObject = new Calculator();
        //testObject.Calculator(5, true);
        assertEquals(0, testObject.AndBit(5));
        assertEquals(0, testObject.AndBit(3));
        assertEquals(0, testObject.AndBit(0));
        System.out.println("(Лаб 1) ---ТЕСТ -1-  ПРОЙДЕН---");
        Thread.sleep(500);
    }

    @Test
    public void MoreThen() throws InterruptedException {
        Calculator testObject = new Calculator();
        //testObject.Calculator(-6, true);
        assertFalse(testObject.MoreThen(3));
        assertFalse(testObject.MoreThen(4));
        assertFalse(testObject.MoreThen(7));
        System.out.println("(Лаб 1) ---ТЕСТ -1-  ПРОЙДЕН---");
        Thread.sleep(500);
    }
    @Test
    public void OrBitLog() throws InterruptedException {
        Calculator testObject = new Calculator();
        //testObject.Calculator(0, false);
        assertTrue(testObject.OrBitLog(true));
        assertFalse(testObject.OrBitLog(false));
        System.out.println("(Лаб 1) ---ТЕСТ -1-  ПРОЙДЕН---");
        Thread.sleep(500);
    }

    @Test
    public void NotLog() throws InterruptedException {
        Calculator testObject = new Calculator();
        //testObject.Calculator(0, true);
        assertTrue(testObject.NotLog(true));
        assertFalse(testObject.NotLog(false));
        System.out.println("(Лаб 1) ---ТЕСТ -1-  ПРОЙДЕН---");
        Thread.sleep(500);
    }

    @Test
    public void OrBitAssign() throws InterruptedException {
        Calculator testObject = new Calculator();
        //testObject.Calculator(20, false);
        assertEquals(true,testObject.OrBitAssign(true));
        assertEquals(true,testObject.OrBitAssign(false));
        assertEquals(false,testObject.OrBitAssign(true));
        System.out.println("(Лаб 1) ---ТЕСТ -1-  ПРОЙДЕН---");
        Thread.sleep(500);
    }

    @Test
    public void subDivide() throws InterruptedException {
        Calculator testObject = new Calculator(24, false);
        assertEquals(4,0,testObject.subDivide(4,5));
        assertEquals(6,0,testObject.subDivide(6,3));
        assertEquals(2,0,testObject.subDivide(-2,13));
        System.out.println("(Лаб 1) ---ТЕСТ -1-  ПРОЙДЕН---");
        System.out.println("");
        Thread.sleep(500);

    }


}
