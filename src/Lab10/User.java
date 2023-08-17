package Lab10;

import java.io.*;
import java.net.Socket;
import java.util.Objects;

public class User {

    private static Socket clientSocket;
    private static BufferedReader reader;

    private static BufferedReader in;
    private static BufferedWriter out;

    public static void main(String[] args) {
        try {
            try {
                clientSocket = new Socket("localhost", 4004);
                reader = new BufferedReader(new InputStreamReader(System.in));
                in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
                String word;
                String serverWord = "";




                do {

                    while (true) {
                        serverWord = in.readLine();

                          if(Objects.equals(serverWord, "-"))
                            break;

                        System.out.println(serverWord);
                    }
                    word = reader.readLine();

                    if(Objects.equals(word, "0" ))
                        break;

                    out.write(word + "\n");
                    out.flush();


                }while(true);



            } finally {
                System.out.println("Клиент был закрыт...");
                clientSocket.close();
                in.close();
                out.close();
            }
        } catch (IOException e) {
            System.err.println(e);
        }

    }


}