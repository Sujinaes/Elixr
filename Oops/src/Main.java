import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Book book;

        System.out.println("===== Library Management System =====");
        System.out.println("1. Fiction Book");
        System.out.println("2. Science Book");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();
        sc.nextLine(); // Consume newline

        switch (choice) {

            case 1:

                FictionBook fiction = new FictionBook();
                book = fiction;

                System.out.print("Enter Book ID: ");
                fiction.setBookId(sc.nextInt());
                sc.nextLine();

                System.out.print("Enter Book Title: ");
                fiction.setTitle(sc.nextLine());

                System.out.print("Enter Author Name: ");
                fiction.setAuthor(sc.nextLine());

                System.out.print("Enter Genre: ");
                fiction.setGenre(sc.nextLine());

                fiction.displayFictionbook();
                book.issueBook();

                break;

            case 2:

                ScienceBook science = new ScienceBook();
                book = science;

                System.out.print("Enter Book ID: ");
                science.setBookId(sc.nextInt());
                sc.nextLine();

                System.out.print("Enter Book Title: ");
                science.setTitle(sc.nextLine());

                System.out.print("Enter Author Name: ");
                science.setAuthor(sc.nextLine());

                System.out.print("Enter Subject: ");
                science.setSubject(sc.nextLine());

                science.displayScienceBook();
                book.issueBook();

                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}