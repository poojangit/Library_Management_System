package books;

import java.util.Scanner;

public class LibraryMainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        System.out.println("Hello " + name + " welcome to Library");
        Library library = new Library();
        sc.close();
    }
}
