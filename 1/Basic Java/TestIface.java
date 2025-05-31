interface Callback {
    void callback(int p);
}

class Client implements Callback {
    public void callback(int p) {
        System.out.println("Callback called with " + p);
    }
}

class AnotherClient implements Callback {
    public void callback(int p) {
        System.out.println("Another version of callback");
        System.out.println("p squared is " + (p * p));
    }
}

class TestIface {
    public static void main(String[] args) {
        // Create a reference of type Callback and assign it to Client
        Callback c = new Client();
        c.callback(42);

        // Create an instance of AnotherClient and assign to the interface reference
        AnotherClient ob = new AnotherClient();
        c = ob;
        c.callback(42);
    }
}
