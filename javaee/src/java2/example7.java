package java2;


import java.util.Scanner;

public class example7 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请选择要计算的图形面积：");
            System.out.println("1.矩形");
            System.out.println("2.正方形");
            System.out.println("3.圆形");
            System.out.println("4.三角形");
            System.out.println("5.退出");
            int choice = sc.nextInt();
            if (choice == 5) {
                System.out.println("退出程序");
                break;
            }
            switch (choice) {
                case 1:
                    System.out.println("请输入矩形的长和宽：");
                    double length = sc.nextDouble();
                    double width = sc.nextDouble();
                    double rectangleArea = length * width;
                    System.out.println("矩形的面积是：" + rectangleArea);
                    break;
                case 2:
                    System.out.println("请输入正方形的边长：");
                    double side = sc.nextDouble();
                    double squareArea = side * side;
                    System.out.println("正方形的面积是：" + squareArea);
                    break;
                case 3:
                    System.out.println("请输入圆形的半径：");
                    double radius = sc.nextDouble();
                    double circleArea = Math.PI * radius * radius;
                    System.out.println("圆形的面积是：" + circleArea);
                    break;
                case 4:
                    System.out.println("请输入三角形的底和高：");
                    double base = sc.nextDouble();
                    double height = sc.nextDouble();
                    double triangleArea = 0.5 * base * height;
                    System.out.println("三角形的面积是：" + triangleArea);
                    break;
                default:
                    System.out.println("输入错误，请重新选择！");
            }
            System.out.println();
        }
        sc.close();

    }
}
