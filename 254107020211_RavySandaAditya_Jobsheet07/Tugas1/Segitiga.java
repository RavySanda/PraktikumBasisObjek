package Tugas1;

public class Segitiga {


    // Overloading 1
    public int totalSudut(int sudutA) {
        return 180 - sudutA;
    }

    // Overloading 2
    public int totalSudut(int sudutA, int sudutB) {
        return 180 - (sudutA + sudutB);
    }

    // Keliling dengan 3 sisi
    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    // Keliling dengan 2 sisi
    public double keliling(int sisiA, int sisiB) {
        double sisiC = Math.sqrt(
            (sisiA * sisiA) + (sisiB * sisiB)
        );

        return sisiA + sisiB + sisiC;
    }
}