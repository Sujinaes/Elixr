import java.util.Scanner;

public class Main{
        public static void main(String[] args){
            Student s = new Student();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Name");
            s.setName(sc.nextLine());
            System.out.println("Enter the Roll_no");
            s.setRollNumber(sc.nextInt());
            System.out.println("Enter the Marks");
            s.setMarks(sc.nextInt());
            System.out.println("\n----------Student Details----------");
            s.display();
            if(s.getMarks() >=40 ){
                System.out.println("Result : PASS");
            }
            else{
                System.out.println("Result : FAIL");
            }
            sc.close();






        }
    }

