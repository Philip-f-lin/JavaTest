package test;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        /*題目：反轉字串
        描述：
        請寫一個 Java 程式，接受使用者輸入一個字串，然後將該字串反轉。

        要求：

        使用一個名為 reverseString 的方法來實現反轉字串的功能。
        reverseString 方法應該接受一個字串作為參數，並返回反轉後的字串。
        在 main 方法中接受使用者的輸入，然後呼叫 reverseString 方法來反轉字串，最後將結果印出來。*/

        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入一個字串");
        String str = sc.nextLine();

        String reverseStr = reverseString(str);
        System.out.println(reverseStr);

    }

    public static String reverseString(String str){
        char[] charArray = str.toCharArray();

        char temp = charArray[0];
        for (int i = 0, j = charArray.length - 1; i < j; i++, j--) {

            temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;

        }
        return new String(charArray);
    }
}
