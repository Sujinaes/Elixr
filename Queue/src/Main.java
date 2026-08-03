import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1.Add");
            System.out.println("2.View");
            System.out.println("3.Peek");
            System.out.println("4.Remove");
            System.out.println("5.Exit");

            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Name: ");
                    queue.offer(sc.nextLine());
                    System.out.println("Added");
                    break;

                case 2:
                    System.out.println(queue);
                    break;

                case 3:
                    System.out.println("Front: " + queue.peek());
                    break;

                case 4:
                    System.out.println("Removed: " + queue.poll());
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}