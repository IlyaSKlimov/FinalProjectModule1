import javax.naming.Name;
import java.util.Scanner;

public class FinalProject {
    public static void main(String[] args) {
        // Основной массив
        String[] NameBook = new String[20];
        int NameCount = 0;

        // Меню
        System.out.println("Menu\n" +
                "1. Add new name\n" +
                "2. Edit name\n" +
                "3. Show all names\n" +
                "4. Delete name\n" +
                "5. Check name\n" +
                "6. Exit");

        Scanner in = new Scanner(System.in);

        // Бесконечный цикл
        while (true) {
            System.out.println("Enter command from menu");
            String command = in.nextLine();

            // Выход
            if (command.equals("6")) {
                System.out.println("Exit");
                System.exit(0);
            }
            // Добавление имени
            else if (command.equals("1")) {
                System.out.println("Enter name:");
                String name = in.nextLine();
                NameBook[NameCount] = name;
                NameCount++;
            }
            // Вывод всех имен
            else if (command.equals("3")) {
                System.out.println("Names in NameBook:");
                for (int i = 0; i < NameCount; i++) {
                    if (NameBook[i] != null) {
                        System.out.println(NameBook[i]);
                    }
                }
            }
            // Редактирование имени
            else if (command.equals("2")) {
                System.out.println("What name do you want to edit?");
                String check = in.nextLine();
                int counter = 0;
                for (String s : NameBook) {
                    if (s != null && s.equals(check)) {
                        System.out.println("Enter new name:");
                        String newname = in.nextLine();
                        NameBook[counter] = newname;
                    }
                    counter++;
                }
            }
            // Удаление имени
            else if (command.equals("4")) {
                for (int i = 0; i < NameCount; i++) {
                    if (NameBook[i] != null) {
                        System.out.println(NameBook[i]);
                    }
                }
                System.out.println("What name do you want to delete?");
                String check = in.nextLine();
                int counter = 0;
                for (String s : NameBook) {
                    if (s != null && s.equals(check)) {
                        NameBook[counter] = null;
                        System.out.println("Name deleted");
                    }
                    counter++;
                }
            }

            // Удаление имени
            else if  (command.equals("5")) {
                System.out.println("What name do you want to check?");
                String check = in.nextLine();
                int counter = 0;
                for (String s : NameBook) {
                    if (s != null && s.equals(check)) {
                        System.out.println("Name is in NameBook");
                    }
                    counter++;
                }
            }
        }
    }
}
