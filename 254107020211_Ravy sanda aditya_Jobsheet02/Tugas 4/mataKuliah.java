public class mataKuliah {
  String kodeMk,namaMk;
  int sks;
  double nilaiAngka;


  public void tampilkanData(){
    System.out.println("kode Mata Kuliah :"+ kodeMk);
    System.out.println("nama mata kuliah  :" + namaMk);
    System.out.println("jumlah sks  :"+ sks);
    System.out.println("nilai akhir  :" + nilaiAngka);
    System.out.println("Total bobot nilai  :" + hitungBobotNilai());
  }

  public double hitungBobotNilai(){
    double bobotNilai = sks * nilaiAngka;
    return bobotNilai; 
  }

}
