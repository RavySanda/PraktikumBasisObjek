public class peminjamanBuku {
int idTransaksi;
String namaPeminjam;
String judulBuku;
int jumlahHari;
int denda;
    
public void tampilkanData(){
    System.out.println("id transaksi  :"+ idTransaksi);
    System.out.println("nama peminjam  :" + namaPeminjam);
    System.out.println("judul buku yang di pinjam  :"+ judulBuku);
    System.out.println("jumlah hari terlambat  :" + jumlahHari);
    System.out.println("denda yang harus di bayar  :" + denda);
    // System.out.println("total denda  :"+hitungDenda()); // non parameter
    
}
  public int hitungDenda(int jumlahHariKeterlambatan) {
        jumlahHari = jumlahHariKeterlambatan;
        int tarif = 1000;
        denda = jumlahHari * tarif;
        return denda;
    }

    //public int hitungDenda() { // non parameter
        //int tarif = 1000;
        //denda = jumlahHari * tarif;
        //return denda;
    //}
}
