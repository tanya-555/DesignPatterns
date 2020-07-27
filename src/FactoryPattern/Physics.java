package FactoryPattern;

public class Physics extends Subject {
    private String book;
    private String author;
    private double price;

    public Physics(String book, String author, double price) {
        System.out.println("Physics constructor called");
        this.book = book;
        this.author = author;
        this.price = price;
    }

    @Override
    public String getBook() {
        return this.book;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
