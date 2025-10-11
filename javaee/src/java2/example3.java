package java2;
import java.util.Random;
import java.util.Scanner;

public class example3 {
  public static void main(String[] args) {
    Random r = new Random();
    int randomrumber = r.nextInt(100) + 1;
    // System.out.println(randomrumber);

    Scanner sc = new Scanner(System.in);
    int guess;
    // String name = Scanner.nextLine();

    while (true) {
      System.out.println("请输入1-100之间任意一个数：");
      guess = sc.nextInt();
      if (guess == randomrumber) {
        System.out.println("恭喜你，猜对了！");
        break;
      } else if (guess < randomrumber) {
        System.out.println("你猜的数字太小了，请再试一次。");
      } else {
        System.out.println("你猜的数字太大了，请再试一次。");
      }
      System.out.println();

    }
    sc.close();
  }
}
