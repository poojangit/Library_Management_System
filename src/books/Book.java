package books;

public class Book extends LibraryItem {
    private boolean isCheckedOut;

    public Book(String title , String author, String isbn, boolean isCheckedOut){
       super(title, author, isbn);
        this.isCheckedOut = isCheckedOut;
    }

    public void setIsCheckedOut(boolean isCheckedOut) {
        this.isCheckedOut = isCheckedOut;
    }

    public boolean getIsCheckedOut() {
        return isCheckedOut;
    }

    @Override
    public void displayDetails() {
        System.out.println("Details of the book: ");
        System.out.println("Title : " + getTitle());
        System.out.println("Author : " + getAuthor());
        System.out.println("Isbn number : " + getIsbn());
        System.out.println("isCheckedOut: " + isCheckedOut);
    }
}
