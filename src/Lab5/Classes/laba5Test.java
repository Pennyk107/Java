package Lab5.Classes;

import org.junit.Test;

import java.util.Arrays;
import java.util.Scanner;

import static org.junit.Assert.*;

public class laba5Test {
    String s;
    int Ssize = 0;
    @Test
    public void ainputArray() throws InterruptedException {
        Scanner in = new Scanner(System.in);

        s = "a b c d";
        Ssize = s.length();
        assertEquals(Ssize,s.length());
        Ssize = 0;
        System.out.println("(Лаб 5) ---ТЕСТ -1-  ПРОЙДЕН---");
        Thread.sleep(500);
    }

    @Test
    public void boutputArray() throws InterruptedException {
        s = "a b c d";
        String[] words = s.split("\\.|,|\\s|!|\\? ");
        String words1 = new String();
        Arrays.sort(words);
        for (String word : words) {
            words1 = words1 + word;
            words1 = words1 + " ";
            Ssize++;
        }
        assertEquals(Ssize,4);
        System.out.println("(Лаб 5) ---ТЕСТ -2-  ПРОЙДЕН---");
        System.out.println("");
        Thread.sleep(500);
    }
}