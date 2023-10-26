public class A04_BlockSearchDemo {
    public static void main(String[] args) {
        int [] arr = {27, 22, 30, 40, 36,
                      13, 19, 16, 20,
                      7, 10,
                      43, 50, 48};

        int number = 11;

        Block1 b1 = new Block1(22, 40, 0, 4);
        Block1 b2 = new Block1(13, 20, 5, 8);
        Block1 b3 = new Block1(7, 10, 9, 10);
        Block1 b4 = new Block1(43, 50, 11, 13);

        Block1 [] blockArr1 = {b1, b2, b3, b4};

        findBlockArrIndex1(blockArr1, number);

        System.out.println(findIndex1(blockArr1, arr, number));


    }

    private static int findIndex1(Block1[] blockArr1, int [] arr, int number) {
        int blockArrIndex1 = findBlockArrIndex1(blockArr1, number);

        if (blockArrIndex1 == -1){
            return -1;
        }

        int startIndex = blockArr1[blockArrIndex1].getStartIndex();
        int endIndex = blockArr1[blockArrIndex1].getEndIndex();

        for (int i = startIndex; i <= endIndex; i++) {
            if(arr[i] == number){
                return i;
            }

        }
        return -1;

    }

    private static int findBlockArrIndex1(Block1[] blockArr1, int number) {
        for (int i = 0; i < blockArr1.length; i++) {
            if(number <= blockArr1[i].getMax() && number >= blockArr1[i].getMin()){
                return i;
            }
        }
        return -1;
    }
}

class Block1{
    int min;
    int max;
    int startIndex;
    int endIndex;

    public Block1() {
    }

    public Block1(int min, int max, int startIndex, int endIndex) {
        this.min = min;
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
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
