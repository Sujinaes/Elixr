import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> students = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {

                case 1:
                    System.out.print("Enter Name: ");
                    students.add(sc.nextLine());
                    System.out.println("Student Added");
                    break;


                case 2:
                    System.out.println("Students: " + students);
                    break;


                case 3:
                    System.out.print("Enter index to update: ");
                    int updateIndex = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter new name: ");
                    String newName = sc.nextLine();

                    students.set(updateIndex, newName);

                    System.out.println("Student Updated");
                    break;


                case 4:
                    System.out.print("Enter index to delete: ");
                    int deleteIndex = sc.nextInt();

                    students.remove(deleteIndex);

                    System.out.println("Student Deleted");
                    break;


                case 5:
                    System.out.println("Exit");
                    sc.close();
                    return;


                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}