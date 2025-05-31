public class PrintArrayFunction {
    public static void printArray(String[] array) {
        System.out.println("Array Elements: ");
        for (String element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        String[] fruits = { "Orange", "Mango", "Strawberry", "Date", "Blackberry" };
        printArray(fruits);

        System.out.println("Maryam Siddique");
        System.out.println("BSCS-KC-012");
    }
}
