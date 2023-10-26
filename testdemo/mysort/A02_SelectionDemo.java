public class A02_SelectionDemo {
    public static void main(String[] args) {
        /*
        選擇排序：
         1，從0索引開始，跟著後面的元素一一比較。
         2，小的放前面，大放的後面。
         3，第一次循環結束後，最小的數據己經確定。
         4，第二次循環從1索引開始以此類推。
        */

        int [] arr = {2, 4, 5, 3, 1};

        // 外循環：幾輪
        // i：表示這一輪中，拿著哪個索引上的數據跟後面的數據進行比較
        for (int i = 0; i < arr.length - 1; i++) {
            // 內循環：每一輪我要做什麼事情
            // 拿著 i 跟 i 後面的數據進行比較交換
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        printArr(arr);
    }

    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
