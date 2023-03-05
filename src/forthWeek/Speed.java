package forthWeek;

/**
 * 接口 声明和使用
 * 使用interface关键词声明
 * 接口【不是】类，但接口和类都是【引用数据类型】
 * 接口里可以定义抽象方法（没有方法体,没有大括号的方法）
 */
public interface Speed {
    // 不可以写属性
    // 不可以写构造器
    // 只能写 【抽象】方法
    void speedUp(int valueOfSpeedUp);
    
    void speedDown(int valueOfSpeedDown);
}
