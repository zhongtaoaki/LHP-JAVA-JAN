/**
 * 运算符
 * 算术运算符
 * +-* %
 * ArithmeticException 数学异常
 * 
 * 赋值运算符
 * =  += -= *= %=
 * 
 */
public class Token {
    public static void main(String[] args) {
        
        int i = 20;

        //i = i + 3;
        //i += 1;
        //i++; // ++i
        
        i = i++; 

        //System.out.println(i++);
        System.out.println(i);

        //0～15
        int number = 0;
        int group = number % 4; // 0,1,2,3
    }
}
