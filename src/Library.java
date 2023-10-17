import java.util.ArrayList;
import java.util.Scanner;

public class Library {
Scanner sc = new Scanner(System.in);
    ArrayList<Book> books = new ArrayList<>();
    public void addBooksToLibrary() {
        System.out.println("Write the name of the book:");
        String bookName = sc.nextLine();

        System.out.println("Write the author's name:");
        String authorName = sc.nextLine();

        System.out.println("Write the publication year of the book:");
        String bookYear = sc.nextLine();

        System.out.println("Write the edition of the book:");
        String bookEdition = sc.nextLine();

        Book newBooks = new Book(bookName, authorName, bookYear, bookEdition);
        books.add(newBooks);
        System.out.println(newBooks);
    }
    //okey
    public void helloThere(){
        System.out.println("Hello there!!!!");
    }

    public void searchForBook() {
        boolean bookFound = false;
        System.out.println("Which book are you looking for?");
        String nput = sc.nextLine();
        for (Book thatBook : books) {
            if (thatBook.getName().equals(nput)) {
                if (thatBook.isAvailable()) {
                    System.out.println("The book you are looking for exists and is available!");
                    System.out.println(thatBook);
                    System.out.println("Do you want to borrow the book? (Yes) or (No)");
                    bookFound = true;
                    nput = sc.nextLine();

                }
                if (nput.equals("Yes")) {
                    thatBook.loan();
                    System.out.println("You have borrowed the book");
                }
                else if (!thatBook.isAvailable()) {
                    bookFound = true;
                    System.out.println("The book you are looking for exists but is not available!");
                }
            }
        }if (!bookFound){System.out.println("The book does not exist");}
    }
    public void showAllBoks() {
        System.out.println("All books");
        System.out.println(books);
    }
    public void returnBook() {
        System.out.println("Which book do you want to return?");
        String put = sc.nextLine();
        boolean found = false;
        for (Book thatBook : books) {
            if (thatBook.getName().equals(put)) {
                thatBook.returnBook();
                System.out.println("The book has been returned");
                found = true;
            }

        }
        if (!found) {
            System.out.println("Book not found!");}
    }


}

