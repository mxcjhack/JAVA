import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.SortedSet;

public class test1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 7, 8};
        int[] arr2 = Arrays.copyOf(arr1, 4);
        System.out.println(Arrays.toString(arr2));
        int[] arr3 = Arrays.copyOf(arr2, 4);
        int[] arr4 = {1, 2, 3, 4};
        System.out.println(Arrays.equals(arr2, arr3));
        System.out.println(Arrays.equals(arr2, arr4));
        System.out.println(arr2 == arr4);
        System.out.println(Arrays.binarySearch(arr1, 3));
        Arrays.fill(arr3, 7);
        System.out.println(Arrays.toString(arr3));
    }
}
