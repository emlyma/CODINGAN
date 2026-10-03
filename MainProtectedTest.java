class Nenek {
    protected String warisan = "Tanah Keluarga";
}

// Ini turunan (keluarga) ✅
class Anak extends Nenek {
    public void akses() {
        System.out.println("Anak akses: " + warisan); // ✅ bisa
    }
}

// Ini bukan turunan (tetangga) ❌
class Tetangga {
    public void akses() {
        Tetangga n = new Tetangga();

        // ❌ ERROR (tidak bisa akses protected)
         System.out.println("Tetangga akses: " + n.warisan);
    }
}


public class MainProtectedTest {
    public static void main(String[] args) {
        Anak anak = new Anak();
        anak.akses();

        Tetangga t = new Tetangga();
        t.akses();
    }
}