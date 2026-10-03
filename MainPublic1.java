class Nenek {
    public String rahasia = "banyak uang dilemarinya nenek";

    public void tampilkanRahasia() {

        System.out.println("Nenek mempunyai rahasia: " + rahasia);
    }
}

class Anak extends Nenek {
    public void akses() {

        System.out.println("anak mengetahui rahasia: " + rahasia); 
    }
}

class Tetangga {
    public void akses() {
        Nenek n = new Nenek();
        System.out.println("Tetangga mengetahui rahasia: " + n.rahasia); 
    }
}

public class MainPublic1 {
    public static void main(String[] args) {
        Nenek n = new Nenek();
        n.tampilkanRahasia(); 

        Anak a = new Anak();
        a.akses();

        Tetangga t = new Tetangga();
        t.akses();
    }
}