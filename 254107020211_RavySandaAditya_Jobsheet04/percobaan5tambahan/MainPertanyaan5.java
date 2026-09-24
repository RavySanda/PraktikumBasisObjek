package percobaan5tambahan;
public class MainPertanyaan5 {
    public static void main(String[] args) {
        // Objek Mesin diciptakan di LUAR class Mobil
        Mesin m = new Mesin(); 
        
        // Mesin dimasukkan ke dalam mobil lewat parameter
        Mobil mobilKu = new Mobil("Honda", m); 
        
        mobilKu.tampilkanInfo();
    }
}