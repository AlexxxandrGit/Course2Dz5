package collectionMap;


import java.util.*;

public class Main {


    private static final Map<String, Integer> collMap = new HashMap<>();


    public static void main(String[] args) {
        System.out.println("Домашнее задание 9.2 ");

       test1();
        System.out.println();
       test2();


    }

    private static void test1() {
        addingToCollection("Str1", 0);
        addingToCollection("Str2", 1);
        addingToCollection("Str3", 2);
        addingToCollection("Str4", 4);
        addingToCollection("Str4", 5);

        for (Map.Entry<String, Integer> stringIntegerEntry : collMap.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " : " + stringIntegerEntry.getValue());
        }

    }


    public static void addingToCollection(String s, Integer i) {
        if (collMap.containsKey(s) && collMap.containsValue(i)) {
            throw new RuntimeException(collMap + " такой ключ и значение существуют");
        }
        collMap.put(s, i);

    }


    private static void test2() {
        Map<String, List<Integer>> listMap = new HashMap<>();
        listMap.put("str1", List.of(1, 2, 5));
        listMap.put("str2", List.of(1, 1, 4));
        listMap.put("str3", List.of(1, 20, 50, 11,55,45));
        listMap.put("str4", List.of(12, 0, 0, 11,45,0));
        listMap.put("str7", List.of(5, 20, 5, 11));
        listMap.put("str9", List.of(7, 99, 62, 11,56));

        Map<String, Integer> listMap1 = new HashMap<>();

        for (Map.Entry<String, List<Integer>> stringListEntry : listMap.entrySet()) {
            listMap1.put(stringListEntry.getKey(),sum(stringListEntry.getValue()));

        }

        for (Map.Entry <String, Integer> stringIntegerEntry: listMap1.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " : " + stringIntegerEntry.getValue());
        }

    }

    public static Integer sum(List<Integer> list) {
        Integer sum = 0;
        for (Integer element : list) {
            sum += element;
        }
        return sum;
    }

    }








