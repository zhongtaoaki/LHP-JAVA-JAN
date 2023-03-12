package fifthWeek;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Market {
    public static void main(String[] args) {

        // 生成一个商店(封装 カプセル化)
        Shop shop = new Shop();
        shop.open();
        shop.printProducts();

        // 找两个顾客，让他们购买一下
        Customer aki = new Customer(2000);
        // Random random = new Random();
        // int productNumber = random.nextInt(shop.getProducts().length) + 1; //
        // 生成一个1-5范围的随机整数

        Map<Product, Integer> wishList = new HashMap<>();
        wishList.put(Product.APPLE, 2);
        wishList.put(Product.COFFEE, 1);
        wishList.put(Product.COLA, 5);
        wishList.put(Product.MILK, 1);

        for (Product product : wishList.keySet()) {
            aki.buy(product, wishList.get(product));
        }
    }
}
