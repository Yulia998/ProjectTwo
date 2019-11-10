package netcracker;

import netcracker.exceptions.HobbyException;
import netcracker.hobbies.*;
import org.apache.log4j.Logger;

public class App {
    final static Logger logger = Logger.getLogger(App.class);

    public static void main(String[] args) {
        try {
            Swimming swim = new Swimming("брасс", 6f, (byte) 11, true, -40f);
            swim.tellAboutHobby();
        } catch (HobbyException e) {
            logger.error(e.getMessage());
        }
    }
}
