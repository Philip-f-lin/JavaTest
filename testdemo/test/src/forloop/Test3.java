package forloop;

public class Test3 {
    public static void main(String[] args) {
        /*需求：给定两个整数，被除数和除数（都是正数，且不超过int的范围）。
        将两数相除，要求不使用乘法、除法和 % 运算符。
        得到商和余数。*/

        int x = 90;
        int y = 8;

        int count = 0;

        while(x >= y){
            x = x - y;
            count++;
        }
        System.out.println("商：" + count);
        System.out.println("餘數：" + x);

    }
}
