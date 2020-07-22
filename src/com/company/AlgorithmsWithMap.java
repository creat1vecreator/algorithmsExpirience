package com.company;

import java.util.HashMap;
import java.util.Map;

public class AlgorithmsWithMap {

    public static Map<String, String> mapBully(Map<String, String> map) {
        String key1 = "a";
        String key2 = "b";

        if (map.containsKey(key1)) {
            map.put(key2, map.get(key1));
            map.put(key1, "");
        }
        return map;
    }

    public static Map<String, String> topping(Map<String, String> map) {
        String key1 = "ice cream1";
        String key2 = "bread";

        if (map.containsKey(key1)) {
            map.put(key1, "cherry");
        }

        map.put(key2, "butter");

        return map;


    }


    public static Map<String, String> mapAB2(Map<String, String> map) {
        String key1 = "a";
        String key2 = "b";

        if (map.containsKey(key1) && map.containsKey(key2) && map.get(key1).equals(map.get(key2))) {
            map.remove(key1);
            map.remove(key2);
        }
        return map;
    }

    public static Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            if (map.containsKey(s)) {
                Integer counter = map.get(s);
                map.put(s, ++counter);
            } else
                map.put(s, 1);

        }
        return map;
    }
}

