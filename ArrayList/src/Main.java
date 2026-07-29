import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1.Add\n2.View\n3.Update\n4.Delete\n5.Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

                System.out.print("Enter Name: ");
                students.add(sc.nextLine());
                System.out.println("Added");

            } else if (choice == 2) {

                System.out.println(students);

            } else if (choice == 3) {

                System.out.print("Enter index to update: ");
                int index = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter new name: ");
                students.set(index, sc.nextLine());

                System.out.println("Updated");

            } else if (choice == 4) {

                System.out.print("Enter index to delete: ");
                int index = sc.nextInt();

                students.remove(index);
                System.out.println("Deleted");

            } else if (choice == 5) {

                System.out.println("Exit");
                break;

            } else {

                System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}