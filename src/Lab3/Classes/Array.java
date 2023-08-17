package Lab3.Classes;
import Lab6.Classes.LessZero;

import java.util.*;
public class Array{
    public int a;
    public int b;
    public int c;
    public Array()
    {
        a = 0;
        b = 0;
        c = 0;
    }
    public void OrBit()
    {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Введите a: ");
            a = in.nextInt();
            System.out.println("Введите b: ");
            b = in.nextInt();
            if (a < 0 || b < 0)
                throw new LessZero();

        }catch (InputMismatchException e){
            System.out.println("Вы ввели не целое цисло!");
        }catch (LessZero e){
            System.out.println("Число меньше нуля!");
        }
        System.out.println("Данные внесены!");
    }
    public void Output(){
        c = a ^ b;
        System.out.println("Ответ: " + c);
    }
}