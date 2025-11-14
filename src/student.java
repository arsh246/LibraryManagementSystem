import java.util.Scanner;

public class student {

    String regNo;
    String name;

    Scanner sc = new Scanner(System.in);

    book[] books= new book[3];

     int bookCounter=0;

    public student(){

        System.out.println("Enter Student Registration No:");
        this.regNo = sc.nextLine();
        System.out.println("Enter Student Name:");
        this.name = sc.nextLine();
    }

}
