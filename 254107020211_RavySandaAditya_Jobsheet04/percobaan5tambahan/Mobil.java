package percobaan5tambahan;
public class Mobil {
    private String merek;
    private Mesin mesin;

    // Sesuai instruksi soal: constructor menerima parameter Mesin
    public Mobil(String merek, Mesin mesin) { 
        this.merek = merek; 
        this.mesin = mesin; 
    }

    public void tampilkanInfo() {
        System.out.println("Mobil: " + merek);
        System.out.println("Mesin: " + mesin.getTipe());
    }
}