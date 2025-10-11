package java2;

import java.util.Scanner;

public class example4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] scores = new int[3][3];
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个学生的三门考试成绩：");
            for (int j = 0; j < scores[i].length; j++) {
                scores[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];
            }
            double avg = sum / (double) scores[i].length;
            System.out.println("第" + (i + 1) + "个学生的平均分是：" + avg);
        }
   
        int maxIndex = 0;
        double maxAvg = 0;
        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];
            }
            double avg = sum / (double) scores[i].length;
            System.out.print("第" + (i + 1) + "个学生的成绩单是：");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(scores[i][j] + " ");
            }
            System.out.println("平均分是：" + avg);
            if (avg > maxAvg) {
                maxAvg = avg;
                maxIndex = i;
            }
        }
        System.out.println("平均成绩最高的学生是第" + (maxIndex + 1) + "个学生，平均分是：" + maxAvg);
        sc.close();

    }
}