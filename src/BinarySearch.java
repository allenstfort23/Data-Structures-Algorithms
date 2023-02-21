import java.util.Arrays;
import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        //establish our sorted array
        int [] sortedArr = {1, 53, 62, 133, 384, 553, 605, 897, 1035, 1234};
        int searchIndex = recursiveBinarySearch(sortedArr, 0, sortedArr.length, 605);
//        System.out.println("I Found 605 at index " + searchIndex);

        Set<String> trees = new HashSet<String>();
        trees.add("Hen");
        trees.add("Jen");
        trees.add("ben");
        trees.add("Ken");
        trees.forEach(System.out::println);
        Iterator <String> ir = trees.iterator();
        while (ir.hasNext()) {
            System.out.println("Iterator Result = " + ir.next());
        }
    }

    private static int recursiveBinarySearch(int[] sortedArray, int begin, int end, int key) {
        if(begin < end) {
            int middle = begin + (end - begin) / 2;
//            System.out.println(begin + " This is the middle");
            if(key < sortedArray[middle]) {
                return recursiveBinarySearch(sortedArray, begin,  middle, key);
            } else if (key > sortedArray[middle]) {
                return recursiveBinarySearch(sortedArray, middle + 1, end, key);
            } else {
                return middle;
            }
        }
        return -(begin = 1);
    }
}
