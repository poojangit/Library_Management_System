package books;

import java.util.Scanner;

public class LibraryMainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        System.out.println("Hello " + name + " welcome to Library");
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
        library.displayBooks();
        sc.close();
    }
}
