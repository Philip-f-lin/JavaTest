package array;

public class Test8ox {
    public static void main(String[] args) {
        //定义数组求最大值：33,5,22,44,55
        int[] arr = {33, 5, 22, 44, 55};

        /*
        为什么max要记录为arr[0]，默认值不能为0吗？
        不能写0，如果數組裡面是負數的話，0就會變成最大值
        max的初始化值一定要是数组中的值。
        */
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("最大值為：" + max);

        //求最小值

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("最小值為：" + min);
    }
}
