package interfacelatihan;

public class PascaSarjana extends Mahasiswa implements ICumlaude, IBerprestasi {
    public PascaSarjana(String nama) {
        super(nama);
    }

    @Override 
    public void menjuaraiKompetisi() {
        System.out.println("Saya telah menjuarai kompetisi Internasional.");
    }

    @Override 
    public void membuatPublikasiIlmiah() {
        System.out.println("Saya telah menerbitkan artikel di jurnal Internasional.");
    }

    @Override
    public void lulus() {
        System.out.println("Aku sudah menyelesaikan TESIS");
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-ku lebih dari 3,71");
    }
    
}
