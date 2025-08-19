import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();

        System.out.println("\nChoose Department:");
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resource");
        System.out.println("4. Legal");
        System.out.print("Enter option (1-4): ");

        int choice = sc.nextInt();
        String department;

        switch (choice) {
            case 1: department = "tech"; break;
            case 2: department = "admin"; break;
            case 3: department = "hr"; break;
            case 4: department = "legal"; break;
            default: 
                System.out.println("Invalid choice! Exiting...");
                sc.close();
                return;
        }

        Employee emp = new Employee(firstName, lastName);
        CredentialHelper helper = new CredentialHelper();

        String email = helper.createEmail(emp.getFirstName(), emp.getLastName(), department);
        String password = helper.createPassword();

        helper.displayCredentials(emp, email, password);

        sc.close();
    }
}
