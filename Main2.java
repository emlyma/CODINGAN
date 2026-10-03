class Jurusan {
    protected String namaJurusan;
    protected String namaFakultas;

    public Jurusan(String namaJurusan, String namaFakultas) {
        this.namaJurusan = namaJurusan;
        this.namaFakultas = namaFakultas;
    }
}

class JalurMasuk extends Jurusan {
    private String jalur;

    public JalurMasuk(String namaJurusan, String namaFakultas, String jalur) {
        super(namaJurusan, namaFakultas);
        this.jalur = jalur;
    }

    public void tampilkanInfo() {
        System.out.println("Jurusan     : " + namaJurusan);
        System.out.println("Fakultas    : " + namaFakultas);
        System.out.println("Jalur Masuk : " + jalur);
    }
}

public class Main2 {
    public static void main(String[] args) {
        JalurMasuk data = new JalurMasuk(
            "Sistem Informasi",
            "Ilmu Komputer",
            "SNBP"
        );

        data.tampilkanInfo();
    }
}