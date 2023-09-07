package forloop;

public class Test2x {
    public static void main(String[] args) {
        /*需求：给你一个整数x。
        如果x是一个回文整数，打印true，否则，返回false。
        解释：回文数是指正序(从左向右)和倒序（从右向左）读都是一样的整数。
        例如，121是回文，而123不是。*/
        boolean flag = check(121);
        System.out.println(flag);

    }

    public static boolean check(int x){
        int num = 0;
        int temp = x;
        while(x != 0){
            int ge = x % 10;//4

            x = x / 10;//123

            num = num * 10 + ge;
        }


        if(temp == num){
            return true;
        }else{
            return false;
        }


    }
}