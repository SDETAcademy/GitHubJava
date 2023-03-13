package day_37;

public class Book {
    /**
     * Let's create an class called Book.
     * Variable: numberOfPages, author, coverType, name, review, publishingAgency
     * Instance Methods: read(), pause(), buying()
     * One static method: trading book in.
     */

    public int numberOfPages;
    public String author;
    public String coverType;
    public String name;
    public double review;
    public String publishingAgency;

    public void read(){
        System.out.println("Reading a book " + name + " that has " + numberOfPages + " pages");
    }

    public void pause(int pageNumber){
        System.out.println("Stopped reading a book " + name + " at page " + pageNumber);
    }

    public void buying(){
        System.out.println("Buying a book " + name + " by author " + author + " in cover type " + coverType + " with review of "
        + review + " stars by " + publishingAgency + " agency");
    }

    public static void trading(String tradingBook){
        System.out.println("Trading in "+ tradingBook);
    }

    public Book(){
    }

    public Book(int numberOfPages, String author, String coverType, String name, double review, String publishingAgency){
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.coverType = coverType;
        this.name = name;
        this.review = review;
        this.publishingAgency = publishingAgency;
    }

}
