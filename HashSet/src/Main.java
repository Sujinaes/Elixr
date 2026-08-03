import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        HashSet<String> students = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1.Add");
            System.out.println("2.View");
            System.out.println("3.Delete");
            System.out.println("4.Exit");

            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();


            switch (choice) {

                case 1:
                    System.out.print("Enter name: ");
                    students.add(sc.nextLine());
                    System.out.println("Added");
                    break;


                case 2:
                    System.out.println(students);
                    break;


                case 3:
                    System.out.print("Enter name to delete: ");
                    students.remove(sc.nextLine());
                    System.out.println("Deleted");
                    break;


                case 4:
                    return;


                default:
                    System.out.println("Invalid");
            }
        }
    }
}