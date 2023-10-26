public class A02_BinarySearchDemo1 {
    public static void main(String[] args) {
        //需求：定義一個方法利用二分查找，查詢某個元素在陣列中的索引
        //數據如下：{7， 23, 79, 81, 103, 127, 131, 147}

        int [] arr = {7, 23, 79, 81, 103, 127, 131, 147};
        int number = 150;

        System.out.println(binarySearch(arr, number));
    }


    public static int binarySearch(int [] arr, int number){
        int min = 0;
        int max = arr.length - 1;

        while(true){

            if (min > max){
                return -1;
            }

            int mid = (min + max) / 2;

            if(arr[mid] < number){
                min = mid + 1;
            } else if (arr[mid] > number) {
                max = mid - 1;
            } else if (arr[mid] == number) {
                return mid;
            }
        }
    }
}
