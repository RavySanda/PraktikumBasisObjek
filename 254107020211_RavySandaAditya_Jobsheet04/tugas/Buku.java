package tugas;
public class Buku {
    private String judul;
    private String pengarang;

    public Buku(String judul, String pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }

    public String getJudul() { 
        return judul; 
    }

    public void tampilkanInfo() {
        System.out.println("- " + judul + " (Karya: " + pengarang + ")");
    }
}