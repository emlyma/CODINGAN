class Nenek {
    public String halaman = "Halaman Rumah Terbuka";
}

class Tetangga {
    public void lihat(Nenek n) {
        System.out.println("Tetangga : " + n.halaman);
    }
}

public class MainPublic {
    public static void main(String[] args) {
        Nenek nenek = new Nenek();
        Tetangga tetangga = new Tetangga();

        // Keluarga bisa
        System.out.println("Keluarga: " + nenek.halaman);

        // Tetangga juga bisa
        tetangga.lihat(nenek);
    }
}