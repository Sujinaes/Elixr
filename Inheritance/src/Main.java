import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Developer d = new Developer();

        System.out.println("===== Employee Management System =====");

        System.out.println("Enter Employee_id");
        d.setEmployeeId(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter Employee_Name");
        d.setEmployeeName(sc.nextLine());
        System.out.println("Enter Salary");
        d.setSalary(sc.nextDouble());
        sc.nextLine();

        System.out.println("Enter Programming Language");
        d.setProgramming_language(sc.nextLine());
        System.out.println("Enter Experience");
        d.setExperience(sc.nextInt());
        sc.nextLine();
        System.out.println("===== Developer Details =====");
        d.displayDeveloper();
        sc.close();


    }
}