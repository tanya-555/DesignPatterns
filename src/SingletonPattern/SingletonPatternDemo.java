package SingletonPattern;

public class SingletonPatternDemo {

    public static void main(String[] args) {
        SingletonClass object = SingletonClass.getInstance();
        object.displayMsg();
    }
}
