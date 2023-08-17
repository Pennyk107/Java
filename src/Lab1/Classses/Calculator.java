
package Lab1.Classses;

public class Calculator {

    public int a;
    public int b;
    public boolean log;
    public Calculator()
    {
        log =  false;
    }


    public Calculator(int x, boolean bool)
    {
        this.a = x;
        this.log = bool;
    }


    //Сложение
    public int Addition(int b)
    {

        return a + b;
    }


    //Остаток от деления
    public float RemainderOfTheDivision(int b)
    {

        return a%b;
    }


    //++
    public int Increment(int b)
    {
        b++;
        return b;
    }


    //&
    public int AndBit(int b)
    {

        return a & b;
    }


    //^=
    public int OrBit(int b)
    {
        a^=b;
        return a;
    }


    //>
    public boolean MoreThen(int b)
    {

        return a>b;
    }


    //^
    public boolean OrBitLog(boolean bool)
    {

        return log^bool;
    }


    //!
    public boolean NotLog(boolean bool)
    {

        return log!=bool;
    }


    //^=
    public boolean OrBitAssign(boolean bool)
    {
        log^=bool;
        return log;
    }



    // Приоритеты

    public float subDivide(int b, int c)
    {
        return (a-b)/c;
    }
    public float DivideSub(int b, int c)
    {
        return a-b/c;
    }
    public boolean OrAnd(boolean bool1, boolean bool2)
    {
        return (log||bool1)&&bool2;
    }
    public boolean AndOr(boolean bool1, boolean bool2)
    {
        return log||bool1&&bool2;
    }
    public int subShift(int b, int c)
    {
        return a-b>>c;
    }

    // Ассоциативность

    public int subTwiceInBrackets(int b, int c)
    {
        return a - (b - c);
    }
    public int subTwice(int b, int c)
    {
        return a - b - c;
    }
    public float divTwiceInBrackets(int b, int c)
    {
        return a % (b % c);
    }
    public float divTwice(int b, int c)
    {
        return a % b % c;
    }
    public boolean orTwiceInBrackets(boolean bool1, boolean bool2)
    {
        return log || (bool1 || bool2);
    }
}
