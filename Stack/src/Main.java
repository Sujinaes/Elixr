//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1.Push");
            System.out.println("2.View");
            System.out.println("3.Peek");
            System.out.println("4.Pop");
            System.out.println("5.Exit");

            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Value: ");
                    stack.push(sc.nextLine());
                    System.out.println("Added");
                    break;

                case 2:
                    System.out.println(stack);
                    break;

                case 3:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is Empty");
                    } else {
                        System.out.println("Top: " + stack.peek());
                    }
                    break;

                case 4:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is Empty");
                    } else {
                        System.out.println("Removed: " + stack.pop());
                    }
                    break;

                case 5:
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}