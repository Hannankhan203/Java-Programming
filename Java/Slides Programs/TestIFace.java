interface Callback{
    void callback(int p);
}

class Client implements Callback{
    public void callback(int p){
        System.out.println("Callback with " + p);
    }
}

class AnotherClient implements Callback{
    public void callback(int p){
        System.out.println("Another version of callback");
        System.out.println("p squared is: " + (p * p));
    }
}

public class TestIFace {
    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();

        c.callback(42);
        c = ob;
        c.callback(42);
    }
}
