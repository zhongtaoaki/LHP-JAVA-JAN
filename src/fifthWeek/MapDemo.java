package fifthWeek;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {
    
    public static void main(String[] args) {
        
        Map<String, Integer> map = new HashMap<>();

        //增删改查
        map.put("apple", 2); //增
        map.put("coffee", 1);
        map.put("cola", 5);
        map.put("milk", 1);
        map.put("apple", 5); //改
        
        System.out.println(map); // {apple=2, coffee=1, milk=1, cola=5}
        System.out.println(map.get("apple")); //查

        map.remove("apple"); //删
        System.out.println(map);

        System.out.println("----------------");

        int result = 0;
        for (String key : map.keySet()) {
            result += map.get(key);
        }
        System.out.println(result);

        System.out.println(map.containsKey("apple"));

    }

}
