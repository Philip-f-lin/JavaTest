public class A04_RecursionDemo2 {
    public static void main(String[] args) {
        // 需求：利用遞歸求 1 ~ 100 之間的和

        // 大問題拆解成小問題
        // 1 ~ 100 之間的和 = 100 + (1 ~ 99 之間的和)
        // 1 ~ 99 之間的和 = 99 + (1 ~ 98 之間的和)
        // ...
        // 1 ~ 2 之間的和 = 1 + (1 ~ 1 之間的和)
        // 1 ~ 1 之間的和 = 1 (遞歸的出口)

        // 核心：
        // 1. 找出口
        // 2. 找規律

        System.out.println(getSum(100));

    }

    public static int getSum(int number){
        if (number == 1){
            return 1;
        }

        return number + getSum(number - 1);
    }

}
