package bardia.java;

public class CalcFactory
{
    public static Calculate getCalc(char a){
        switch (a)
        {
            case '+':
                return new CalcPlus();
            case '-':
                return new CalcMinus();
            default:
                return null;
        }
    }
}
