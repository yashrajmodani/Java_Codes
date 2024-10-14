package day5.collections;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DemoMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 100);
        map.put("Two", 200);
        map.put("Three", 300);

        System.out.println(map.get("Two"));

        Set<String> keyset = map.keySet();
        for(String key: keyset){
            System.out.println(key + "->" + map.get(key));
        }

        System.out.println("=================================");
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for(Map.Entry<String, Integer> entry: entries){
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

        System.out.println("=================================");
        map.remove("three");
        keyset = map.keySet();
        for(String key: keyset){
            System.out.println(key + "->" + map.get(key));
        }
    }
}
