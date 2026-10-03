class Produk {
    protected String Nama = "Laptop";
}

class Toko extends Produk {
    protected String Nama = "Smartphone"; 
    
    public void printNama(String Nama){
        System.out.println("Data Nama sebagai parameter\t : " + Nama);
        System.out.println("Data Nama pada subclass \t : " + this.Nama);
        System.out.println("Data Nama pada superclass\t : " + super.Nama);
    }
}

class Elektronik {
    public static void main(String[] args) {
        Toko t = new Toko();
        t.printNama("Tablet");
    }
}
