import java.util.Arrays;
import java.util.Comparator;

public class MyArraysDemo2 {
    public static void main(String[] args) {
        //Integer[] arr = {2, 3, 1, 5, 6, 7, 8, 4, 9};

        String [] arr = {"a", "aaaa", "aaa", "aa"};
        /*Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));*/

        Arrays.sort(arr, (o1, o2) ->  o2.length() - o1.length());

        System.out.println(Arrays.toString(arr));

    }
}
