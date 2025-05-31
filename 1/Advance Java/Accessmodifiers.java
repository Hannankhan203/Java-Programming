class Account {
    public String name;
    protected String email;
    private String password;
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }
}

public class Accessmodifiers {
    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.name = "Hannan";
        acc1.email = "ak1818375@gmail.com";
        acc1.setPassword("2003");
        System.out.println(acc1.getPassword());
    }
}
