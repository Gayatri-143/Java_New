//package Exp5;
import LibraryManagement.*;


public class Main {
    public static void main(String[] args) {
        // Create some books
        Book book1 = new Book("1984", "George Orwell", "9780451524935");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084");

        // Create some members
        Member member1 = new Member("Gayatri", 101);
        Member member2 = new Member("Satej", 102);

        // Display book and member info
        System.out.println("Library Books:");
        book1.displayInfo();
        book2.displayInfo();

        System.out.println("\nLibrary Members:");
        member1.displayInfo();
        member2.displayInfo();
    }
}
