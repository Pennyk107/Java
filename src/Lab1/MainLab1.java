package Lab1;

import java.util.InputMismatchException;
import java.util.Scanner;

import Lab1.Classses.Calculator;
public class MainLab1 {

    public static int main() {
        Scanner in = new Scanner(System.in);
        int key1, key2, key3, b,c,k;
        int a;
        float d;
        boolean log;
        boolean bool, bool1, bool2, logthis;
        Calculator calc = new Calculator();
        do
        {
            System.out.println("\n1 - Выполнить один из операторов");
            System.out.println("2 - Выполнить проверку приоритетов");
            System.out.println("3 - Выполнить проверку на ассоциативнось");
            System.out.println("4 - Изменить данные переменных a и log");
            System.out.println("0 - Выход");
            System.out.println("Ваш выбор  ");
            key1 = in.nextInt();

            a = calc.a;
            log = calc.log;
            switch(key1)
            {
                case 1:
                    System.out.println("\nВыберите оператор");
                    System.out.println("1 - Оператор \"+\"  (Арифметический)");
                    System.out.println("2 - Оператор \"%\"  (Арифметический)");
                    System.out.println("3 - Оператор \"++\" (Арифметический)");
                    System.out.println("4 - Оператор \"&\"  (Битовый)");
                    System.out.println("5 - Оператор \"^=\" (Битовый)");
                    System.out.println("6 - Оператор \">\"  (Отношение)");
                    System.out.println("7 - Оператор \"^\"  (Логический)");
                    System.out.println("8 - Оператор \"!\"  (Логический)");
                    System.out.println("9 - Оператор \"^=\" (Логический)");
                    System.out.println("0 - Назад");
                    System.out.println("Выбор  ");
                    key2 = in.nextInt();
                    switch(key2)
                    {
                        case 1:
                            System.out.println("Введите число (b)");
                            try {
                                b = in.nextInt();
                            }
                            catch (InputMismatchException e){
                                System.out.println("Вы ввели не целое цисло!");
                                return 1;
                            }
                            System.out.println("a = " + a);
                            c = calc.Addition(b);
                            System.out.println("a + b = " + a + " + " + b + " = " +c);
                            System.out.println("a = " + a + "\nb = " + b);
                            break;
                        case 2:
                            System.out.println("Введите число (b)");
                            try {
                                b = in.nextInt();
                            }
                            catch (InputMismatchException e){
                                System.out.println("Вы ввели не целое цисло!");
                                return 1;
                            }
                            System.out.println("a = " + a);
                            d = calc.RemainderOfTheDivision(b);
                            System.out.println("a % b = " + a + " % " + b + " = " +d);
                            break;
                        case 3:
                            System.out.println("Введите число (b)");
                            try {
                                b = in.nextInt();
                            }
                            catch (InputMismatchException e){
                                System.out.println("Вы ввели не целое цисло!");
                                return 1;
                            }
                            b = calc.Increment(b);
                            System.out.println("b = " + b);
                            break;
                        case 4:
                            System.out.println("Введите число (b)");
                            try {
                                b = in.nextInt();
                            }
                            catch (InputMismatchException e){
                                System.out.println("Вы ввели не целое цисло!");
                                return 1;
                            }
                            System.out.println("a = " + a);
                            c = calc.AndBit(b);
                            System.out.println("a & b =" + a + " & " + b + " = " + c);
                            break;
                        case 5:
                            System.out.println("Введите число (b)");
                            try {
                                b = in.nextInt();
                            }
                            catch (InputMismatchException e){
                                System.out.println("Вы ввели не целое цисло!");
                                return 1;
                            }
                            System.out.println("a = " + a);
                            System.out.println("a ^= b \n" + a + " ^= " + b);
                            a = calc.OrBit(b);
                            System.out.println("a = " + a + "\nb = " + b);
                            break;
                        case 6:
                            System.out.println("Введите число (b)");
                            try {
                                b = in.nextInt();
                            }
                            catch (InputMismatchException e){
                                System.out.println("Вы ввели не целое цисло!");
                                return 1;
                            }
                            System.out.println("a = " + a);
                            System.out.println("a > b \n" + a + " > " + b);
                            bool = calc.MoreThen(b);
                            System.out.print("bool = " + bool);
                            break;
                        case 7:
                            System.out.println("Введите true/false");
                            logthis = in.nextBoolean();
                            System.out.println("Заданный true/false = " + log);
                            System.out.println("Заданный true/false ^ Ваш log \n" + log + " ^ " + logthis);
                            bool = calc.OrBitLog(logthis);
                            System.out.println(bool);
                            break;
                        case 8:
                            System.out.println("Введите true/false");
                            logthis = in.nextBoolean();
                            System.out.println("Заданный true/false = " + log);
                            System.out.println("log != Ваш log \n" + log + " != " + logthis);
                            bool = calc.NotLog(logthis);
                            System.out.println(bool);
                            break;
                        case 9:
                            System.out.println("Введите true/false");
                            logthis = in.nextBoolean();
                            System.out.println("Заданный true/false = " + log);
                            System.out.println("log ^= Ваш log \n" + log + " ^= " + logthis);
                            log = calc.OrBitAssign(logthis);
                            System.out.println("log = " + log);
                            break;
                        case 0:
                            break;
                    }
                    break;
                case 2:
                    do{
                        System.out.println("Выберете метод проверки приоритетов");
                        System.out.println("1 - (a - b) / c");
                        System.out.println("2 - a - b / c");
                        System.out.println("3 - (log || bool1) && bool2");
                        System.out.println("4 - log || bool1 && bool2");
                        System.out.println("5 - a - b >> c");
                        System.out.println("0 - назад");
                        System.out.print("Ваш выбор ");
                        key3 = in.nextInt();
                        switch(key3)
                        {
                            case 1:
                                System.out.println("Вы выбрали операцию (a - b) / c");
                                System.out.println("Введите переменную b (целочисленное)");
                                b = in.nextInt();
                                System.out.println("Введите переменную с (целочисленное)");
                                c = in.nextInt();
                                d = calc.subDivide(b, c);
                                System.out.println("(a - b) / c = (" + a + "-" + b + ") / "+ c + " = " + d);
                                break;
                            case 2:
                                System.out.println("Вы выбрали операцию a - b / c");
                                System.out.println("Введите переменную b (целочисленное)");
                                b = in.nextInt();
                                System.out.println("Введите переменную с (целочисленное)");
                                c = in.nextInt();
                                d = calc.DivideSub(b, c);
                                System.out.println("a - b / c = " + a + "-" + b + " / "+ c + " = " + d);
                                break;
                            case 3:
                                System.out.println("Вы выбрали операцию (log || bool1) && bool2");
                                System.out.println("Введите переменную bool1 (true/false)");
                                bool1 = in.nextBoolean();
                                System.out.println("Введите переменную bool2 (true/false)");
                                bool2 = in.nextBoolean();
                                bool = calc.OrAnd(bool1, bool2);
                                System.out.println("(log || bool1) && bool2 = (" + log + " || " + bool1 + ") && "+ bool2 + " = " + bool);
                                break;
                            case 4:
                                System.out.println("Вы выбрали операцию log || bool1 && bool2");
                                System.out.println("Введите переменную bool1 (true/false)");
                                bool1 = in.nextBoolean();
                                System.out.println("Введите переменную bool2 (true/false)");
                                bool2 = in.nextBoolean();
                                bool = calc.AndOr(bool1, bool2);
                                System.out.println("log || bool1 && bool2 = " + log + " || " + bool1 + " && "+ bool2 + " = " + bool);
                                break;
                            case 5:
                                System.out.println("Вы выбрали операцию a - b >> c");
                                System.out.println("Введите переменную b (целочисленное)");
                                b = in.nextInt();
                                System.out.println("Введите переменную с (целочисленное)");
                                c = in.nextInt();
                                k = calc.subShift(b, c);
                                System.out.println("a - b >> c = " + a + " - " + b + " >> " + c + " = " + k);
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Ввод некорректный. Повторите");
                                break;
                        }
                    }while(key3!=0);
                    break;
                case 3:
                    do
                    {
                        System.out.println("Выберете метод проверки ассоциативности");
                        System.out.println("1 - a - (b - c)");
                        System.out.println("2 - a - b - c");
                        System.out.println("3 - a % (b % c)");
                        System.out.println("4 - a % b % c");
                        System.out.println("5 - log || (bool1 || bool2)");
                        System.out.println("0 - назад");
                        System.out.print("Ваш выбор ");
                        key3 = in.nextInt();
                        switch(key3)
                        {
                            case 1:
                                System.out.println("Вы выбрали операцию a - (b - c)");
                                System.out.println("Введите переменную b (целочисленное)");
                                b = in.nextInt();
                                System.out.println("Введите переменную с (целочисленное)");
                                c = in.nextInt();
                                k = calc.subTwiceInBrackets(b, c);
                                System.out.println("a - (b - c) = " + a + " - (" + b + " - " + c + ") = " + k);
                                break;
                            case 2:
                                System.out.println("Вы выбрали операцию a - b - c");
                                System.out.println("Введите переменную b (целочисленное)");
                                b = in.nextInt();
                                System.out.println("Введите переменную с (целочисленное)");
                                c = in.nextInt();
                                k = calc.subTwice(b, c);
                                System.out.println("a - b - c = " + a + " - " + b + " - " + c + " = " + k);
                                break;
                            case 3:
                                System.out.println("Вы выбрали операцию a % (b % c)");
                                System.out.println("Введите переменную b (целочисленное)");
                                b = in.nextInt();
                                System.out.println("Введите переменную с (целочисленное)");
                                c = in.nextInt();
                                d = calc.divTwiceInBrackets(b, c);
                                System.out.println("a % (b % c) = " + a + " % (" + b + " % " + c + ") = " + d);
                                break;
                            case 4:
                                System.out.println("Вы выбрали операцию a % b % c");
                                System.out.println("Введите переменную b (целочисленное)");
                                b = in.nextInt();
                                System.out.println("Введите переменную с (целочисленное)");
                                c = in.nextInt();
                                d = calc.divTwiceInBrackets(b, c);
                                System.out.println("a % b % c = " + a + " % " + b + " % " + c + " = " + d);
                                break;
                            case 5:
                                System.out.println("Вы выбрали операцию log || (bool1 || bool2)");
                                System.out.println("Введите переменную bool1 (true/false)");
                                bool1 = in.nextBoolean();
                                System.out.println("Введите переменную bool2 (true/false)");
                                bool2 = in.nextBoolean();
                                bool = calc.orTwiceInBrackets(bool1, bool2);
                                System.out.println("log || (bool1 || bool2) = " + log + " || (" + bool1 + " || " + bool2 + ") = " + bool);
                                break;
                        }
                    }while(key3!=0);
                    break;

                case 4:
                    System.out.print("Введите а = ");
                    a = in.nextInt();
                    System.out.print("Введите log = ");
                    log = in.nextBoolean();
                    break;
                }
        }while(key1!=0);
        return 0;
    }

}
