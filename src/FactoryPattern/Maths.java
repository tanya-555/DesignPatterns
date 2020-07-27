package FactoryPattern;

public class Maths extends Subject {

    private String book;
    private String author;
    private double price;

    public Maths(String book, String author, double price) {
        System.out.println("Maths constructor called");
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
