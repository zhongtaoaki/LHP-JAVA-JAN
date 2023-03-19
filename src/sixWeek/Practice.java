package sixWeek;

import java.util.HashMap;
import java.util.Map;

public class Practice {

    public static void main(String[] args) {

        char[] charArray = { 'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd' };

        Map<Character, Integer> map = new HashMap<>();

        // for (char c : charArray) {
        //     if (map.containsKey(c)) { // 如果map里已经存在key c
        //         // if (map.get(c) != null) { // 如果map里已经存在key c
        //         map.put(c, map.get(c) + 1);
        //     } else {
        //         map.put(c, 0 + 1);
        //     }
        // }

        for (char d : charArray) {
            map.put(d, map.getOrDefault(d, 0) + 1);
        }

        System.out.println(map);
    }

}
