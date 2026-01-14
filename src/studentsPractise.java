import java.util.Scanner;

public class studentsPractise {

  studentPractise[] studentPractises = new studentPractise[50];

  int studentCounter=0;

  Scanner sc = new Scanner(System.in);

  //method1
    public void addStudentPractise(studentPractise studentPractise){
        for (int j = 0; j < studentCounter; j++) {
            if (studentPractise.studentid.equalsIgnoreCase(studentPractises[j].studentid)) {
                System.out.println("Student already exists");
                return;
            }

        }

        if(studentCounter<50) {
            studentPractises[studentCounter] = studentPractise;

            studentCounter++;
        }

    }

    //method2
    public void showallStudentPractises(){
        for (int i = 0; i < studentCounter; i++) {
            System.out.println(studentPractises[i].studentid);
            System.out.println(studentPractises[i].studentname);
        }
    }

    //method3
    public int isStudent(){
        String no;
        System.out.println("Enter student id:");
        no = sc.nextLine();

        for (int i = 0; i<studentCounter; i++){
            if (studentPractises[i].studentid.equalsIgnoreCase(no)){
                return i;
            }
        }
        System.out.println("Student not found, get registered first");
        return -1;

    }

    public void checkoutBooks(booksPractise bookPractise){
        int s = this.isStudent();

        if (s!=-1){
            System.out.println("Checking out book");
            bookPractise.showAllBooks();
            bookPractise b= bookPractise.checkOutBook();

            if (b!=null){
                if(studentPractises[s].bookCounter<3){
                    studentPractises[s].bookPractises[studentPractises[s].bookCounter]=b;
                    studentPractises[s].bookCounter++;
                    return;
                }else {
                    System.out.println("Cannot have more than 3 books");
                    return;
                }
            }

                System.out.println("Book Not Available");

        }
    }

    public void checkinBooks(booksPractise bookPractise){
        int s = this.isStudent();
        if (s!=-1){
            System.out.println("Checking in book");
            studentPractise sd = studentPractises[s];
            for(int i=0;i<sd.bookCounter;i++){
                System.out.println(sd.bookPractises[i].bookName);
                System.out.println(sd.bookPractises[i].authorName);
            }

            System.out.println("Enter the book id to checkin");
            int id =  sc.nextInt();

            for(int i=0;i<sd.bookCounter;i++){
                if(id==sd.bookPractises[i].sNo){
                   bookPractise.checkInBook(sd.bookPractises[i]);
                   sd.bookCounter--;
                   sd.bookPractises[i]= null;
                   return;
                }
                System.out.println("The book is not available");
            }
        }
    }



}
