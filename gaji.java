abstract class Pegawai {
    abstract double hitungGaji(int hariKerja, double bonus, double lembur);
}

class PegawaiTetap extends Pegawai {
    @Override
    double hitungGaji(int hariKerja, double bonus, double lembur) {
        return 5000000 + bonus + lembur;
    }
}

class PegawaiHarian extends Pegawai {
    @Override
    double hitungGaji(int hariKerja, double bonus, double lembur) {
        return (hariKerja * 100000) + bonus + lembur;
    }
}

public class gaji {
    public static void main(String[] args) {
        Pegawai tetap = new PegawaiTetap();
        Pegawai harian = new PegawaiHarian();

        System.out.println("Gaji Pegawai Tetap: " + tetap.hitungGaji(20, 500000, 200000));
        System.out.println("Gaji Pegawai Harian: " + harian.hitungGaji(20, 300000, 100000));
    }
}