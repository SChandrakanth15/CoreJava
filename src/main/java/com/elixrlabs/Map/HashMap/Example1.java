package com.elixrlabs.Map.HashMap;

import java.util.HashMap;

public class Example1 {
    public static void main(String[] args) {
        HashMap<String, Integer> empIds = new HashMap<>();
        empIds.put("Chandrakanth", 12345);
        empIds.put("Anas", 12395);
        empIds.put("Aswani", 89345);
        empIds.put("Balaji", 87345);
        empIds.put("Sambit", 18945);
        empIds.put("Shahana", 23345);
        System.out.println(empIds);
        System.out.println(("The Id of "+empIds.get("Anas")));
        System.out.println(empIds.remove("Anas"));
        System.out.println(empIds);
        System.out.println(empIds.containsKey("Chandrakanth"));
        System.out.println(empIds.containsValue(12377));
        System.out.println(empIds.size());
        System.out.println(empIds.entrySet());
    }
}
