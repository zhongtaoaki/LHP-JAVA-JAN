package forthWeek;

/**
 * 代码设计
 * 设计模式 23
 * 单例模式
 */
public class Single {

    private String name;
    private int age;

    private Single(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void work() {
        System.out.println("工作了一天");
    }

    private static Single aki = new Single("aki",20);

    //成员方法
    public static Single getAki(){
        return aki;
    }

}

class Test2 {
    public static void main(String[] args) {

        Single single = Single.getAki();

        for (int i = 0; i < 100; i++) {
            //Single s = new Single("", 25); //不希望这行生效
            single.work();
        }
    }
}
