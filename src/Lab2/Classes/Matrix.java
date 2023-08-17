package Lab2.Classes;
import java.util.*;

public class Matrix {
    public int IteratorVectorStr;
    public int DigitZero;
    public int []b;
    ArrayList<Integer>ArrayZeroIndexes;
    List<ArrayList<Integer>> a;
    ArrayList<Integer> a0;
    ArrayList<Integer> a1;
    ArrayList<Integer> a2;
    ArrayList<Integer> a3;
    ArrayList<Integer> a4;


    public Matrix()
    {
        IteratorVectorStr = 0;
        DigitZero = 0;
        b = new int[] {2,4,2,4,1};
        ArrayZeroIndexes = new ArrayList<Integer>();
        a = new ArrayList<>();
        a0 = new ArrayList<Integer>();
        a1 = new ArrayList<Integer>();
        a2 = new ArrayList<Integer>();
        a3 = new ArrayList<Integer>();
        a4 = new ArrayList<Integer>();
    }


    public String IsOrNotZeroInList(int DigitZero){
        if (DigitZero != 0){
            System.out.print("Индексы нулевых элементов: ");
            for (int v : ArrayZeroIndexes) {
                System.out.print(" " + v);
            }
            return "";
        }
        return "Нулей в списке нет!";
    }
    public boolean CheckCorrectInput(int TestFunction){

        if (b.length == TestFunction)
            return true;
        return false;
    }
    public boolean CheckCorrectOutput_CountSymbols(int TestFunction){
        if (TestFunction == 14)
            return true;
        else return false;
    }
    public boolean CheckCorrectOutput_CountStrings(int TestFunction){
        if (TestFunction == 5)
            return true;
        else return false;
    }
    public boolean CheckCorrectOutput_CountSymbolsAfterDeleteZero(int DigitZero){
        if (DigitZero == a.size())
            return true;
        else return false;
    }

    public int FlagSum(int R){
        R++;
        return R;
    }
    private void InputArrayList(ArrayList FirstString,int j) throws Exception {
        int TestFunction = 0;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < b[IteratorVectorStr]; i++){
            System.out.println("Введите " + b[IteratorVectorStr] + " элемента "+ j +"-го стоблца "+ i +"-й строки");
            try {
                    FirstString.add(in.nextInt());
                    IteratorVectorStr++;
                                                                                                                                                                                            IteratorVectorStr--;
                } catch (InputMismatchException e) {
                    System.out.println("Вы ввели не число!");
                } catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("Значение индекса массива не принадлежит допустимому диапазону");
                }
                TestFunction++;

        }
        IteratorVectorStr++;
        a.add(FirstString);
        CheckCorrectInput(TestFunction);
    }
    public void InputMatrix() throws Exception {
        Scanner in = new Scanner(System.in);
        InputArrayList(a0,0);
        InputArrayList(a1,1);
        InputArrayList(a2,2);
        InputArrayList(a3,3);
        InputArrayList(a4,4);
    }

    public void OutputMatrix(){
        int TestFunction = 0;
        int TestFunction1 = 0;
        for (ArrayList obj : a) {

            ArrayList<Integer> temp = obj;

            for (Integer job : temp) {
                System.out.print(job + " ");
                TestFunction++;

            }
            System.out.println();
            TestFunction1++;
        }
        CheckCorrectOutput_CountSymbols(TestFunction);
        CheckCorrectOutput_CountStrings(TestFunction1);
    }
    public void InputZeroArrayList(ArrayList a){
        if(a.contains(0)) {
            ArrayZeroIndexes.add(a.indexOf(0));
            DigitZero++;
        }
    }
    public void InputFirstZeroMatrix(){
        InputZeroArrayList(a0);
        InputZeroArrayList(a1);
        InputZeroArrayList(a2);
        InputZeroArrayList(a3);
        InputZeroArrayList(a4);
        CheckCorrectOutput_CountSymbolsAfterDeleteZero(DigitZero);
        System.out.println(IsOrNotZeroInList(DigitZero));

    }
}
