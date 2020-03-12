package com.achais.advances.datastructures;

import java.util.*;

/**
 * Map
 */
public class MapDemo {
    public static void main(String[] args) {
        Map m1 = new HashMap();
        m1.put("Zara", "8");
        m1.put("Mahnaz", "31");
        m1.put("Ayan", "12");
        m1.put("Daisy", "14");
        System.out.println();
        System.out.println(" Map Elements");
        System.out.print("\t" + m1);

        System.out.println();
        System.out.println(m1.containsValue("8"));
        System.out.println(m1.values());
    }
}
