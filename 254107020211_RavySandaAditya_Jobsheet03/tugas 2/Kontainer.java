public class Kontainer {
    private String nomorResi;
    private String namaPemilik;
    private double kapasitasMaksimal;
    private double beratMuatanSaatIni;

   
    public Kontainer(String nomorResi, String namaPemilik, double kapasitasMaksimal) {
        this.nomorResi = nomorResi;
        this.namaPemilik = namaPemilik;
        this.kapasitasMaksimal = kapasitasMaksimal; 
        this.beratMuatanSaatIni = 0; 
    }

   
    public String getNamaPemilik() {
        return namaPemilik;
    }

    public double getKapasitasMaksimal() {
        return kapasitasMaksimal;
    }

    public double getBeratMuatanSaatIni() {
        return beratMuatanSaatIni;
    }

    
    public void tambahMuatan(double berat) {
        if (this.beratMuatanSaatIni + berat <= this.kapasitasMaksimal) {
            this.beratMuatanSaatIni += berat;
        } else {
            System.out.println("Maaf, berat muatan melebihi kapasitas maksimal kontainer.");
        }
    }

   
    public void turunkanMuatan(double berat) {
        if (this.beratMuatanSaatIni - berat >= 0) {
            this.beratMuatanSaatIni -= berat;
        } else {
            System.out.println("Maaf ,Berat muatan yang diturunkan melebihi muatan saat ini!");
        }
    }

      public String getNomorResi() {
    return nomorResi;
}

    public void turunkanMuatan(int berat) {
        double batasMaksimal = this.beratMuatanSaatIni * 0.5;

        if (berat > batasMaksimal) {
            System.out.println("Maaf, demi keselamatan, pembongkaran muatan satu kali jalan tidak boleh melebihi 50% dari muatan saat ini!");
        } else {
            this.beratMuatanSaatIni = this.beratMuatanSaatIni - berat;
        }
    }
}