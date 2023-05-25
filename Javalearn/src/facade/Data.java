package facade;

public class Data {
    private String nama;
    private String nim;
    private String address;
    Data(String name, String nim2, String address2){
        this.nama = name;
        this.nim = nim2;
        this.address = address2;
    }

    public void print(){
        System.out.println(nama + " " + nim + " " + address);
    }
}