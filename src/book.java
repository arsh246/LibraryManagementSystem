import java.util.Scanner;

public class book {
    int serialNo;
    String bookName;
    String bookAuthor;
    int totalQuantity;
    int availableQuantity;

    Scanner sc = new Scanner(System.in);

    public book() {

        System.out.println("Enter serial no:");
        this.serialNo = sc.nextInt();
        System.out.println("Enter book name:");
        this.bookName = sc.next();
        System.out.println("Enter book author:");
        this.bookAuthor = sc.next();
        System.out.println("Enter quantity:");
        this.totalQuantity = sc.nextInt();
        this.availableQuantity = totalQuantity;
    }



}
