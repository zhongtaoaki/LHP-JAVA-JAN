package forthWeek;

public class Reference {

    public static void main(String[] args) {

        int[][] a = {{ 1, 1 },{ 1, 1 }};
        int[][] b = {{ 2, 2 },{ 2, 2 }};
        
        for (int i = 0; i < b.length; i++) {
            a[i] = b[i].clone();
        }

        a[0][0] = 3;
        System.out.println("a: {" + a[0][0] + ", " + a[0][1] + ", " + a[1][0] + ", " + a[1][1] + "}");
        System.out.println("b: {" + b[0][0] + ", " + b[0][1] + ", " + b[1][0] + ", " + b[1][1] + "}");

        //期待的结果
        // a: {3,2,2,2}
        // b: {2,2,2,2}
        
        A i = new A(10, "小a");
        A j = new A(10, "小a");
        boolean flag = i.equals(j);

        System.out.println(flag);

    }
}
