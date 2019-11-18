package netcracker.menu;

import netcracker.hobbies.Hobby;
import java.util.*;

public class HobbyMenu {
    private List<Hobby> arrayList;
    private List<Hobby> linkedList;
    private Set<Hobby> hashSet;
    private Set<Hobby> treeSet;
    private HashMap<String, Hobby> hashMap;

    public int show() {
        System.out.println("Выберите один из пунктов меню:\n" +
                "  1 - создание и вывод ArrayList\n" +
                "  2 - создание и вывод LinkedList\n" +
                "  3 - создание и вывод HashSet\n" +
                "  4 - создание и вывод TreeSet\n" +
                "  5 - создание и вывод HashMap\n" +
                "  6 - просмотр статистики\n" +
                "  7 - выход");
        System.out.print(">>>> ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public void firstItem() {
        System.out.println("\n    ArrayList:");
        arrayList = new ArrayList<>();
        CollectionsHobby.fillList(arrayList, 5);
        CollectionsHobby.writeList(arrayList);
    }

    public void secondItem() {
        System.out.println("\n    LinkedList:");
        linkedList = new LinkedList<>();
        CollectionsHobby.fillList(linkedList, 5);
        CollectionsHobby.writeList(linkedList);
    }

    public void thirdItem() {
        System.out.println("\n    HashSet:");
        hashSet = new HashSet<>();
        CollectionsHobby.fillList(hashSet, 5);
        CollectionsHobby.writeList(hashSet);
    }

    public void forthItem() {
        System.out.println("\n    TreeSet:");
        treeSet = new TreeSet<>(new HobbyCompareByName());
        CollectionsHobby.fillList(treeSet, 5);
        CollectionsHobby.writeList(treeSet);
    }

    public void fifthItem() {
        System.out.println("\n    HashMap:");
        hashMap = new HashMap<>();
        CollectionsHobby.fillMap(hashMap, 5);
        CollectionsHobby.writeMap(hashMap);
    }

    public void sixthItem() {
        arrayList = new ArrayList<>();
        linkedList = new LinkedList<>();
        hashSet = new HashSet<>();
        treeSet = new TreeSet<>(new HobbyCompareByName());
        Collection[] mas = {arrayList, linkedList, hashSet, treeSet};
        hashMap = new HashMap<>();
        long[][] time = new long[3][5];
        time[0] = CollectionsHobby.timeAdd(mas, hashMap);
        time[1] = CollectionsHobby.timeRemove(mas, hashMap);
        List[] masList = {arrayList, linkedList};
        Set[] masSet = {hashSet, treeSet};
        time[2] = CollectionsHobby.timeGet(masList, masSet, hashMap);
        String[] headersTop = {"", "Add", "Remove", "Get"};
        String[] headersLeft = {"ArrayList", "LinkedList", "HashSet", "TreeSet", "HashMap"};
        for (int i = 0; i < 4; i++) {
            System.out.printf("%16s", headersTop[i]);
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.printf("%16s", headersLeft[i]);
            for (int j = 0; j < 3; j++) {
                System.out.printf("%16s", time[j][i]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public void seventhItem() {
        System.exit(0);
    }
}
