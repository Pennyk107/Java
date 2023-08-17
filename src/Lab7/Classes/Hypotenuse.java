package Lab7.Classes;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Hypotenuse {
    private static int katet1 = 0;
    private static int katet2 = 0;
    private static int kol = 0;
    public static int getRandomNumberInts(int min, int max){
        Random random = new Random();
        return random.ints(min,(max+1)).findFirst().getAsInt();
    }
    public static void processes(){
        Object sync = new Object();

        Thread setLThread = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        synchronized (sync){
                            Scanner in = new Scanner(System.in);
                            do {
                                try{
                                   System.out.println("Введите количество поисков: ");
                                    kol = in.nextInt();

                                    if (kol == -1){
                                        sync.notify();
                                        break;
                                    } else if (kol < 1 || kol > 999999) {
                                        System.out.println("Число должно быть в диапозоне");
                                    }
                                    for(int i = 0; i < kol; i++){
                                        katet1 = getRandomNumberInts(1,10);
                                        System.out.println("Первый катет равен: " + katet1);
                                        katet2 = getRandomNumberInts(1,10);
                                        System.out.println("Второй катет равен: " + katet2);
                                        sync.wait();
                                        sync.notify();
                                    }
                                } catch (InputMismatchException e){
                                    System.out.println("Была допущена ошибка в вводе!");
                                    in.next();
                                } catch (InterruptedException ex){
                                    System.err.println("Interrupted");
                                }
                            }while(true);
                        }
                    }
                });

        Thread getRThread = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        synchronized (sync){
                            do {
                                try {
                                    if (katet1 > 0 && katet2 > 0){

                                        System.out.println("Гипотенуза равна: " + String.format("%.3f",(Math.sqrt(Math.pow(katet1, 2) + Math.pow(katet2, 2)))));
                                        System.out.print("\n");
                                        sync.notify();
                                        sync.wait();
                                    }

                                    if(kol == -1){
                                        sync.notify();
                                        break;
                                    }

                                }catch (InterruptedException ex){
                                    System.err.println("Interrupted");
                                }
                            }while (true);
                        }
                    }
                });
        setLThread.start();
        setLThread.setName("setLThread");
        getRThread.start();
        getRThread.setName("getRThread");
    }
}
