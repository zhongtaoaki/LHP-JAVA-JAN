package forthWeek;

/*
 * java里的所有类，都继承了同一个父类 Object
 * Root class
 * 接口的使用：
 * 在类里使用 implements【实装】 关键词 加 接口名
 * 实体类去继承接口的时候，必须重写接口里的所有抽象方法
 * 
 * 接口 是一种 规范 仕様書　是暴露给系统外部看的
*/
public class Vehicle extends TransportationTool implements Speed{

    String name;
    int seat;
    int load;
    int speed = 0;

    public Vehicle(int seat, int load) {
        this.seat = seat;
        this.load = load;
    }

    public Vehicle() {
    }

    public Vehicle(String name, int seat, int load) {
        this.name = name;
        this.seat = seat;
        this.load = load;
    }

    void print() {
    }

    @Override
    public String toString() {

        // toyata：座位数是4个，载重是800kg
        return name + "：座位数是" + seat + "个，载重是" + load + "kg";
    }

    @Override
    public void speedUp(int valueOfSpeedUp) {
        speed += valueOfSpeedUp;  
    }

    @Override
    public void speedDown(int valueOfSpeedDown) {
        // speed 50km/h 60km/h -10
        if (valueOfSpeedDown >= speed) {
            speed = 0;
        } else {
            speed -= valueOfSpeedDown;
        }
    }

    @Override
    public void stop() {
        speed = 0;    
    }

}
