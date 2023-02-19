package secondWeek;

/**
 * Dont Repeat Yourself
 * 
 * while(条件){
 * 循环体
 * }
 * 
 * 当符合该条件的时候，大括号里的内容会被反复执行
 * 条件： 循环被结束
 * 迭代器：在while外面声明，在while的循环体要发生改变
 * 
 * do while 和while do在大部分时候循环次数是一样的
 * 但是，当while的条件一开始就不满足的时候，do while至少会执行一次
 */

public class LoopDemo {
    public static void main(String[] args) {

        int[] array = { 11, 25, 678, 2, 0 };

        // 计算一下array这个数组的所有元素的和

        // System.out.println(array);

        int index = 0;

        // while (index < array.length) { // 数组越界异常
        // System.out.println(array[index]);
        // index++;
        // }

        int sum = 0;

        // while (index < array.length) { // 数组越界异常
        //     sum += array[index];
        //     index++;
        // }

        System.out.println(sum);
        System.out.println("循环结束");

        do {
            System.out.println(array[index]);
            index++;
        } while (index < array.length);

        int i = 1;
        // while (i > 10000) {
        //     System.out.println(i++);
        // }

        do {
            System.out.println(i++);
        } while (i > 10000);

    }
}
