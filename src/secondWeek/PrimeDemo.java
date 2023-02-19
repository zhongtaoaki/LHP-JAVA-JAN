package secondWeek;

public class PrimeDemo {
    public static void main(String[] args) {

        int number = 12313;

        // 判断一下这个数组i 是不是 素数
        // 1,2,3,5,7,11,13,17,19

        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                System.out.println(number + "不是素数");
                System.out.println("因子是：" + i);
                break;
            }
        }

        if (isPrime) {
            System.out.println(number + "是素数");
        }

    }
}
