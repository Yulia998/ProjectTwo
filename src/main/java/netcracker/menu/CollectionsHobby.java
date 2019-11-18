package netcracker.menu;

import netcracker.hobbies.*;
import java.util.*;

public class CollectionsHobby {
    private static long time1;
    private static long time2;

    public static void fillList(Collection<Hobby> list, int size) {
        for (int i = 0; i < size; i++) {
            list.add(new Football("f" + i, i + 1, i + 1));
            list.add(new Swimming("swim" + i, (float) (Math.random() * 20 + 1), (float) (Math.random() * 15)));
        }
    }

    public static void fillMap(HashMap<String, Hobby> map, int size) {
        for (int i = 0; i < size; i++) {
            map.put("elFootbal " + i, new Football("f" + i, i + 1, i + 1));
            map.put("elSwimming " + i, new Swimming("swim" + i, (float) (Math.random() * 20 + 1), (float) (Math.random() * 15)));
        }
    }

    public static void writeList(Collection<Hobby> list) {
        for (Hobby hobby : list) {
            System.out.println(hobby);
        }
        System.out.println();
    }

    public static void writeMap(HashMap<String, Hobby> map) {
        for (HashMap.Entry<String, Hobby> element : map.entrySet()) {
            System.out.println("KEY: " + element.getKey() +
                    " - VALUE: " + element.getValue());
        }
        System.out.println();
    }

    public static long[] timeAdd(Collection[] mas, HashMap<String, Hobby> map) {
        long[] time = new long[mas.length + 1];
        for (int i = 0; i < mas.length; i++) {
            time1 = System.nanoTime();
            fillList(mas[i], 5000);
            time2 = System.nanoTime();
            time[i] = time2 - time1;
        }
        time1 = System.nanoTime();
        fillMap(map, 5000);
        time2 = System.nanoTime();
        time[mas.length] = time2 - time1;
        return time;
    }

    public static long[] timeRemove(Collection[] mas, HashMap<String, Hobby> map) {
        Hobby element = new Football("f4999", 5000, 5000);
        long[] time = new long[mas.length + 1];
        for (int i = 0; i < mas.length; i++) {
            time1 = System.nanoTime();
            mas[i].remove(element);
            time2 = System.nanoTime();
            time[i] = time2 - time1;
        }
        String el = "elFootbal 4999";
        time1 = System.nanoTime();
        map.remove(el);
        time2 = System.nanoTime();
        time[mas.length] = time2 - time1;
        return time;
    }

    public static long[] timeGet(List[] list, Set[] set, HashMap<String, Hobby> map) {
        long[] time = new long[list.length + set.length + 1];
        for (int i = 0; i < list.length; i++) {
            time1 = System.nanoTime();
            list[i].get(250);
            time2 = System.nanoTime();
            time[i] = time2 - time1;
        }
        for (int i = 0; i < set.length; i++) {
            time1 = System.nanoTime();
            getSet(set[i], 250);
            time2 = System.nanoTime();
            time[i + list.length] = time2 - time1;
        }
        time1 = System.nanoTime();
        map.get("elSwimming 250");
        time2 = System.nanoTime();
        time[list.length + set.length] = time2 - time1;
        return time;
    }

    public static Hobby getSet(Set<Hobby> set, int number) {
        Iterator<Hobby> it = set.iterator();
        int i = 0;
        Hobby found = null;
        while (i <= number) {
            found = it.next();
            i++;
        }
        return found;
    }
}
