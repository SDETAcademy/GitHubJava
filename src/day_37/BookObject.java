package day_37;

import java.util.Random;

public class BookObject {
    public static void main(String[] args) {

        Book myBook = new Book();
        Random random = new Random();
        myBook.numberOfPages = random.nextInt(2000);
        myBook.publishingAgency = "Abagagalamaga";
        myBook.author = "J.K.Rowling";
        myBook.coverType = "Hard Cover";
        myBook.review = 4.9;
        myBook.name = "Harry Potter";

        myBook.buying();
        myBook.pause(105);
        myBook.read();
        Book.trading(myBook.name);

        Book bookTwo = new Book(2500, "Talking", "Soft Cover", "Lord of the Rings", 4.5, "American Press");
        bookTwo.read();
        bookTwo.pause(111);
        bookTwo.buying();
        Book.trading(bookTwo.name);

    }
}
