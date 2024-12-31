package books;

public class Book {
   private String title;
   private String author;
   private String isbn;
   private boolean isCheckedOut;

   public void setTitle(String title){
    this.title = title;
   }
   public String getTitle(){
    return title;
   }
   public void setAuthor(String author){
    this.author = author;
   }
   public String getAuthor() {
    return author;
   }
   public void setIsbn(String isbn){
    this.isbn = isbn;
   }
   public String getIsbn() {
    return isbn;
   } 
   public void setIsCheckedOut(boolean isCheckedOut){
    this.isCheckedOut = isCheckedOut;
   }
   public boolean getIsCheckedOut() {
    return isCheckedOut;
   }
}
