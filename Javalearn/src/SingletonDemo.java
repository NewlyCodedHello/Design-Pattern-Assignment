
public class SingletonDemo {
    private static SingletonDemo instance = null;
    private SingletonDemo(){
        System.out.println("instance created");
    }
    public static synchronized SingletonDemo getInstance() {
        if (instance == null){
            instance = new SingletonDemo();
        }
        return instance;
    }
}
