package fifthWeek;

import java.util.Random;

public class Market {
    public static void main(String[] args) {

        // 生成一个商店(封装　カプセル化)
        Shop shop = new Shop();
        shop.open();
        shop.printProducts();

        // 找两个顾客，让他们购买一下
        Customer aki = new Customer(1000);
        Random random = new Random();
        int productNumber = random.nextInt(shop.getProducts().length) + 1; // 生成一个1-5范围的随机整数
        // 默认，这个商店里的商品是有优先顺序
        for (int i = 0; i < productNumber; i++) {
            aki.buy(shop.getProducts()[i]);
        }
    }
}
