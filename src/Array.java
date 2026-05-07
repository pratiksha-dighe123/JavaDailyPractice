import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        int num[] = {10, 20, 30, 40, 50};

        System.out.println("Reverse an array:");

        for (int i = num.length-1 ; i >= 0; i--) {
            System.out.println(num[i]);
        }
    }

}
