package test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //需求：键密录入一个字符串，使用程序实现在控制台遍历该字符串
        //键盘录入一个字符串，统计该字符串中大写宇母字符，小写字母字符，数字字符出现的次数

        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入一個字符串");
        String str = sc.next();

        int smallCount = 0;
        int bigCount = 0;
        int numberCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c >= 'a' && c <= 'z') {
                smallCount++;
            } else if (c >= 'A' & c <= 'Z') {
                bigCount++;
            } else if (c >= '0' && c <= '9') {
                numberCount++;
            }
        }

        System.out.println("小寫字母有：" + smallCount + "個");
        System.out.println("大寫字母有：" + bigCount + "個");
        System.out.println("數字字母有：" + numberCount + "個");


    }
}
