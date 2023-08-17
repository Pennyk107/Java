package Lab5;
import java.util.Scanner;
import Lab5.Classes.Strings;
public class MainLab5 {
    public void main(String... av) {
        String s = new String();
        Scanner in = new Scanner(System.in);
        Strings strings = new Strings();
        int key1;

        do {
            System.out.println("\n1 - Ввести строку");
            System.out.println("2 - Вывести отсторитрованную строку");
            System.out.println("0 - Выход");
            System.out.println("Ваш выбор  ");
            key1 = in.nextInt();
            switch (key1) {
                case 1:
                    strings.InputArray();
                    break;
                case 2:
                    strings.OutputArray();
                    break;
            }
        }while (key1 != 0);

    }
}