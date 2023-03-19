package sixWeek;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Random;
import java.util.Scanner;

public class ApiDemo {
    public static void main(String[] args) {

        Random random = new Random();
        int i = random.nextInt(5);
        System.out.println(Math.PI);

        System.out.println(Math.max(80, 12));
        System.out.println(Math.ceil(67.1));
        System.out.println(Math.floor(67.1));
        System.out.println(Math.round(67.1));
        System.out.println(Math.pow(2, 10));

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println(now.getDayOfMonth());

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("请输入一个数");
        // int temp = scanner.nextInt();
        // System.out.println("你输入的数字是：" + temp);
        // scanner.close();

        String s = "Hello World";
        s.replace('l', 'L');

        StringBuilder sb = new StringBuilder();
        sb.append("Hello World");
        sb.reverse();
        System.out.println(sb);
        StringBuffer sb2 = new StringBuffer("Hello World");

        String s1 = "";
        String s2 = null;

        System.out.println(s1.length());
        // System.out.println(s2.length());

        Optional<String> optional = Optional.ofNullable(s2); // 提示
        if (optional.isPresent()) {
            System.out.println(optional.get().length());
        }

        optional.ifPresent(o -> System.out.println(o.length()));

        //127 = 127 ，128 ！= 128 flyweight设计模式
        Integer number1 = 128;
        Integer number2 = 128;
        System.out.println(number1 == number2);



    }

}
