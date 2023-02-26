package secondWeek;

public class PrimeDemo {
    public static void main(String[] args) {

        //输出1000以内所有的素数
        //有多少个呢？统计一下1000以内素数的个数

        int count = 0;

        for (int i = 1; i <= 1000; i++) {
            if (isPrime(i)) {
                System.out.println(i + "是素数");
                count++;
            }
        }
        System.out.println("1000以内素数的个数是: " + count);
    }

    //用来判断number是否为素数的方法
    static boolean isPrime(int number){

        if (number <1) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
