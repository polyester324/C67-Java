package Lesson_16.practice.CollectionMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("FirstKey",100);  // ключи всегда уникальные - ключ это то что первое
        map.put("SecondKey", 100);
        /*map.put("SecondKey", 150); // перезапишет */
        System.out.println(map);
        System.out.println(map.get("SecondKey")); // ищется по ключам
        System.out.println(map.containsKey("123"));
        System.out.println(map.containsValue(100));
        // удалить можно по ключу или ключу+значению
        map.remove("FirstKey");
        map.remove("SecondKey", 101); // не удалит, значения не равны
        //map.clear();// удаляет все
        //
        Set<String> res1 = map.keySet();
        Collection<Integer> res2 = new ArrayList<>(map.values());
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(map.size());
        System.out.println(map.replace("SecondKey",100,400));
    }
}
