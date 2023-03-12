package fifthWeek;

public class ThrowDemo {
    public static void main(String[] args) {

        try {
            test(1, -1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // 除数不能为负数
    public static void test(int a, int b) throws BusinessException, Exception {

        if (b < 0) {
            System.out.println("除数不能为负数");
            // throw new BusinessException("除数不能为负数");
        } else {
            System.out.println(a / b);
            System.out.println("if结束");
        }
    }

    /**
     * Exception in thread "main" java.lang.ArithmeticException: / by zero
     * at fifthWeek.ThrowDemo.test(ThrowDemo.java:12)
     * at fifthWeek.ThrowDemo.main(ThrowDemo.java:6)
     * 
     * Exception in thread "main" java.lang.ArithmeticException: / by zero
     * at fifthWeek.ThrowDemo.test(ThrowDemo.java:12)
     * at fifthWeek.ThrowDemo.main(ThrowDemo.java:6)
     */
}
