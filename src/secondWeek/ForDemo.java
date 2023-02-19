package secondWeek;

/**
 * break语句的执行会直接【跳出】循环
 * continue语句的执行会直接【跳过】本次循环
 * 
 * for(迭代器的初始化；结束条件；自增){
 * 循环体
 * }
 * 
 * for是一种特殊的while，for each又是一种特殊的for
 * while 》 for 》 for each
 */
public class ForDemo {
    public static void main(String[] args) {

        int[] array = { 11, 25, 678, 2, 0 };

        // int index = 0; // 迭代器的初始化
        // while (index < array.length) { // 循环的结束条件
        // System.out.println(array[index]); // 循环体
        // index++; // 迭代器的迭代
        // }

        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]); // 循环体
        }

        // int sum = 0;
        // System.out.println(sum);

        // for (int i = 0; i < array.length; i++) {
        // sum += array[i];
        // }
        // System.out.println(sum);

        int sum = 0;
        // for (int i : array) { // i代指该array里的元素
        // sum += i;
        // }

        for (int i = 0; i < array.length; i+=2) {
            sum += array[i];
        }

        System.out.println(sum);
    }
}
