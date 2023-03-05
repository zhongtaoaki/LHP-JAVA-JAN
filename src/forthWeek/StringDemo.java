package forthWeek;

/**
 * String 是一个非常特殊的引用数据类型
 * ta同时具备基本数据类型和引用数据类型的特点
 */
public class StringDemo {
    public static void main(String[] args) {
        
        //判断string的时候，== 是不靠谱，equals
        String s1 = "helloworldhelloworld";
        String s2 = "helloworld";
        s2 += "helloworld";
        
        System.out.println(s1.equals(s2));

    }

}
