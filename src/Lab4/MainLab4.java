package Lab4;
import Lab1.*;
import Lab1.Classses.*;
import Lab2.*;
import Lab2.Classes.*;
import Lab3.*;
import Lab3.Classes.*;
import Lab5.*;
import Lab5.Classes.*;
import Lab7.MainLab7;
import Lab8.*;
import Lab9.*;


import java.util.Scanner;

public class MainLab4 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int key1;

        MainLab1 main1 = new MainLab1();
        MainLab2 main2 = new MainLab2();
        MainLab3 main3 = new MainLab3();
        MainLab5 main5 = new MainLab5();
        MainLab7 main7 = new MainLab7();
        mainLab8 main8 = new mainLab8();
        MainLab9 main9 = new MainLab9();
        laba1Test Test1 = new laba1Test();
        laba2Test Test2 = new laba2Test();
        laba3Test Test3 = new laba3Test();
        laba5Test Test5 = new laba5Test();
        do {
            System.out.println("\n1 - Лабораторная №1");
            System.out.println("2 - Лабораторная №2");
            System.out.println("3 - Лабораторная №3");
            System.out.println("5 - Лабораторная №5");
            System.out.println("7 - Лабораторная №7");
            System.out.println("8 - Лабораторная №8");
            System.out.println("9 - Лабораторная №9");
            System.out.println("-1 - Запусить тесты");
            System.out.println("0 - Выход");
            System.out.println("Ваш выбор  ");
            key1 = in.nextInt();
            switch (key1) {
                case 1:
                    main1.main();
                    break;
                case 2:
                    main2.main();
                    break;
                case 3:
                    main3.main();
                    break;
                case 5:
                    main5.main();
                    break;
                //case 7:
                    //main7.main();
                   // break;
                case 8:
                    main8.main();
                    break;
                case 9:
                    main9.main();
                    break;
                case -1:
                    Test1.Addition();Test1.RemainderOfTheDivision();Test1.Increment();Test1.OrBit();Test1.AndBit();Test1.MoreThen();Test1.OrBitLog();Test1.NotLog();Test1.OrBitAssign();Test1.subDivide();

                    Test2.IsOrNotZeroInList();Test2.CheckCorrectInput();Test2.CheckCorrectOutputCountSymbols();Test2.CheckIncorrectOutputCount();Test2.CheckCorrectOutputCountStrings();Test2.CheckInCorrectOutputCount();Test2.CheckCorrectOutput_CountSymbolsAfterDeleteZero();Test2.FlagSum();Test2.CheckCorrectFlagIterator2();Test2.CheckInCorrectInput();

                    Test3.OrBit11();

                    Test5.ainputArray();Test5.boutputArray();
            }
        }while (key1 != 0);

    }
}
