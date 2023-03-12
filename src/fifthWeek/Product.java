package fifthWeek;

/**
 * 枚举类
 * 不能被new，只能使用提前准备的实例的特殊类
 */
public enum Product {

    APPLE("苹果", 150), MILK("牛奶", 159), COLA("可乐", 121), COFFEE("拿铁", 210);

    private String type;
    private double price;

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    Product(String type, double price) {
        this.type = type;
        this.price = price;
    }

    // 常量：不能变的变量, 必须要在初始化的时候赋值
    // public static final Product APPLE = new Product("苹果", 150);
    // public static final Product MILK = new Product("牛奶", 159);
    // public static final Product COLA = new Product("可乐", 121);
    // public static final Product COFFEE = new Product("拿铁", 210);

    @Override
    public String toString() {
        return "Product [type=" + type + ", price=" + price + "]";
    }
}
