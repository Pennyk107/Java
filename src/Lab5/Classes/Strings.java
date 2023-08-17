package Lab5.Classes;
import Lab6.Classes.ZeroException;
import java.util.*;

public class Strings {

   /* private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }*/

    String s;
    int Ssize = 0;
    public void InputArray(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");

        try {
            s = in.nextLine();
            if(s.length() == 0)
                throw new InputMismatchException();
        }
        catch (InputMismatchException e) {
            System.out.println("Строка пустая! Повторите ввод!!!");
        }
        Ssize = s.length();

    }
    public void OutputArray(){


/*        String[] words = s.split("\\.|,|\\s|!|\\? ");
        String[] NewString = new String[words.length];
        int i = 0;
        for (String word : words) {
            if (isDigit(word) == true){
                NewString[i] = word;
                i++;
            }
        }
        for (int k = 0; k < i; k++) {
            System.out.println(NewString[k]);
        }*/
        String NumberOnly= s.replaceAll("[^0-9]", "");
        System.out.println(NumberOnly);

    }
}
