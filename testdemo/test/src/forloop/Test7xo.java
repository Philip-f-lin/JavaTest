package forloop;

import java.util.Random;
import java.util.Scanner;

public class Test7xo {
    public static void main(String[] args) {
        /*需求：程序自动生成一-个1-100之间的随机数字，
        使用程序实现猜出这个数字是多少？*/


        //抽奖机制
        //保底
        int count = 0;

        Random r = new Random();
        int number = r.nextInt(100) + 1;

        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println("請輸入要猜的整數");
        int guessNumber = sc.nextInt();

            count++;
            //保底
            if(count == 3){
                System.out.println("猜中了");
            }

            if(guessNumber > number){
                System.out.println("大了");

            } else if (guessNumber < number) {
                System.out.println("小了");

            }else {
                System.out.println("猜中了，數字為" + number);
                break;
            }
        }


    }
}
