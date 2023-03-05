package forthWeek;

public class A {
    private int age;
    private String name;

    public A(int age, String name) {
        this.age = age;
        this.name = name;
    }

    //读取权限
    public int getAge() {
        return age;
    }

    public String getName(){
        return name;
    }

    //写入权限
    public void setAge(int age){
        this.age = age; 
    }

    public void setName(String name){
        this.name = name;
    }

}
