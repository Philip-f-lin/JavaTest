public class A03_BlockSearchDemo {
    public static void main(String[] args) {
        /*
        分塊查找
         核心恩想：
         塊內無序，塊間有序
         實現步驟：
         1. 建立數組b1ockArr存放每個區塊物件的訊息
         2. 先找b1ockArr確定要找的資料屬於哪一塊
         3. 再單獨遍歷這一塊資料即可
         */

        int [] arr = {16, 5, 9, 12, 21, 18,
                      32, 23, 37, 26, 45, 34,
                      50, 48, 61, 52, 73, 65};

        int number = 37;

        Block b1 = new Block(21, 0, 5);
        Block b2 = new Block(45, 6, 11);
        Block b3 = new Block(73, 12, 17);

        Block [] blockArr = {b1, b2, b3};

        int blockArrIndex = findBlockArrIndex(blockArr, number);

        int index = findIndex(blockArr, arr, number);
        System.out.println(index);

    }

    private static int findIndex(Block[] blockArr, int[] arr, int number) {
        int blockArrIndex = findBlockArrIndex(blockArr, number);


        if (blockArrIndex == -1){
            return -1;
        }

        int startIndex = blockArr[blockArrIndex].getStartIndex();
        int endIndex = blockArr[blockArrIndex].getEndIndex();

        for (int i = startIndex; i <= endIndex; i++) {
            if(number == arr[i]){
                return i;
            }
        }
        return -1;

    }


    private static int findBlockArrIndex(Block[] blockArr, int number) {
        for (int i = 0; i < blockArr.length; i++) {
            if(number <= blockArr[i].getMax()){
                return i;
            }
        }
        return -1;
    }
}

class Block{
    int max;
    int startIndex;
    int endIndex;

    public Block() {
    }

    public Block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }
}
