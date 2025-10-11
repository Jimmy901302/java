package java2;

public class example5 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int n = 20;
        System.out.println("前20项为：");
        System.out.println(a + " " + b + " ");

        for (int i = 3; i <= n; i++) {
            int next = a + b;
            System.out.println(next + " ");
            a = b;
            b = next;
        }

    }
}
