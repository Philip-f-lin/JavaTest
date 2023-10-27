import java.util.Arrays;

public class MyArraysDemo1 {
    public static void main(String[] args) {
        String [] strArr = {"1", "2", "3", "4"};



        String str = "";
        for (int i = 0; i < strArr.length; i++) {
            String s = strArr[i];

            str = str + s;
        }

        System.out.println(str);

        System.out.println("==================");

        int [] arr = {1, 2, 3, 4};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

        System.out.println(Arrays.toString(arr));


    }
}
