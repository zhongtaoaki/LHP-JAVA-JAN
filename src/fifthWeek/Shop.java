package fifthWeek;

public class Shop {

    private String shopName;
    private Product[] products;

    public Product[] getProducts() {
        return products;
    }

    public String getShopName() {
        return shopName;
    }

    public void printProducts() {
        System.out.println("商店" + shopName + "有下列商品： ");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    // 初始化这个商店的商品
    public void open() {
        this.shopName = "711";
        // 生成一些商品

        this.products = new Product[] { Product.APPLE, Product.MILK, Product.COLA, Product.COFFEE };

    }
}
