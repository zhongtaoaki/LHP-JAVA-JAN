package sixWeek;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * 函数式接口
 * 有且只有一个抽象方法的接口
 */
public class Lambda {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(45);
        list.add(78);
        list.add(12);
        list.add(0);
        list.add(333);

        System.out.println("使用普通for循环");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                System.out.println(list.get(i));
            }
        }

        System.out.println("使用加强for循环（拡張for）");
        for (Integer integer : list) {
            if (integer % 2 == 0) {
                System.out.println(integer);
            }
        }

        System.out.println("----------------");
        System.out.println("使用for each循环");

        // Consumer<? super Integer> action
        // 匿名类
        // Consumer<Integer> variable = new Consumer<Integer>() {
        // @Override
        // public void accept(Integer t) {
        // if (t % 2 == 0) {
        // System.out.println(t);
        // }
        // }
        // };

        // Consumer<Integer> variable = t -> System.out.println(t);

        String message = "偶数是：";
        list.forEach(t -> System.out.println(message + t));

        // lambda表达式 ランムダ式，箭头函数
        list.forEach(t -> {
            if (t % 2 == 0)
                System.out.println(t);
        });

        System.out.println("----------------");
        System.out.println("使用过滤器输出偶数");
        // 过滤器 保留偶数
        list.stream().filter(e -> e % 2 == 0).forEach(t -> System.out.println(t));

        System.out.println("----------------");
        System.out.println("使用sorted排序前");
        list.forEach(e -> System.err.println(e));

        System.out.println("----------------");
        System.out.println("使用sorted排序后");
        list.stream()
                .filter(e -> e % 2 == 0)
                .sorted((o1, o2) -> o1 - o2)
                .forEach(e -> System.out.println(e));
    }
}

// 接口是不可以new的
// 准备一个类，去实装（implement）这个接口
// class ConsumerImpl implements Consumer<Integer>{

// @Override
// public void accept(Integer t) {
// if (t % 2 == 0) {
// System.out.println(t);
// }
// }

// }