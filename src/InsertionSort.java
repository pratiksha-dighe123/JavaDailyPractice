public class InsertionSort {

    public static void main(String[] args) {

        int arr[] = {69, 25, 12, 2, 24};

        System.out.println("Before Sorting :");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Insertion Sort Logic
        for(int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        System.out.println("\nAfter Sorting:");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
