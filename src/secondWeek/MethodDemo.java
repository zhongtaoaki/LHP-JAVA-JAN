package secondWeek;

/**
 * Dont Repeat Yourself
 * 当我们要重复一模一样的操作的时候
 * 可以把这个【操作】封装成一段方法
 * 
 * 方法的声明
 * static 返回值数据类型 方法名（参数列表）{
 * 方法体
 * }
 * 
 * 方法的声明：
 * 声明在 类内方法外
 * 方法是不可以独立于类存在
 * 方法内部是不可以嵌套方法的
 * 
 * 返回值：
 * 方法结束产生的结果
 * 基本数据类型 引用数据类型
 * 没有返回值的话写 void
 * 
 * 方法名：
 * 和变量一样，是在其作用域内的唯一标识
 * 遵循小驼峰命名原则（首字母小写，第二个单词开始首字母大写）
 * 
 * 参数列表：
 * 参数的要求
 * 参数的数量
 * 每个参数的数据类型
 * 顺序
 * 声明新的变量，会在方法体内被使用
 * 有多个参数的时候，用逗号隔开
 * 可以没有参数（）
 * 
 * 方法体：
 * 如果返回值不为void
 * 一定要有return语句将返回值返回出去
 * return会立刻结束方法
 * return后的代码会成为unreachable code 永远不会被执行的代码
 * 没有返回值的时候，可以没有return
 * 这时候return代表的含义就是立刻结束这个方法
 * 
 * 
 * 方法的使用
 * 如果有返回值，使用这个返回值（承接）
 * 如果方法有参数，要指定
 * 
 * 在同一个类内，用static修饰的方法，直接使用
 * 
 * 变量： 本地变量（local variable）
 * 作用范围，是在最近的大括号内
 */
public class MethodDemo {
    public static void main(String[] args) {

        // 判断给定数字是不是素数

        int i = 3;
        int j = 4;
        i = add(i, j);
        System.out.println(i);

    }

    static int add(int i, int j) {
        int result = i + j;
        i = i + 1;
        return result;
    }

    static boolean isPrime(int number) {

        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                System.out.println(number + "不是素数");
                System.out.println("因子是：" + i);
                break;
            }
        }
        return isPrime;
    }

}
