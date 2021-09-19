package org.dmitrydunai;

public class Main {
    public static void main(String[] args) {
        MyMap<String, Integer> myMap = new MyMap<>();
        myMap.put("Dmitry", 31);
        myMap.put("Daria", 18);
        myMap.put("Alexandr", 27);
        myMap.put("Sergei", 44);

        System.out.println(myMap.get("Daria"));
        System.out.println(myMap.containsKey("Alexandr"));
        System.out.println(myMap.keySet());
    }
}