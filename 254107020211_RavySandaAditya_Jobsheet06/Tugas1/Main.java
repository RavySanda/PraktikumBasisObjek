package Tugas1;

public class Main {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("111", "Andi", "Malang");
        dosen1.TARIF_SKS = 100000;
        dosen1.setSKS(10); // Gaji = 1.000.000

        Dosen dosen2 = new Dosen("222", "Budi", "Surabaya");
        dosen2.TARIF_SKS = 100000;
        dosen2.setSKS(5); // Gaji = 500.000

        DaftarGaji daftar = new DaftarGaji(5);
        
        daftar.addPegawai(dosen1);
        daftar.addPegawai(dosen2);

        daftar.printSemuaGaji();
    }
}