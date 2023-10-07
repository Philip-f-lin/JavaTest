package test;

public class Test4 {
    public static void main(String[] args) {

        for (int i = 7; i < 8; i++) {

            for (int j = 1, k = 9; j <= k; j++, k--) {
                if(j == k){
                    System.out.print(i + "x" + j);
                    System.out.print("=" + i * j + " ");
                    break;
                }
                System.out.print(i + "x" + j);
                System.out.print("=" + i * j + " ");

                System.out.print(i + "x" + k);
                System.out.print("=" + i * k + " ");


            }

            System.out.println();
        }
    }
}
