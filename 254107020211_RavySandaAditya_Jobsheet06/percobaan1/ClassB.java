package percobaan1;

public class ClassB extends ClassA { // Penambahan extends 
    public int z;

    public void getNilaiZ(){
        System.out.println("nilai Z:" + z);
    }

    public void getJumlah(){
        System.out.println("jumlah:" + (x + y + z));
    }
}