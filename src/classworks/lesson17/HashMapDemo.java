package classworks.lesson17;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {

        Map<String, Toy> map = new HashMap<>();

        map.put("Кукла", new Toy("Кукла", 64));
        map.put("Машинка", new Toy("Машинка", 64));
        map.put("Кубик", new Toy("Кубик", 64));

        System.out.println(map);
        System.out.println(map.get("Машинка"));
        enumerateKeys(map);
        enumerateValues(map);

        Set<Map.Entry<String, Toy>> set = map.entrySet();
        for (Map.Entry<String, Toy> entry : set) {
            System.out.println(entry.getValue());
            System.out.println(entry.getValue());
        }
    }

    private static void enumerateValues(Map<String, Toy> map) {
        Collection<Toy> values = map.values();
        values.forEach(System.out::println);
    }

    private static void enumerateKeys(Map<String, Toy> map) {
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key);
            System.out.println(map.get(key));
        }
    }
}
