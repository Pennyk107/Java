package Lab3;

import java.util.*;

import Lab3.Classes.Array;
public class MainLab3 {

    public static void main() {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> Array1 = new ArrayList<Integer>();
        int key1;

        Array mass = new Array();
        do {
            System.out.println("\n1 - Ввести данные");
            System.out.println("2 - Решение");
            System.out.println("0 - Выход");
            System.out.println("Ваш выбор  ");
            key1 = in.nextInt();
            switch (key1) {
                case 1:
                    mass.OrBit();
                    break;
                case 2:
                    mass.Output();
                    break;
            }
        }while (key1 != 0);
    }
}