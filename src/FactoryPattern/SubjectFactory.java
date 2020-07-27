package FactoryPattern;

public class SubjectFactory {
    public static Subject getSubject(String type, String book, String author, double price) {
        if("Physics".equalsIgnoreCase(type)) {
            return new Physics(book,author,price);
        }
        return new Maths(book,author,price);
    }
}
