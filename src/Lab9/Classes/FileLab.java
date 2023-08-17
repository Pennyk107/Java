//Удалить вторую строку из файла и поместить её в новый файл.
package Lab9.Classes;

import java.io.*;
import java.util.Scanner;

public class FileLab {
    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public void InputInFile(){
        Scanner in = new Scanner(System.in);
        try(FileWriter writer = new FileWriter("/Users/dengt/Desktop/Учёба/1 семестр (2 курс)/Java/Лабы/Решения/15/Labs/src/Lab9/Classes/OriginalFile.txt", false))
        {
            String k;
            System.out.println("Вводите текст в файл. Для звершения нажмите 0");
            do {
                k = in.nextLine();

                if (isDigit(k) == true){
                    int i = Integer.parseInt (k);
                    if (i == 0)
                        break;
                }

                writer.write(k);
                writer.append('\n');
            }while (true);
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        System.out.println();
    }
    public int OutputFifthString(){
        int StringCounter = 0;
        try {
            File FileIN = new File("/Users/dengt/Desktop/Учёба/1 семестр (2 курс)/Java/Лабы/Решения/15/Labs/src/Lab9/Classes/OriginalFile.txt");
            File FileOUT = new File("/Users/dengt/Desktop/Учёба/1 семестр (2 курс)/Java/Лабы/Решения/15/Labs/src/Lab9/Classes/ResultFile.txt");

            FileReader FileInRead = new FileReader(FileIN);             //создаем объект FileReader для объекта File
            FileWriter FileOutWrite = new FileWriter(FileOUT);
            BufferedReader ReaderFileIn = new BufferedReader(FileInRead);   //создаем BufferedReader с существующего FileReader для построчного считывания
            String line = ReaderFileIn.readLine();                  //считаем сначала первую строку
            FileWriter FileInWrite = new FileWriter(FileIN);

            while (line != null) {
                StringCounter++;
                if(StringCounter == 2) {
                    FileOutWrite.write(line);
                    FileInWrite.write(" ");
                    FileInWrite.append('\n');
                    /*try {
                        File FileIN = new File(f.getPath());
                        FileReader FileInRead = new FileReader(FileIN);
                        BufferedReader ReaderFileIn = new BufferedReader(FileInRead);
                        String line = ReaderFileIn.readLine();
                        while (line != null) {

                            NotesInput.setText(String.valueOf(ReaderFileIn));

                        }*/
                        FileOutWrite.flush();
                    System.out.println("Вторая строка записана в результирующий файл");

                }
                else{
                    FileInWrite.write(line);
                    FileInWrite.append('\n');
                }
                line = ReaderFileIn.readLine();                     // считываем остальные строки в цикле
            }
            FileInWrite.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (StringCounter == 0)
            System.out.println("В файле меньше пяти строк!");
        return 0;
    }
}
