
//Удалить из заданного фалйа вторую строку и вывести её в результирующий файл
package Lab9;
import Lab9.Classes.FileLab;
import java.util.Scanner;

public class MainLab9 {
    public static void main() {
        Scanner in = new Scanner(System.in);
        FileLab work = new FileLab();
        int key1;

        do {
            System.out.println("\n1 - Внести в файл данные");
            System.out.println("2 - Записать в результирующий файл пятую строку");
            System.out.println("0 - Выход");
            System.out.println("Ваш выбор  ");
            key1 = in.nextInt();
            switch (key1) {
                case 1:
                    work.InputInFile();
                    break;
                case 2:
                    work.OutputFifthString();
                    break;
            }
        }while (key1 != 0);
    }

}
