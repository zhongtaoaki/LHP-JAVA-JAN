package forthWeek;

/**
 * 使用System.out.println(）去输出引用数据类型的时候
 * jdk会自动调用这个对象的toString（）
 */
public class Test {

    public static void main(String[] args) {

        Vehicle car = new Vehicle("toyota", 4, 800);
        Vehicle truck = new Vehicle("tesla ", 2, 25000);

        System.out.println(car);
        System.out.println(truck);

        // forthWeek.Vehicle@7344699f
        // forthWeek.Vehicle@7344699f

        Speed plane = new Vehicle();

    }
}
