package Day1;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /*1. 字串反轉
             給一個字串 str，請輸出 str 反過來的結果

             範例輸入：hello

             範例輸出：olleh*/


        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入一個字串");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        System.out.println(sb.toString());

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }


        /*for (int i = 0, j = str.length(); i < j ; i++, j--) {
            temp = str.charAt(i);
            str.charAt(i) = str.charAt(j);
        }*/
    }
}
