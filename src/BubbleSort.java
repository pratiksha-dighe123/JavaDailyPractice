class BubbleSort {
    public static void main(String[] args) {

        int arr[] = {51, 1, 4, 2, 8};
        int temp;

        System.out.println("Before Sorting:");

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "");
        }

        // Bubble Sort
        for(int i = 0; i < arr.length - 1; i++) {

            for(int j = 0; j < arr.length - 1 - i; j++) {

                if(arr[j] > arr[j + 1]) {

                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("\nAfter Sorting:");

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}