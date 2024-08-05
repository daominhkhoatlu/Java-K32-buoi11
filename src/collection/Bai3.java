package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bai3 {
    public static void main(String[] args) {
        String input = "hom nay troi nang va mai troi mua hom kia som chop";


        Map<String, Integer> maps = new HashMap<>();
        //<"hom',1>
        //<"nay",1>
        //<troi,2>

        String arrText[] = input.split(" ");
        System.out.println(arrText);
        for (String s : arrText) {
            if (maps.containsKey(s)) {
                int count = maps.get(s);
                maps.put(s, count + 1);
            } else {
                maps.put(s, 1);
            }
        }

        List<Student> students = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : maps.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
