package fifthWeek;

import java.util.ArrayList;
import java.util.List;

/**
 * List的特点
 * List是一个接口，不可以直接new
 * List是只能存储同一种数据类型的元素，写在<> 泛型 只能写引用数据类型
 * 数组是不可以添加元素的，数组长度是固定的 arr[0] = "apple"
 * List的长度是可变的
 */
public class ListDemo {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(); // 多态

        list.add("apple");
        list.add("milk");
        list.add("candy");// biscuit
        list.add("cola");
        list.add("coffee");
        list.add(3, "bread");
        list.set(2, "biscuit");

        list.remove("apple");
        list.remove(0);

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("---------------------");

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("---------------------");

        List<Integer> list2 = new ArrayList<>();
        list2.add(20);
        list2.add(0);
        list2.add(89);
        list2.add(2);
        list2.add(8);
        list2.add(10);
        System.out.println(list2);

        list2.sort((e1, e2) -> e1 - e2);
        System.out.println(list2);

    }
}
