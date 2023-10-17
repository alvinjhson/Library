import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        ArrayList<Book> boks = new ArrayList<>();
        String meny = "";
        //Just testing how branch works


        while (!meny.equals("5")) {
            System.out.println("1. Add a book to the library" + "\n" + "2. Search for a book by name " + "\n" + "3. List all available books " + "\n" + "4. Return a book" + "\n" + "5. Quit");
            String input = "";
            meny = sc.nextLine();

            if (meny.equals("1")) {
                library.addBooksToLibrary();
            }
            if (meny.equals("2")) {
                library.searchForBook();
            }

            if (meny.equals("3")) {
                library.showAllBoks();
            }
            if (meny.equals("4")) {
                library.returnBook();
            }
            if (meny.equals("5")) {
            }
        }
        sc.close();
    }
}