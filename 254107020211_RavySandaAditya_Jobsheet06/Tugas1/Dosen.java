package Tugas1;

public class Dosen extends Pegawai {
    public int jumlahSKS;
    public int TARIF_SKS;

    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat); 
    }

    public void setSKS(int sks) {
        this.jumlahSKS = sks;
    }


    @Override
    public int getGaji() {
        return jumlahSKS * TARIF_SKS;
    }
}