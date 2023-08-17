package Lab2;

import Lab2.Classes.Matrix;

import java.util.Scanner;



public class MainLab2 {

    public static void main() throws Exception {
        Scanner in = new Scanner(System.in);
        int key1;
        Matrix matr = new Matrix();
        do {
            System.out.println("\n1 - Заполнить массив");
            System.out.println("2 - Вывести массив");
            System.out.println("3 - Удалить первый ноль в строках");
            System.out.println("0 - Выход");
            System.out.println("Ваш выбор  ");
            key1 = in.nextInt();
            switch (key1) {
                case 1:
                    matr.InputMatrix();
                    break;
                case 2:
                    matr.OutputMatrix();
                    break;
                case 3:
                    matr.InputFirstZeroMatrix();
                    break;


            }
        }while (key1 != 0);

    }
}