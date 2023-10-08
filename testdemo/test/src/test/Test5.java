package test;

import java.util.Scanner;

public class Test5 {

    public static void main(String[] args) {
        /*描述：
        請寫一個 Java 程式，接受使用者輸入一個整數陣列，然後找到該陣列中的最大值和最小值。

        要求：

        使用者可以在程式執行時輸入整數陣列的元素，例如：1 5 3 8 2。
        使用一個名為 findMaxMin 的方法來實現找到最大值和最小值的功能。
        findMaxMin 方法應該接受整數陣列作為參數，並返回包含最大值和最小值的陣列，例如：int[] result = {max, min}。
        在 main 方法中接受使用者的輸入，然後呼叫 findMaxMin 方法來找到最大值和最小值，最後將結果印出來。*/

        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入整數陣列（以空格分隔）：");

        int [] arr = new int [5];
        for (int i = 0; i < arr.length; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }


        int [] result = findMaxMin(arr);
        System.out.println("最大值：" + result[0]);
        System.out.println("最小值：" + result[1]);







    }

    private static int[] findMaxMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }

            if(arr[i] < min){
                min = arr[i];
            }
        }

        int [] result = new int [2];
        result[0] = max;
        result[1] = min;

        return result;
    }

}