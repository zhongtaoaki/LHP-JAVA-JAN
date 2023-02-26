package thirdWeek;

/**
 * 在同一个类内
 * 方法名相同，参数列表不同的多个方法，形成了方法的【重载】overload オーバーロード
 * 
 * 方法签名（signature）= 方法名（参数）
 * 【参数列表不同】的含义：
 * 1.个数不同
 * 2.参数数据类型不同
 * 3.顺序不同
 * 
 */
public class OverLoadDemo {
    public static void main(String[] args) {

        int a = 15;
        int s = square(a);
        System.out.println("正方形的面积是： " + s);

        int x = 5;
        int y = 10;
        System.out.println("长方形的面积是： " + square(x, y));

        System.out.println("斐波那契数列的第" + 40 + "个号位是： " + fibonacci(40));

    }

    /**
     * 准备一个方法，用来计算图形的面积
     * 返回值：int
     * 入参：正方形（1个参数）
     */
    static int square(int a) {
        return a * a;
    }

    static double square(double a) {
        return a * a;
    }

    /**
     * 准备一个方法，用来计算图形的面积
     * 返回值：int
     * 入参：长方形（2个参数）
     */
    static double square(int a, int b) {
        return a * b;
    }

    static double square(double a, int b) {
        return a * b;
    }

    /**
     * 乘方 2的3次方 ， 9的二次方 81
     */
    static int power(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }

    // 平方 二次方
    static int power(int a) {
        return power(a, 2);
    }

    // 斐波那契数列 后面的数字是前两个数字的和 0,1,1,2,3,5,8,13,21,34,55.....
    // 斐波那契数列的第【】个位置是【】？
    static int fibonacci(int number) {
        if (number == 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        } else {
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }
}
