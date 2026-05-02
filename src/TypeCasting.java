public class TypeCasting {
    public static void main(String[] args) {

        //Implicit Casting (Widening)
        int num = 100;
        double bigNum = num;   // int → double (automatic)

        System.out.println("Integer value: " + num);
        System.out.println("Converted to double: " + bigNum);

        //Explicit Casting (Narrowing)
        double decimal = 9.78;
        int smallNum = (int) decimal;   // double → int (manual)

        System.out.println("Double value: " + decimal);
        System.out.println("Converted to int: " + smallNum);
    }
}