import java.util.ArrayList;
import java.util.List;

public class A01_BasicSearchDemo02 {
    public static void main(String[] args) {
        //课堂练习1:
        //需求：定义一个方法利用基本查找，查询某个元素在数组中的索引
        //要求：不需要考虑数组中元素是否重复

        int [] arr = {131, 127, 147, 81, 103, 23, 7, 79};
        int number = 8;

        //System.out.println(searchDemo(arr, number));


        //课堂练习2:
        //需求：定义一个方法利用基本查找，查询某个元素在数组中的索引
        //要求：需要考虑数组中元素有重复索引

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
