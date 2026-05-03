public class NestedIfExample {
    public static void main(String[] args) {

        int age = 20;

        if (age >= 18) {
            if (age >= 21) {
                System.out.println("Eligible for everything");
            } else {
                System.out.println("Eligible for voting only");
            }
        } else {
            System.out.println("Not eligible");
        }
    }
}