package bardia.java;

public class Main
{
    public static void main(String[] args)
    {
    Book book1=new Book();
    Book book2=new Book();

    book1.booknum=132;
    book1.bookname="Shah name";
    book1.bookwriter="Ferdosi";
    book1.bookjanr="adabiat iran";

    book2.booknum=235;
    book2.bookname="Romeo and Juliet";
    book2.bookwriter="Shakespeare";
    book2.bookjanr="adabiat jahan";

        System.out.println(book1.bookname);
        book1.givebook();
        System.out.println(book2.bookname);
        book2.getbook();
        System.out.println(book1.bookname);
        book1.getbook();
    }
}
