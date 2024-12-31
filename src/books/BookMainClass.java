package books;

import java.util.Scanner;

public class BookMainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        System.out.println("Hello " + name + " welcome to Library");
        Ebook bookDetail = new Ebook("Revolution 2020", " Chethan Bhagath", "R2020", true, 30);
        System.out.println("----------------------------");
        bookDetail.displayDetails();
        sc.close();
    }
}
