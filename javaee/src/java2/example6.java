
package java2;

import java.util.Random;

public class example6 {
    public static void main(String[] args) {
        int[][] a = new int[8][8];
        Random random = new Random();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = random.nextInt(100);
                System.out.println(a[i][j] + " ");
            }
            System.out.println();
        }
        int fishmax = 0;
        int[] b = new int[2];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] > fishmax) {
                    fishmax = a[i][j];
                    b[0] = i;
                    b[1] = j;

                }

            }

        }
        for (int i = 0; i < b.length; i++) {
            b[i] = b[i] + 1;

        }
        System.out.println("最多的网格为：（" + b[0] + "," + b[1] + ")");
        System.out.println("最大数列为：" + fishmax);
    }

}