package Task1_id9236;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Long", 27);
        hashMap.put("Duyên", 26);
        hashMap.put("Hoàng", 19);
        hashMap.put("Khánh", 21);
        System.out.println(hashMap);

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(hashMap);
        System.out.println(linkedHashMap.get("Duyên"));
        System.out.println(linkedHashMap);
    }

}
