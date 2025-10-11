package java2;
import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {
        double shoppingamount;
        double payamount;
        String discountinfo;

        System.out.println("本商场今日搞促销活动，不同的购物金额可以享受的优惠力度如下：\n");
        System.out.println("购物金额不超过100元，无优惠");
        System.out.println("购物金额超过100元，但不超过200元时，打九折");
        System.out.println("购物金额超过200元，但不超过300元时，打八折");
        System.out.println("购物金额超过300元时，打七折\n");
        System.out.println("本商场今日搞促销活动，不同的购物金额可以享受的优惠力度如下：");

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的购物金额：");
        shoppingamount = sc.nextDouble();
        sc.close();

        if (shoppingamount <= 100) {
            payamount = shoppingamount;
            discountinfo = "这次不可以享受优惠";
        } else if (shoppingamount <= 200) {
            payamount = 0.9 * shoppingamount;
            discountinfo = "这次可以享受九折优惠";
        } else if (shoppingamount <= 300) {
            payamount = 0.8 * shoppingamount;
            discountinfo = "这次可以享受八折优惠";
        } else {
            payamount = 0.7 * shoppingamount;
            discountinfo = "这次可以享受七折优惠";
        }

        System.out.println("购物金额：" + shoppingamount);
        System.out.println("支付金额：" + payamount);
        System.out.println("折扣信息：" + discountinfo);

    }
}
