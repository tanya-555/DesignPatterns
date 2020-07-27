package FactoryPattern;

public abstract class Subject {

    public abstract String getBook();
    public abstract String getAuthor();
    public abstract double getPrice();

    @Override
    public String toString() {
        return "Book: " + this.getBook() + " Author: " + this.getAuthor() + " Price: "+this.getPrice();
    }
}
