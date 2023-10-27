public class A04_RecursionDemo3 {
    public static void main(String[] args) {
        // 需求：利用遞歸求5的階乘

        // 核心：
        // 1. 找出口
        // 2. 找規律
        // 心得：
        // 方法內部再次調用方法的時候，參數必須要更加地靠近出口
        // 第一次調用：5
        // 第二次調用：4


        // 5! = 5 * 4!;
        // 4! = 4 * 3!;
        // 3! = 3 * 2!;
        // 2! = 2 * 1!;
        // 1! = 1;

        System.out.println(getFactorialRecursion(5));
    }

    public static int getFactorialRecursion(int number){
        if(number == 1){
            return 1;
        }

        return number * getFactorialRecursion(number - 1);
    }
}
