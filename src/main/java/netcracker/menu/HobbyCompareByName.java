package netcracker.menu;

import netcracker.hobbies.Hobby;
import java.util.Comparator;

public class HobbyCompareByName implements Comparator<Hobby> {
    public int compare(Hobby o1, Hobby o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
