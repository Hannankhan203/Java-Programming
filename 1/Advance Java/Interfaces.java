interface Animal {
    int eyes = 2;
    void walk();
}

interface Herbivore {
    
}

class Horse implements Animal, Herbivore {
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
    }
}
