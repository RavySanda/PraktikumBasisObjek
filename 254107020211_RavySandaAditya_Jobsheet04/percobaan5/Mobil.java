package percobaan5;
public class Mobil {
    private String merek;
    private Mesin mesin;

    // Konstruktor untuk Composition (dipanggil dari MainPercobaan5)
    public Mobil(String merek) {
        this.merek = merek;
        this.mesin = new Mesin();
    }

    // Konstruktor untuk Aggregation (jika nanti dibutuhkan)
    public Mobil(String merek, Mesin mesin) {
        this.merek = merek;
        this.mesin = mesin;
    }

    public void tampilkanInfo(){
        System.out.println("mobil: " + merek);
        System.out.println("mesin: " + mesin.getTipe());
    }
}