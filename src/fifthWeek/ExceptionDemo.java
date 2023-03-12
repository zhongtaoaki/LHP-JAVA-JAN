package fifthWeek;

public class ExceptionDemo {
    public static void main(String[] args) {

        System.out.println("程序开始");

        int[] array = {};

        try {
            int i = 1 / 0;
            System.out.println(array[0]);
            return;
        } catch (ArithmeticException e) { // ArithmeticException is a Exception
            System.out.println(e.getMessage()); // / by zero
        } catch (ArrayIndexOutOfBoundsException e) { // ArithmeticException is a Exception
            System.out.println(e.getMessage()); // / by zero
        } catch(Exception e){
            System.out.println(e.getMessage());
        }

        // System.out.println(1/0);

        System.out.println("程序结束");

        /*
         * 程序开始
         * / by zero
         * 程序结束
         */

    }
}
