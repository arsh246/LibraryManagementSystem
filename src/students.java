import java.util.Scanner;

public class students {

    student[] theStudents = new student[50];
    Scanner sc = new Scanner(System.in);
    static int studentCounter=0;

    //Method 1 To add student
    public void addStudent(student student){
        for(int i=0;i<studentCounter;i++){
            if(student.regNo.equalsIgnoreCase(theStudents[i].regNo)){
                System.out.println("Student already exists");
                return;
            }
        }
        if(studentCounter<=50){
            theStudents[studentCounter]=student;
            studentCounter++;
        }
    }

    //Method 2 displaying all students
    public void allStudents(){
        System.out.println("Student Name\t\t\tReg Number");
        for(int i=0;i<studentCounter;i++){
            System.out.println(theStudents[i].name + "\t\t\t" + theStudents[i].regNo);

        }
    }

    //Method 3 to check a student
    public int isStudent(){
        String regNo;
        System.out.println("Enter Student reg number:");
        regNo = sc.nextLine();

        for(int i=0;i<studentCounter;i++){
            if(regNo.equalsIgnoreCase(theStudents[i].regNo)){
                return i;
            }
        }
        System.out.println("Student not found");
        System.out.println("Get registered first");
        return -1;
    }

    //Method to remove the book
    public void checkOutBook(books book){
        int studentIndex= this.isStudent();

        if(studentIndex!=-1){
            System.out.println("Checking out");
            book.showAllBooks();
            book b = book.checkOutBook();

            if(b!=null){
                if(theStudents[studentIndex].bookCounter<=3){
                    System.out.println("Checking out the book");
                    theStudents[studentIndex].books[theStudents[studentIndex].bookCounter]=b;
                    theStudents[studentIndex].bookCounter++;
                    return;
                }
                else {
                    System.out.println("Cannot have more than 3 books per Student");
                    return;
                }
            }
            System.out.println("The book is not available");
        }
    }

    //Method 5 to add the book
    public void checkInBook(books book){
        int studentIndex= this.isStudent();
        if(studentIndex!=-1){
            System.out.println("S.No\t\t\tBook Name\t\t\tAuthor Name");
            student s = theStudents[studentIndex];
            for(int i=0;i<s.bookCounter;i++) {
                System.out.println(
                        s.books[i].serialNo +"\t\t\t" +
                                s.books[i].bookName + "\t\t\t" +
                                s.books[i].bookAuthor
                );
            }
            System.out.println("Enter Sno if the book to return:");

            int sno = sc.nextInt();
            for(int i=0;i<s.bookCounter;i++) {
                if(sno== s.books[i].serialNo){
                    book.checkInBook(s.books[i]);
                    s.books[i]= null;
                    s.bookCounter--;
                    System.out.println("Checked in");
                    return;
                }
            }
            System.out.println("The book is not available");


        }
    }
}
