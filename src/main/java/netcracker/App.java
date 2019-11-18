package netcracker;

import netcracker.menu.HobbyMenu;

public class App {
    public static void main(String[] args) {
        HobbyMenu menu = new HobbyMenu();
        int input;
        while (true) {
            input = menu.show();
            switch (input) {
                case 1:
                    menu.firstItem();
                    break;
                case 2:
                    menu.secondItem();
                    break;
                case 3:
                    menu.thirdItem();
                    break;
                case 4:
                    menu.forthItem();
                    break;
                case 5:
                    menu.fifthItem();
                    break;
                case 6:
                    menu.sixthItem();
                    break;
                case 7:
                    menu.seventhItem();
            }
        }
    }
}
