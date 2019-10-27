package netcracker;

import netcracker.exceptions.HobbyException;
import netcracker.hobbies.*;

public class App {
    public static void main(String[] args) {
        try {
            Swimming swim = new Swimming("брасс", 6f, (byte) 11, true, -40f);
            swim.tellAboutHobby();
        } catch (HobbyException e) {
            System.out.println(e.getMessage());
        }
    }
}
