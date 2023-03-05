package forthWeek;

/**
 * 1. 不能被实例化的是抽象类 （不对，接口也不能被实例化）
 * 2. 抽象类一定有抽象方法（不对，可以没有抽象方法）
 * 3. 有抽象方法的类一定是抽象类（对的）
 */
public abstract class TransportationTool implements Speed{
    
    public int speed;
    
    public void start (){
        speed = 1;
    } 

    public abstract void stop();

}
