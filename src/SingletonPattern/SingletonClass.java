package SingletonPattern;

public class SingletonClass {

    private static SingletonClass instance;

    //private constructor
    private SingletonClass() {}

    public static SingletonClass getInstance() {
        if(instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }

    public void displayMsg() {
        System.out.println("This is a singleton class");
    }
}
