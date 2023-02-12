/**
 * 变量
 * 变量的声明和使用
 * 变量的声明（新的变量）
 * 
 * 数据类型 变量名 = 变量值 ；
 * 整数数据类型
 * byte 2的8次方 能代表256 【-128 +127】 
 * short 2的16次方  能代表6w多个数字 
 * int 2的32次方 42亿 正负21亿  integer 整数
 * long 2的64次方 
 * char 2的16次方  能代表6w多个字符
 * 
 * 浮点型
 * float 2的16次方 (单精度)
 * double 2的32次方 (双精度) 默认
 * 
 * 布尔值
 * boolean  true false 1 0
 * 
 * 变量名
 * 命名规则
 * 命名规范
 * 驼峰命名原则：当出现多个单词的时候，第二个开始单词的首字母大写 
 * 第一个单词的首字母不许大写
 * 命名请尽量代指含义(可读性)
 * 
 * 运算符 = 
 * 赋值运算符：把=右边的值赋给=左边的变量
 * 右边的值要和左边的变量的数据类型要匹配
 * 不匹配的时候会自动转换，无法自动转换的时候会报错
 * 整数 默认是int
 * 小数 默认是double
 * 
 */
public class Datatype {

    public static void main(String[] args) {

        //把一个数字打印5遍
        //这个数字是14

        byte i ;
        i = 12;
        byte j = 114; //自动转换 from int to byte
        j = 115;
        double d = 1.0f;
        char c = 'A'; // a
        boolean b = true; 

        int number = 35051;
        int age = 10;

        System.out.println(i);  
        System.out.println(j);  

    }

}
