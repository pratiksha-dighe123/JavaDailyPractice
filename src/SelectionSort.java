class SelectionSort {

    public static void main(String[] args) {

        int arr[] = {64, 25, 12, 2, 24};

        System.out.println("Before Sorting:");

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Selection Sort Logic
        for(int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;

            for(int j = i + 1; j < arr.length; j++) {

                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swapping
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        System.out.println("\nAfter Sorting:");

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}