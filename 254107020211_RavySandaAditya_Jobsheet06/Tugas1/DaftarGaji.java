package Tugas1;

public class DaftarGaji {
    public Pegawai[] listPegawai;
    private int jumlahPegawai = 0;

    public DaftarGaji(int kapasitas) {
        listPegawai = new Pegawai[kapasitas];
    }

    public void addPegawai(Pegawai p) {
        if (jumlahPegawai < listPegawai.length) {
            listPegawai[jumlahPegawai] = p;
            jumlahPegawai++;
        } else {
            System.out.println("Data penuh!");
        }
    }

    public void printSemuaGaji() {
        for (int i = 0; i < jumlahPegawai; i++) {
            System.out.println("Nama: " + listPegawai[i].getNama());
            System.out.println("Gaji: Rp" + listPegawai[i].getGaji());
        }
    }
}