import java.util.Scanner;

public class bookPractise {


    public int sNo;
    public String bookName;
    public String authorName;
    public int bookqty;
    public int availqty;

    Scanner sc=new Scanner(System.in);

    public bookPractise() {

        System.out.println("Enter Student ID");
        sNo=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Book Name");
        bookName=sc.nextLine();
        System.out.println("Enter Author Name");
        authorName=sc.nextLine();
        System.out.println("Enter Book Qty");
        bookqty=sc.nextInt();
        availqty=bookqty;

    }
}
