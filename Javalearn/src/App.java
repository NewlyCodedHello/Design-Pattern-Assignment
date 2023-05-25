import facade.FetchData;
import observer.Observer;
import observer.Subscriber;
import observer.Topic;

public class App {
    public static void main(String[] args) throws Exception {
        
        //tes Singleton
        SingletonDemo sd = SingletonDemo.getInstance();
        SingletonDemo sd2 = SingletonDemo.getInstance();
        System.out.println();

        //tes Observer
        Topic tp = new Topic();
        Observer obs = new Subscriber("Sub");
        tp.register(obs);
        obs.setSubject(tp);
        obs.update();
        tp.postMessage("tes");
        System.out.println();

        //tes Facade
        FetchData data = new FetchData();
        data.fetch();
    }
}

