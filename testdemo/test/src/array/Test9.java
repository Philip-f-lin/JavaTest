package array;

import java.util.Random;

public class Test9 {
    public static void main(String[] args) {
        /*需求：生成10个1~100之问的随机数存入数组。
        1）求出所有数据的和
        2）求所有数据的平均数
        3）统计有多少个数据比平均值小*/

        Random r = new Random();

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            int num = r.nextInt(100) + 1;
            arr[i] = num;
        }

        // 求出所有数据的和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("總和為" + sum);

        // 求所有数据的平均数
        int avg = sum / arr.length;
        System.out.println("所有数据的平均数" + avg);

        // 统计有多少个数据比平均值小
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < avg) {
                count++;
            }
        }
        System.out.println(count + "個數據比平均值小");
    }
}
