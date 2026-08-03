//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1.Add");
            System.out.println("2.View");
            System.out.println("3.Update");
            System.out.println("4.Delete");
            System.out.println("5.Exit");

            System.out.print("Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    students.put(id, name);
                    System.out.println("Added");
                    break;

                case 2:
                    System.out.println(students);
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Name: ");
                    name = sc.nextLine();

                    students.put(id, name);
                    System.out.println("Updated");
                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    id = sc.nextInt();

                    students.remove(id);
                    System.out.println("Deleted");
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}