package netcracker;

import netcracker.hobbies.*;

public class App {
    public static void main(String[] args) {
        Hobby[] masHobby = new Hobby[3];
        masHobby[0] = new Swimming("брасс", 6f, (byte) 11, true, 10f);
        masHobby[1] = new Football(5, 11.5f, 2.33, 'A', (byte) 7, (short) 1000, 20, true, 10);
        masHobby[2] = new Swimming("кроль", 7.5f, (byte) 6, false, 15f);
        for (Hobby object : masHobby) {
            object.tellAboutHobby();
        }
    }
}
