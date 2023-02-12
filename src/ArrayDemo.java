/**
 * 数组 Array 配列 （引用数据类型）
 * 装数据类型相同，变量个数是多个的情况
 * java里数组的特点：
 * 1.同一个的数组里的所有元素，数据类型相同（基本数据类型和引用数据类型都可以）
 * 2.数组里的元素是有顺序的
 * 3.数组的长度是不可变的
 * 
 * 数组的声明和使用
 * 元素的数据类型[] 变量名 = {元素的值或者变量} ；
 * 
 * 数组的使用
 * 变量名[下标]
 * 下标的范围是 【0， 数组长度 - 1】
 * 
 * 当所使用的下标大于等于数组长度的时候，会发生数组越界异常
 * ArrayIndexOutOfBoundsException
 * 
 */
public class ArrayDemo {
    public static void main(String[] args) {
        
        // 变量 只能装一个值的
        int topScore = 100;
        
        //在座各位5位同学的java测试分数
        int[] array = {90,74,50,61,topScore};
        System.out.println(array[0]); // 打印的是变量的值
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);   
        
        int[] array2 = new int[5];//声明了一个长度为5的空数组
        array2[0] = 91;
        array2[1] = 90;
        
        System.out.println(array.length);

        array[0] = 91;
        
        //打印数组的时候，不能直接打印数组，要去数组的元素


    }
}
