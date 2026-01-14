import java.util.Scanner;

public class studentPractise {

    String studentname;
    String studentid;

    bookPractise[] bookPractises = new bookPractise[3];
    int bookCounter=0;
    Scanner sc = new Scanner(System.in);

    public studentPractise() {

        System.out.println("Enter student name:");
        studentname = sc.nextLine();
        System.out.println("Enter student id:");
        studentid = sc.nextLine();
    }
}
