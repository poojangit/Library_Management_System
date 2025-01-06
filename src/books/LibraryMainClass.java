package books;

import java.util.Scanner;

public class LibraryMainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //& User registration ---->
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        System.out.println("Hello " + name + " welcome to Library");

        //& Adding books to library --->
        Library library = new Library(3);
        System.out.println("How many books you need to add? : ");
        int numOfBooks = sc.nextInt();
        sc.nextLine();
        System.out.println("Now you can add " + numOfBooks +" books to the library !! "  );
        for(int i=0; i< numOfBooks; i++){
            System.out.println("Add your " + (i+1) + "st book");
            System.out.println("Enter the Book title: ");
            String title = sc.nextLine();
            System.out.println("Author name: ");
            String author = sc.nextLine();
            System.out.println("ISBN number: ");
            String isbn = sc.nextLine();
            Book book = new Book(title, author, isbn, false );
            library.addBook(book);
        }
        System.out.println("These are the books that are there in our library");

        //& display all the books --->
        library.getAvailableBooks();

        //& checking out the books --->
        System.out.println("Do you want to checkout some books? Type Yes or No");
        String shouldCheckout = sc.next();
        shouldCheckout = shouldCheckout.toLowerCase();
        // System.out.println(shouldCheckout);
        if(shouldCheckout.equals("yes")){
            System.out.println("Enter the isbn to checkout the books: ");
            String checkoutIsbn = sc.next();
            library.checkoutBook(checkoutIsbn);
        } else {
            System.out.println("okay");
        }

        //& returning the book --->
        System.out.println("Do you want to return the checkedout book? Type yes or no");
        String shouldReturn = sc.next();
        shouldReturn = shouldReturn.toLowerCase();
        if(shouldReturn.equals("yes")) {
            System.out.println("Enter the isbn to return the books: ");
            String returnIsbn = sc.next();
            library.returnBook(returnIsbn); 
        } else {
            System.out.println("Okay");
        }

        //& Removing a book from the library
        System.out.println("Do you want to remove the books? type yes or no");
        String shouldRemove = sc.next();
        shouldRemove = shouldRemove.toLowerCase();
        if(shouldRemove.equals(shouldRemove)){
            System.out.println("Enter the isbn to remove a perticular book");
            String removeIsbn = sc.next();
            library.removeBook(removeIsbn);
        }
        else {
            System.out.println("okay");
        }
        sc.close();

        //& Displaying available books after removing the books.
        System.out.println();
        System.out.println("Currently these books are available");
        library.getAvailableBooks();
    }
}
