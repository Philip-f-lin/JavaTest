package forloop;

import java.util.Scanner;

public class Test5x {
    public static void main(String[] args) {
        /*案例：求平方根
        需求：键盘录入一个大于等于2的整数X，计算并返回x的 平方根。
        结果只保留整数部分，小数部分将被舍去。*/

        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入一個大於2的整數");
        int number = sc.nextInt();

        for (int i = 0; i < number; i++) {
            if(i * i == number){
                System.out.println(i + "就是" + number + "的平方根");
                break;
            } else if (i * i > number) {
                System.out.println(i + "就是" + number + "的平方根整數部分");
                break;
            }

        }


        /*100
        * 10X10
        * 90
        * 10 10 9 9*/
    }
}
