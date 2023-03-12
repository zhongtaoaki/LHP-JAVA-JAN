package fifthWeek;

import java.util.Random;

public class Customer {

    private double cash;

    public Customer(double cash) {
        this.cash = cash;
    }

    public void buy(Product product) {
        Random random = new Random();
        int quantity = random.nextInt(5) + 1; // 生成一个1-5范围的随机整数

        if (cash >= product.getPrice() * quantity) {
            cash -= product.getPrice() * quantity;
            System.out.println(
                    "购买了" + quantity + "个" + product.getType() + "商品 一共花了" + product.getPrice() * quantity + "钱, 余额还剩：" + cash );
        } else {
            System.out.println("余额不足无法购买");
        }
    }

}
