package bardia.java;
public class Daneshjoo
{
    public double nomre1;
    public int zarib1;
    public double nomre2;
    public int zarib2;
    public double nomre3;
    public int zarib3;
    public double nomre4;
    public int zarib4;

    double sum_kol;
    int sum_zarib;

    public void moadel()
    {
     sum_kol=(nomre1*zarib1)+(nomre2*zarib2)+(nomre3*zarib3)+(nomre4*zarib4);
     sum_zarib=zarib1+zarib2+zarib3+zarib4;
        System.out.println("moadel = "+(sum_kol/sum_zarib));
    }

}
