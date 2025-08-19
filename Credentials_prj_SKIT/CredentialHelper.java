import java.util.Random;

public class CredentialHelper {

    public String createEmail(String firstName, String lastName, String department) {
        return firstName.trim().toLowerCase() + "." 
             + lastName.trim().toLowerCase() + "@" 
             + department.toLowerCase() + ".skit.ac.in";
    }

    public String createPassword() {
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String special = "!@#$%^&*()-_";

        String allChars = upper + lower + digits + special;
        Random random = new Random();

        int length = 8 + random.nextInt(5); // 8–12 length
        StringBuilder pass = new StringBuilder();

        pass.append(upper.charAt(random.nextInt(upper.length())));
        pass.append(lower.charAt(random.nextInt(lower.length())));
        pass.append(digits.charAt(random.nextInt(digits.length())));
        pass.append(special.charAt(random.nextInt(special.length())));

        for (int i = 4; i < length; i++) {
            pass.append(allChars.charAt(random.nextInt(allChars.length())));
        }

        return pass.toString();
    }

    public void displayCredentials(Employee emp, String email, String password) {
        System.out.println("\nHi " + emp.getFirstName() + ", here are your login details:");
        System.out.println("-------------------------------------");
        System.out.println("Email ID : " + email);
        System.out.println("Password : " + password);
        System.out.println("-------------------------------------");
    }
}
