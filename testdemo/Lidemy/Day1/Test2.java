package Day1;

public class Test2 {
    public static void main(String[] args) {
        /*2. 陣列總和
             給一個陣列 arr，裡面全都包含了數字（整數），請輸出陣列加總的結果（總和保證不超過 int 範圍）

             範例輸入：[1, 2, 3]

             範例輸出：6*/

        int [] arr = {1, 2, 3};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println(sum);
    }
}
