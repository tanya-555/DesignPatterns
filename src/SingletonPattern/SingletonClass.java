package SingletonPattern;

public class SingletonClass {

    private static SingletonClass instance = new SingletonClass();

    //private constructor
    private SingletonClass() {}

    public static SingletonClass getInstance() {
        return instance;
    }

    public void displayMsg() {
        System.out.println("This is a singleton class");
    }
}
