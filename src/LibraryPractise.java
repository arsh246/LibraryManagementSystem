import java.util.Scanner;

public class LibraryPractise {

    public static void main(String[] args) {

        studentsPractise ps = new studentsPractise();
        booksPractise pb = new booksPractise();
        Scanner sc = new Scanner(System.in);

        System.out.println("welcome to Library Practice");
        int pchoice;
        int choice;

        do{
            pb.dispMenu();
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    bookPractise p = new bookPractise();
                    pb.addBook(p);
                    break;

                case 2:
                    pb.updateBook();
                    break;
                case 3:
                    System.out.println("Choose 1 by sno; 2 bu author:");
                    pchoice = sc.nextInt();
                    switch (pchoice) {
                        case 1:
                            pb.searchBySerialNumber();
                            break;
                        case 2:
                            pb.searchByauthor();
                            break;
                    }
                    break;
                case 4:
                    pb.showAllBooks();
                    break;
                case 5:
                    studentPractise p1 = new studentPractise();
                    ps.addStudentPractise(p1);
                    break;
                case 6:
                    ps.showallStudentPractises();
                    break;
                case 7:
                    ps.checkoutBooks(pb);
                    break;

                case 8:
                    ps.checkinBooks(pb);
                    break;

            }


        }
        while(choice!=0);
    }
}
