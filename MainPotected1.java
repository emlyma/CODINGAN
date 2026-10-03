class Nenek {
    protected String rahasia = "banyak uang dilemarinya nenek";

    public void tampilkanRahasia() {
        System.out.println("Nenek mempunyai rahasia: " + rahasia);
    }
}

class Anak extends Nenek {
    public void akses() {
      System.out.println("anak mengetahui rahasia: " + rahasia); 
    }
}
public class MainPotected1 {
    public static void main(String[] args) {
        Nenek n = new Nenek();
        n.tampilkanRahasia(); 

        Anak a = new Anak();
        a.akses();
    }
}