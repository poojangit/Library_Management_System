package books;

public class Library {
    public static final String isbn = null;
    Book[] books;
    int bookCount;

    public Library(int maxCapacity) {
        books = new Book[maxCapacity];
        bookCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
            System.out.println("Book added !!");
            System.out.println();
        } else {
            System.out.println("Library is full");
        }
    }

    public void displayBooks() {
        if (bookCount == 0) {
            System.out.println("No books available!");
        } else {
            for (int i = 0; i < bookCount; i++) {
                books[i].displayDetails();
                System.out.println("-------------------");
            }
            System.out.println();
        }
    }

    public void removeBook(String isbn) {
    }

    public void checkoutBook(String isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                if (books[i].getIsCheckedOut() == false) {
                    books[i].setIsCheckedOut(true);
                    System.out.println("Book named " + books[i].getTitle() + " is checked out");
                } else {
                    System.out.println("Book named " + books[i].getTitle() + " is already checkedout");
                }
                return;
            }
            System.out.println("Book with " + isbn + " not found");
        }
       
    }

    public void returnBook(String isbn) {
        for(int i=0; i< bookCount; i++){
            if(books[i].getIsbn().equals(isbn)){
                if(books[i].getIsCheckedOut()){
                    books[i].setIsCheckedOut(false);
                    System.out.println("Book named " + books[i].getTitle() + " returned successfully");
                } else {
                    System.out.println("Book named " + books[i].getTitle() + " not checked out");
                }
                return;
            }
            System.out.println("Book with " + isbn + " not found");
        }
    }

    public void getAvailableBooks() {
    }
}
