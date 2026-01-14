import java.util.Scanner;

public class booksPractise {

    bookPractise[] books = new bookPractise[50];

    static int count;
    Scanner scanner = new Scanner(System.in);

    //method 1
    public  int compareBooks(bookPractise book1, bookPractise book2) {
        if(book1.bookName.equalsIgnoreCase(book2.bookName)){
            System.out.println("Book with name already exists");
            return 0;
        }
        if(book1.sNo==book2.sNo){
            System.out.println("Book with sNo already exists");
            return 0;
        }
        return 1;
    }

    //method 2
    public void addBook(bookPractise book) {
        for(int j=0;j<count;j++){
            if(compareBooks(book,this.books[j])==0){
                return;
            }
        }
        if(count<50){
            books[count]=book;
            count++;
        }
        else {
            System.out.println("Cannot add more books");
        }
    }

    //method 3
    public void searchBySerialNumber() {
        System.out.println("Enter Serial Number");
        int s = scanner.nextInt();


        for(int i=0;i<count;i++){
            if(s==books[i].sNo){
                System.out.println("Book with serial number "+s+" is found");

                return;

            }
        }
        System.out.println("Book with serial number " + s + " not found");

    }

    //method 4
    public void searchByauthor() {
        System.out.println("Enter Author");
        String a = scanner.next();
        for(int i=0;i<count;i++){
            if(a.equalsIgnoreCase(books[i].authorName)){
                System.out.println("Book with author "+a+" is found");
            }
        }
        System.out.println("Book with author " + a + " not found");

    }

    //Method 5
    public void showAllBooks() {
        for(int i=0;i<count;i++){
            System.out.println(books[i].bookName);
            System.out.println(books[i].sNo);
            System.out.println(books[i].authorName);
            System.out.println(books[i].availqty);
        }
    }

    //Method 6
    public void updateBook() {
        System.out.println("Enter Serial Number");
        int s = scanner.nextInt();
        for(int i=0;i<count;i++){
            if(s==books[i].sNo){
                System.out.println("Enter the quantity:");
                int q = scanner.nextInt();
                books[i].availqty += q;
                books[i].bookqty += q;
                return;
            }
        }
        System.out.println("Book with serial number " + s + " not found");
    }

    //method 7
    public void dispMenu()
    {

        // Displaying menu
        System.out.println(
                "----------------------------------------------------------------------------------------------------------");
        System.out.println("Press 0 to Exit Application.");
        System.out.println("Press 1 to Add new Book.");
        System.out.println(
                "Press 2 to Upgrade Quantity of a Book.");
        System.out.println("Press 3 to Search a Book.");
        System.out.println("Press 4 to Show All Books.");
        System.out.println("Press 5 to Register Student.");
        System.out.println(
                "Press 6 to Show All Registered Students.");
        System.out.println("Press 7 to Check Out Book. ");
        System.out.println("Press 8 to Check In Book");
        System.out.println(
                "-------------------------------------------------------------------------------------------------------");
    }

    //Method 8
    public int isAvailable(int sno){
        for(int i=0;i<count;i++){
            if(sno==books[i].sNo){
                if(books[i].availqty>0){
                    System.out.println("Book with serial number "+sno+" is available");
                    return i;
                }
                else{
                    System.out.println("Book with serial number "+sno+" not available");
                    return -1;
                }
            }
             System.out.println("Book with serial number " + sno + " not found");

        }
        return -1;
    }

    //method 9
    public bookPractise checkOutBook() {
        System.out.println("Enter Serial Number");
        int s = scanner.nextInt();
        int bookid = isAvailable(s);

        if(bookid<0){
            System.out.println("Book with serial number "+s+" not found");
            return null;
        }
        books[bookid].availqty--;
        return books[bookid];
    }

    //method 10
    public void checkInBook(bookPractise book) {
        for(int i=0;i<count;i++){
            if(book.equals(books[i])){
                books[i].availqty++;
                return;
            }

        }


    }







    }

