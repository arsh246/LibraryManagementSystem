import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

        System.out.println(
                "********************Welcome to the Library!********************");
        System.out.println(
                "                  Select From The Following Options:               ");
        System.out.println(
                "**********************************************************************");



        books bs = new books();
        students ss = new students();

        int choice;
        int pChoice;


        do {

            bs.dispMenu();
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    book b = new book();
                    bs.addBook(b);
                    break;
                    case 2:
                        bs.upgradeBooks();
                        break;
                        case 3:
                            System.out.println("Choose 1 if you want to search by Sno:\n"+"choose 2 if you want to search by Author:");
                            pChoice = input.nextInt();
                            switch (pChoice) {
                                case 1:
                                    bs.searchBySno();
                                    break;
                                    case 2:
                                        bs.searchByAuthor();
                                        break;
                            }
                            break;
                            case 4:
                                bs.showAllBooks();
                                break;
                                case 5:
                                    student s = new student();
                                    ss.addStudent(s);
                                    break;

                                    case 6:
                                        ss.allStudents();
                                        break;
                                        case 7:
                                            ss.checkOutBook(bs);
                                            break;
                                            case 8:
                                                ss.checkInBook(bs);
                                                break;
                                                default:
                                                    System.out.println("Choose from 1 to 8");

            }
        }
        while (choice != 0);




    }

}