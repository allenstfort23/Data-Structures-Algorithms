import java.util.*;
import java.math.*;
import java.util.Arrays;

public class ExponentialSearch {
    public static void main(String[] args) {
        int[] array = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60};
        // looking for 50
        int searchValue = 50;
        int result = expSearch(array, array.length, searchValue);
        System.out.println("Element is present at index: " + result);
    }

    static int expSearch(int[] array, int n, int searchValue) {
        // if value is at position one
        if(array[0] == searchValue) {
            return 0;
        }

        // find the range for the binary
        int i = 1;
        while(i < n && array[i] <= searchValue) {
            i = i * 2;
        }

        // now call the binary search
        return Arrays.binarySearch(array, (i / 2), Math.min(i, n), searchValue);
    }
}

