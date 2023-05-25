package facade;

public class FetchData {
    private Data data;
    private FetchName name = new FetchName();
    private FetchNIM nim = new FetchNIM();
    private FetchAddress address = new FetchAddress();
    public FetchData(){
        data = new Data(name.takeName(), nim.takeNIM(), address.takeAddress());
    }
    public void fetch(){
        data.print();
    }
}
