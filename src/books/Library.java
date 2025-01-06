package books;


public class Library {
     Book[] books;
     int bookCount;

     public Library(int maxCapacity){
        books = new Book[maxCapacity];
        bookCount = 0;
     }
    public void addBook(Book book) {
        if (bookCount<books.length) {
            books[bookCount] = book;
            bookCount++;
            System.out.println("Book added !!");
            System.out.println();
        }
        else {
            System.out.println("Library is full");
        }
    }
    public void displayBooks(){
        if(bookCount == 0){
            System.out.println("No books available!");
        } 
        else{
            for(int i=0; i<bookCount; i++){
                books[i].displayDetails();
               System.out.println("-------------------");
            }
            System.out.println();
        }
    }
    public void removeBook(String isbn){}
    public void checkoutBook(String isbn){}
    public void returnBook(String isbn) {}
    public void getAvailableBooks(){}
}
