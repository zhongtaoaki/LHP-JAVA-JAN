package secondWeek;

public class SwitchDemo {
    public static void main(String[] args) {

        int weekday = 1; // 1,2,3,4,5,6,7

        if (weekday == 1) {
            System.out.println("月曜日です。");
        } else if (weekday == 2) {
            System.out.println("火曜日です。");
        } else if (weekday == 3) {
            System.out.println("水曜日です。");
        } else if (weekday == 4) {
            System.out.println("木曜日です。");
        } else if (weekday == 5) {
            System.out.println("金曜日です。");
        } else if (weekday == 6) {
            System.out.println("土曜日です。");
        } else if (weekday == 7) {
            System.out.println("日曜日です。");
        } else {
            System.out.println("请输入1-7之间的数字");
        }

        weekday = 7;

        switch (weekday) { //可以写byte short int char, String, 枚举类型 不可以写float double boolean long
            case 1:
                System.out.println("月曜日です。");
                break;
            case 2:
                System.out.println("火曜日です。");
                break;
            case 3:
                System.out.println("水曜日です。");
                break;
            case 4:
                System.out.println("木曜日です。");
                break;
            case 5:
                System.out.println("金曜日です。");
                break;
            case 6:
                System.out.println("土曜日です。");
                break;
            case 7:
                System.out.println("日曜日です。");
                break;
            default:
                System.out.println("请输入1-7之间的数字");
                break;
        }

        System.out.println("星期判断结束。");

    }
}
