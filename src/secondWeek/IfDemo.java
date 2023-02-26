package secondWeek;

/**
 * 比较运算符
 * < > == != >= <=
 * 
 * 逻辑运算符（布尔值之间的运算）
 * & | ! && ||
 * true & true ---- T
 * true & false --- F
 * false & false -- F
 * 
 * true | true ----T
 * true | false ---T
 * false | false --F
 * 
 * !true ----F
 * !false ---T
 * 
 * 分岐
 */
public class IfDemo {

    public static void main(String[] args) {

        boolean flag = true; // false

        // +-*%
        // += -= *= %= ++ --

        int i = 10;
        int j = 20;

        flag = i > j;

        // int i = 25;
        // 判断i是不是偶数，且i不能被3整除
        int number = 27;

        if (number % 2 == 0 && number % 3 == 0) {
            System.out.println("i 是个偶数，或能被3整除");
        }
        System.out.println("i是个整数");

        String message = "";

        if (number % 2 == 0)
            message = "number是个偶数";
        else
            message = "number是个奇数";

        message = number % 2 == 0 ? "number是个偶数" : "number是个奇数";

        int bigger;
        if (i > j)
            bigger = i;
        else
            bigger = j;

        bigger = i > j ? j : i;

        System.out.println(bigger);


    }
}
