public class ruangKelas {
String kodeRuang;
String namaGedung;
int kapasitas;
int jumlahMahasiswa;


public void tampilkanData(){
    System.out.println("kode ruang :"+ kodeRuang);
    System.out.println("nama gedung  :" + namaGedung);
    System.out.println("Kapasitas ruang kelas  :"+ kapasitas);
    System.out.println("jumlah mahasiswa  :" + jumlahMahasiswa);
    System.out.println("Sisa kursi  :" + hitungSisaKursi());
}
   
   public int hitungSisaKursi(){
      int sisaKursi = kapasitas - jumlahMahasiswa;
      return sisaKursi;
  
   }

}
