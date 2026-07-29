import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            Shape s;
            System.out.println(" --------- Area of the Shapes---------");
            System.out.println(" 1. Area of a Circle ");
            System.out.println(" 2. Area of the rectangle ");
            int choice = sc.nextInt();
            switch(choice){
                case 1 :
                    s = new Circle();
                    s.Calculate_Area();
                    break;
                case 2 :
                    s= new Rectangle();
                    s.Calculate_Area();
                    break;
                default:
                    System.out.println("Invalid Choice");

            }
            sc.close();


        }

    }
}