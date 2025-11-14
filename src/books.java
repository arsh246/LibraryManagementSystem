import java.util.Scanner;

public class books {

    book[] theBooks = new book[50];

    static int count=0;

    Scanner sc = new Scanner(System.in);

    //Method1 to compare the books

    public int compareBooks(book b1, book b2) {
        for(int i=0;i<count;i++){
            if(b1.bookName.equalsIgnoreCase(b2.bookName)){
                System.out.println("Book with name  already exists");
                return 0;
            }
            else if(b1.serialNo==b2.serialNo){
                System.out.println("Book with serial number  already exists");
                return 0;
            }

        }
        return 1;
    }
//Method 2 to add books
    public void addBook(book b) {
        for(int i=0;i<count;i++){

           if(this.compareBooks(b,theBooks[i])==0){
               return;
           }

        }
        if(count<50){
            theBooks[count]=b;
            count++;
        }
        else{
            System.out.println("There is no more space left to add the book in the library");
        }
    }

    //Method 3 to search by serial number
    public void searchBySno(){
        System.out.println("\t\t\t\tSEARCH BY SERIAL NUMBER\n");
        int sno;
        System.out.println("Enter SNO:");
        sno = sc.nextInt();
        for(int i=0;i<count;i++){
            if(sno==theBooks[i].serialNo){
                System.out.println(
                        "S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");
                System.out.println(theBooks[i].serialNo + "\t\t\t" +
                        theBooks[i].bookName + "\t\t\t" +
                        theBooks[i].bookAuthor + "\t\t\t" +
                        theBooks[i].availableQuantity + "\t\t\t" +
                        theBooks[i].totalQuantity);

                return;

            }

        }
        System.out.println("No Book for Serial No "
                + sno + " Found.");
    }

    //Method 4 Search by author name
    public void searchByAuthor(){
        System.out.println("\t\t\t\tSEARCH BY AUTHOR NAME\n");
        String author;
        sc.nextLine();
        System.out.println("Enter Author:");
        author = sc.nextLine();
        for(int i=0;i<count;i++){
            if(author.equalsIgnoreCase(theBooks[i].bookAuthor)){
                System.out.println(
                        "S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");
                System.out.println(theBooks[i].serialNo + "\t\t\t" +
                        theBooks[i].bookName + "\t\t\t" +
                        theBooks[i].bookAuthor + "\t\t\t" +
                        theBooks[i].availableQuantity + "\t\t\t" +
                        theBooks[i].totalQuantity);

                return;
            }
        }
        System.out.println("No Book with Author "
                + author + " Found.");

    }

    //Method 5 Showing all books
    public void showAllBooks(){
        for(int i=0;i<count;i++){
            System.out.println(
                    "S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");
            System.out.println(theBooks[i].serialNo + "\t\t\t" +
                    theBooks[i].bookName + "\t\t\t" +
                    theBooks[i].bookAuthor + "\t\t\t" +
                    theBooks[i].availableQuantity + "\t\t\t" +
                    theBooks[i].totalQuantity);

        }
    }

    //Method 6 upgrade Book Quantity
    public void upgradeBooks(){
        System.out.println("\t\t\t\tUPGRADE BOOKS QUANTITY\n");
        int sno;
        System.out.println("Enter SNO:");
        sno = sc.nextInt();
        for(int i=0;i<count;i++){
            if(sno==theBooks[i].serialNo){
                System.out.println("Enter Quantity of the books to be added:");
                int amount = sc.nextInt();
                theBooks[i].totalQuantity += amount;
                theBooks[i].availableQuantity += amount;
                return;
            }
        }
        System.out.println("No Book for Serial No "
                + sno + " Found.");
    }

    // Method 7
    // To create menu
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

    //Method 8 The book is available or not
    public int isAvailable(int sno){
        for(int i=0;i<count;i++){

            if(sno==theBooks[i].serialNo){
                if(theBooks[i].availableQuantity>0){
                    System.out.println("The book is available");
                    return i;
                }
                else{
                    System.out.println("The book is not available");
                    return -1;
                }
            }
            System.out.println("No Book for Serial No "
                    + sno + " Found.");
        }
        return -1;
    }

    //Method9 to check out book
    public book checkOutBook(){
        System.out.println("\t\t\t\tCHECK OUT BOOK\n");
        int sno;
        System.out.println("Enter SNO:");
        sno = sc.nextInt();
        int bookId=isAvailable(sno);
        if(bookId!=-1){
            theBooks[bookId].availableQuantity--;
            return theBooks[bookId];

        }
        return null;

    }
    //Method 10 To checkin book
    public void checkInBook(book b){
        System.out.println("\t\t\t\tCHECK IN BOOK\n");
        for(int j=0;j<count;j++){
        if(b.equals(theBooks[j])){
            theBooks[j].availableQuantity++;
            return;

            }
        }
    }




}
