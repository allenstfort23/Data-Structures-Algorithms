public class SelectionSort {
    void sort(int arr[]) {

        int n = arr.length;

        // Traverse the unsorted subarray
        for(int index = 0; index < n - 1; index++) {

            // Find the smallest element in unsorted array
            int min = index;

            for(int j = index + 1; j < n; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }

            // Swap the smallest element with the first element
            int temp = arr[min];
            arr[min] = arr[index];
            arr[index] = temp;
        }
    }

    // Print the array
    void printArray(int arr[]) {

        int n = arr.length;
        for( int i =0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Test the code
    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();
        int[] arr = {95, 42, 13, 9, 23};

        ss.sort(arr);
        System.out.println("The sorted array is: ");
        ss.printArray(arr);
    }
}
