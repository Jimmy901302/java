
import java.util.Scanner;
public class example2 {
    public example2() {
    }

    public static void main(String[] args) {
        int total = 20;
        int pencil = 1;
        int rubber = 2;
        int exercisebook = 3;
        int pencilbox = 5;
        System.out.println("1.铅笔所需的积分是：" + pencil);
        System.out.println("2.橡皮所需的积分是：" + rubber);
        System.out.println("3.练习册所需的积分是：" + exercisebook);
        System.out.println("4.铅笔盒所需的积分是：" + pencilbox);

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入所需兑换的商品编号：");
        int id = sc.nextInt();
        // 11sc.close();
        int odd = total;

        switch (id) {
            case 1:
                odd = total - pencil;
                break;
            case 2:
                odd = total - rubber;
                break;
            case 3:
                odd = total - exercisebook;
                break;
            case 4:
                odd = total - pencilbox;
                break;

            default:
                System.out.println("您输入的信息有误");
                break;
        }
        System.out.println("请您输入继续操作编号：");
        System.out.println("0.不操作");
        System.out.println("1.铅笔所需的积分是：" + pencil);
        System.out.println("2.橡皮所需的积分是：" + rubber);
        System.out.println("3.练习册所需的积分是：" + exercisebook);
        System.out.println("4.铅笔盒所需的积分是：" + pencilbox);

        int nextId = sc.nextInt();
        switch (nextId) {
            case 0:
                System.out.println("本次兑换完成");
                break;
            case 1:
                int pencilsum = odd / pencil;
                int pencilsuplus = odd % pencil;
                System.out.println("还可以兑换铅笔" + pencilsum + "个，并剩下" + pencilsuplus + "积分");
                break;
            case 2:
                int rubbersum = odd / rubber;
                int rubbersuplus = odd % rubber;
                System.out.println("还可以兑换橡皮" + rubbersum + "个，并剩下" + rubbersuplus + "积分");
                break;

            case 3:
                int pexercisebooksum = odd / exercisebook;
                int pexercisebooksuplus = odd % exercisebook;
                System.out.println("还可以兑换练习本" + pexercisebooksum + "个，并剩下" + pexercisebooksuplus + "积分");
                break;
            case 4:
                int pencilboxsum = odd / pencilbox;
                int pencilboxsuplus = odd % pencilbox;
                System.out.println("还可以兑换铅笔盒" + pencilboxsum + "个，并剩下" + pencilboxsuplus + "积分");
                break;
            default:
                System.out.println("您输入的编号有误");
                break;

        }
        sc.close();

    }
}
