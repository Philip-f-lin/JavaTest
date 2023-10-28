public class test3 {
    public static void main(String[] args) {
        /*
        有一堆桃子，猴子第一天吃了其中的一半，並多吃了一個！
        以後每天猴子都吃目前剩下的一半，然後再多吃一個，
        第10天的時候（還沒吃），發現只剩下一個桃子了，請問，最初總共多少個桃子？

        day 10 : 1;
        day 9 : (day 10 + 1) * 2 = 4
        day 8 : (day 9 + 1) * 2 = 10
        每一天的桃子數量都是後一天數量加 1 乘以 2

        1. 出口
            day == 10 剩下 1

        2. 規律
            每一天的桃子數量都是後一天數量加 1 乘以 2

        */

        System.out.println(getCount(1));

    }

    public static int getCount(int day){
        if(day <= 0 || day >= 11){
            return -1;
        }

        if(day == 10){
            return 1;
        }

        return (getCount(day + 1) + 1) * 2;
    }
}
