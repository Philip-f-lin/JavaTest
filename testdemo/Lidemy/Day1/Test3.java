package Day1;

public class Test3 {
    public static void main(String[] args) {
        /*3.找最大值
            給一個陣列 arr，裡面全都包含了數字（整數），請輸出陣列中的最大值

            範例輸入：[1, 2, 3]

            範例輸出：3*/

        int [] arr = {1, 2, 3};

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);

    }
}
