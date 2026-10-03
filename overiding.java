class Hewan {
    void bersuara() {
        
    }
}

class Kucing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Meong");
    }
}

class Anjing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Guk guk");
    }
}

class overiding {
    public static void main(String[] args) {
        Kucing k = new Kucing();
        k.bersuara(); 

        Anjing a = new Anjing();
        a.bersuara(); 
    }
}