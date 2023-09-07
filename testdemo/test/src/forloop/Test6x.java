package forloop;

import java.util.Scanner;

public class Test6x {
    public static void main(String[] args) {
        /*案例：求质数
        需求：键盘录入一个正整数X，判断该整数是否为一个质数。*/

        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入一個整數");
        int num = sc.nextInt();
        // 7 = 1 * 7
        // 8 = 2 * 4
        boolean flag = true;

        for (int i = 2; i < num; i++) {
            if (num % i  == 0){
                flag = false;
                break;
            }
        }

        if (flag){
            System.out.println(num + "是一個質數");
        }else {
            System.out.println(num + "不是一個質數");
        }
    }
}
