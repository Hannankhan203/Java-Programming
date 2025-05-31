public class Mid4 {
    public static void main (String args[]) {
        for (float i = 1.0f; i <= 5.0f; i += 1.0f) {
            if (i > 3.0f) {
                System.out.println(i + " is greater than 3.0");
            }
            else if (i == 3.0f) {
                System.out.println(i + " is equal to 3.0");
            }
            else {
                System.out.println(i + " is less than 3.0");
            }
        }
    }
}
