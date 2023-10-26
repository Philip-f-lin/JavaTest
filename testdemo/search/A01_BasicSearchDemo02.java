import java.util.ArrayList;
import java.util.List;

public class A01_BasicSearchDemo02 {
    public static void main(String[] args) {
        //課堂練習1:
        //需求：定義一個方法利用基本查找，查詢某個元素在陣列中的索引
        //要求：不需要考慮數組中元素是否重複

        int [] arr = {131, 127, 147, 81, 103, 23, 7, 79};
        int number = 8;

        //System.out.println(searchDemo(arr, number));


        //課堂練習2:
        //需求：定義一個方法利用基本查找，查詢某個元素在陣列中的索引
        //需求：需要考慮數組中元素有重複索引

        int [] arr1 = {131, 127, 147, 81, 103, 23, 81, 7, 79, 81};
        int number1= 81;
        System.out.println(searchDemo1(arr1, number1));

    }


    public static int searchDemo(int [] arr, int number){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number){
                return i;
            }
        }
        return -1;
    }

    public static List<Integer> searchDemo1(int [] arr, int number){
        int i = 0;
        List<Integer> list = new ArrayList<>();
        while(i < arr.length){
            if(arr[i] == number){
                list.add(i);
                i++;
            }else {
                i++;
            }
        }
        return list;
    }
}
