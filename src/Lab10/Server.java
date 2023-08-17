
package Lab10;

import Lab6.Classes.ZeroException;
import org.junit.Test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

import static org.junit.Assert.assertEquals;

public class Server {

    private static Socket clientSocket; //сокет для общения
    private static ServerSocket server; // серверсокет
    private static BufferedReader in; // поток чтения из сокета

    private static BufferedReader reader;
    private static BufferedWriter out; // поток записи в сокет


    public static void UserInput() throws IOException {
        out.write("-" + "\n");

        out.flush();
    }

    public static void InputInFile() throws IOException {
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        out.write("Введите новое имя файла: " + "\n");
        out.flush();

        UserInput();

        String NewFileName = in.readLine();

        try(FileWriter writer = new FileWriter(NewFileName + ".txt", false))
        {
            String k;
            out.write("Вводите текст в файл. Для звершения нажмите 0" + "\n");
            out.flush();

            UserInput();

            k = in.readLine();

            writer.write(k);
            writer.append('\n');
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        System.out.println();
    }
    /*public static void RenameFile() throws IOException {
        out.write("Введите новое имя файла: " + "\n");
        out.flush();

        UserInput();

        String NewFileName = in.readLine();
        File file = new File("OriginalFile.txt");
        File newFile = new File(NewFileName + ".txt");
        if(file.renameTo(newFile)){
            out.write("Файл переименован успешно" + "\n");
            out.flush();
        }else{
            out.write("Файл не был переименован" + "\n");
            out.flush();
        }
    }*/

    public static void main(String[] args) {
            try {
                try {
                    server = new ServerSocket(4004);
                    System.out.println("Сервер запущен!");

                    clientSocket = server.accept();

                    try {

                        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                        out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
                        reader = new BufferedReader(new InputStreamReader(System.in));


                        String key1;

                        do {
                            out.write("1 - Введите текст" + "\n");
                            out.flush();
                            out.write("2 - Тесты" + "\n");
                            out.flush();
                            out.write("0 - Выход" + "\n");
                            out.flush();
                            out.write("Ваш выбор  " + "\n");
                            out.flush();

                            UserInput();

                            key1 = in.readLine();
                            switch (key1) {
                                case "1":
                                    InputInFile();
                                    break;
                                case "2":
                                    ainputArray();
                                    boutputArray();

                            }
                        }while (true);

                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    } finally {
                        clientSocket.close();

                        in.close();
                        out.close();
                    }
                } finally {
                    System.out.println("Сервер закрыт!");
                    server.close();
                }
            } catch (IOException e) {
                System.err.println(e);
            }


    }



    static String s;
    static int Ssize = 0;
    @Test
    public static void ainputArray() throws InterruptedException, IOException {
        Scanner in = new Scanner(System.in);

        s = "a b c d";
        Ssize = s.length();
        assertEquals(Ssize,s.length());
        Ssize = 0;
        out.write("---ТЕСТ -1-  ПРОЙДЕН---\n");
        out.flush();
        Thread.sleep(500);
    }

    @Test
    public static void boutputArray() throws InterruptedException, IOException {
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
        out.write("---ТЕСТ -2-  ПРОЙДЕН---\n");
        out.flush();
        Thread.sleep(500);
    }



}