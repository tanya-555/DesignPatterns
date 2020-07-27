package FactoryPattern;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        Subject subject1 = SubjectFactory.getSubject("Physics","ABC","PQR",134.90);
        Subject subject2 = SubjectFactory.getSubject("Maths","DEF","STU",90.00);
        System.out.println(subject1);
        System.out.println(subject2);
    }
}
