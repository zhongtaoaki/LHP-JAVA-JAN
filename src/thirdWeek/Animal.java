package thirdWeek;

/**
 * super class
 * 超类
 * 
 * 重写
 * 1.有继承关系
 * 2.方法名相同
 * 3.参数列表一致（个数一致，数据类型一致，顺序一致）
 * 4.返回值一致
 * 
 */
public class Animal {

    String color;
    String name;
    int age;
    boolean gender;

    void bite() {
        System.out.println("动物都会叫");
    }

    /*
     * 多态
     * 1. 有继承关系
     * 2. 有方法的重写
     * 3. 父类引用指向子类
     * 编译看左边，执行看右边
     */
    public static void main(String[] args) {
        
        Animal animal1 = new Dog();
        Animal animal2 = new Dog();
        Animal animal3 = new Dog();
        Animal animal4 = new Tiger();
        Animal animal5 = new Tiger();
        Animal animal6 = new Tiger();
    
        Animal[] zoo = {animal1,animal2,animal3,animal4,animal5,animal6};

        for (Animal animal : zoo) {
            animal.bite();
        }
    }
}

/**
 * sub class
 * 子类
 * 子类的对象同时也是父类的对象
 */
class Dog extends Animal {

    byte smell; // 1-100之间的分数

    void watchDoor() {
    }

    @Override
    void bite() {
        System.out.println("汪");
    }
}

class Tiger extends Animal {

    void bite() {
        System.out.println("老虎叫");
    }
}
