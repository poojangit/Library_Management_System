package books;

public class Ebook extends Book {
    int fileSize;

    //! contructor overloading
    public Ebook(String title, String author, String isbn, boolean isCheckedOut, int fileSize){
        super(title, author, isbn, isCheckedOut);
        this.fileSize = fileSize;
    }
    public void download(){
        System.out.println("Downloading the book...");
    }
   
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("File size : " + fileSize + " MB");
    }
}
