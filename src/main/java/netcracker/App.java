package netcracker;

import netcracker.hobbies.Hobby;

public class App {
    public static void main(String[] args) {
        Hobby hobby1 = new Hobby();
        Hobby hobby2 = new Hobby("reading", 0, 14.5f,
                2.33, 'A', (byte) 10, (short) 1000, 20, false);
        Hobby hobby3 = new Hobby("swimming", 6, (byte) 5, true);
        Hobby[] masHobby = {hobby1, hobby2, hobby3};
        for (Hobby object : masHobby) {
            System.out.println(object);
        }
    }
}
