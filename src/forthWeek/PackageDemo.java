package forthWeek;

//导包
import test.B;

/**
 * 面向对象的三大特性：封装 继承 多态
 * 
 * 访问修饰符 アクセス修飾子
 * java可以通过访问修饰符来控制访问范围权限
 * private 本类内 
 * （default）不写 本包内 
 * protected 本包内 或 异包子类(但是，必须使用子类的实例)
 * public 无限制
 * 
 * 可以修饰谁？
 * 可以不修饰吗？（一定要修饰，但是可以不写,但请一定要写）
 * 属性（成员变量）
 * 方法（静态方法，成员方法，构造器）
 * 类
 * 接口
 */
public class PackageDemo extends B{
    
    public static void main(String[] args) {

        A a = new A(10, "小a");
        
        a.setAge(20);

        System.out.println(a.getAge());

        PackageDemo b = new PackageDemo();
        b.age = 19;
        b.name = "小b";

    }

}
