package thirdWeek;

/**
 * 类
 * 类的声明
 * 在类外声明，一个类在java里就是一个java文件
 * 修饰符 class 类名{}
 * 类名 遵守大驼峰命名原则（每个单词的首字母开头大写、不使用下划线，可以使用数字但不出现在开头）
 * 
 * 类的大括号里可以写的内容
 * 1.属性(フィールドfield 成员变量)
 * 2.方法
 * 
 * 类的使用
 * 类的使用本质上是使用对象
 * 在方法内使用
 * 使用new生成一个对象
 * 数据类型 变量名 = new 类名（）；
 * 类就是一种数据类型（引用数据类型）
 * 对象名.属性名的方式调用属性
 * 对象名.方法名的方式调用方法
 */
public class Cat {

    // 构造器 就是以类名为方法名的方法
    // 默认无参空构造，生成一个新的没有属性值的对象
    // 无参空构造不需要手动声明，默认有的
    Cat() {
        // this.age = 0;
        System.out.println("生成了一只新的小猫咪");
    }

    // this代指构造器完成返回的对象
    // 当我们手动声明了一个构造器之后，默认的无参空构造会失效，请再手动加一个
    // 在构造器中要调用本类的另一个构造器，使用this（）此处的this代指构造器，且一定要在第一行使用
    Cat(String color, String name, int age) {
        this();
        this.color = color;
        this.name = name;
        this.age = age;
    }

    // 成员变量是有初始值的（默认值，整数型的默认值是0，引用数据类型的初始值是null）
    // 本地变量是没有初始值的，不初始化无法使用
    String color;
    String name;
    int age;
    boolean gender;

    // 静态属性，使用类.属性名的方式去调用，一旦发生修改，会影响该类的所有对象
    //不再是变量，常量
    final static int NUMBEROFLEG = 4;

    // this代指调用该方法的对象
    void bite() {
        System.out.println(this.name + "：正在Miao");
    }

    // 成员方法：不加static的方法叫做成员方法，对象名.方法名的方式去调用的，方法属于对象
    // 静态方法：加了static的方法，类.方法名的方式去调用，如果在本类内，类名可以省略，方法属于类
    static void test() {
        System.out.println(NUMBEROFLEG + "猫咪〇〇了");
    }

    public static void main(String[] args) {

        Cat alice = new Cat();
        alice.color = "blue";
        alice.name = "alice";
        alice.age = 2;

        Cat bob = new Cat();
        bob.color = "white";
        bob.name = "bob";
        bob.age = 4;

        Cat zhangErGou = new Cat("colorful", "zhangErGou", 4);

        System.out.println(alice.color);

        Cat cat4 = new Cat();
        System.out.println(cat4.age);
        System.out.println(cat4.gender);

        alice.bite();
        bob.bite();
        zhangErGou.bite();

        System.out.println(Cat.NUMBEROFLEG);
    }
}

class Dog {

}
