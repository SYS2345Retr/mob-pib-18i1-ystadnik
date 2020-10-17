import java.util.Scanner;

enum TableStatus {FREE, RESERVED}

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rest rest = new Rest();
        System.out.println("Welcome to " + rest.getName() + '\n');

        int pointMenu;
        do {
            System.out.println("1: Looking restoraunt menu");
            System.out.println("2: Make a reservation table");
            System.out.println("3: Looking the map tables");
            System.out.println("4: Exit");
            pointMenu = sc.nextInt();
            switch (pointMenu) {
                case 1:
                    for (Food food : rest.getMenu()) {
                        System.out.println(food);
                    }
                case 2:
                case 3:

            }

        } while (pointMenu != 4);


    }
}

