package string;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /*已知正确的用户名和密码，请用程序实现模拟用户登录。
        总共给三次机会，登录之后，给出相应的提示  P100*/

        String username = "abcd";
        String password = "1234";

        Scanner sc = new Scanner(System.in);


        int count = 0;
        while (count <= 3) {
            System.out.println("請輸入帳號");
            String checkUsername = sc.nextLine();

            System.out.println("請輸入密碼");
            String checkPassword = sc.nextLine();
            count++;
            if (username.equals(checkUsername) && password.equals(checkPassword)) {
                System.out.println("登錄成功");
                break;
            } else {
                if(count == 3){
                    System.out.println("帳號已被鎖定");
                    break;
                }
                System.out.println("登錄失敗，還有" + (3 - count) + "次機會");
            }
        }

    }
}
