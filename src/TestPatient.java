import java.util.Scanner;

public class TestPatient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // declare first Patient object with default values
        Patient defaultPatient = new Patient();

        // prompt for values for the second patien
        System.out.println("Enter id number for second patient: ");
        int idNumber = scanner.nextInt();
        System.out.println("Enter age for second patient: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter bloodtype for the second patient: ");
        String bloodType = scanner.nextLine();
        System.out.println("Enter RH factor for the second patient (+ or -): ");
        String rhFactor = scanner.nextLine();

        BloodData bloodData = new BloodData(bloodType, rhFactor);
        Patient userPatient = new Patient(idNumber, age, bloodData);

        // Prompt the user for third patient
        System.out.println("Enter ID number for the third patient: ");
        int idNumberThird = scanner.nextInt();
        System.out.println("Enter age for the third patient: ");
        int ageThird = scanner.nextInt();
        scanner.nextLine(); // consume newline

        Patient defaultBloodPatient = new Patient(idNumberThird, ageThird, new BloodData());

        // Display details of all patient objects
        System.out.println("\nDetails of Default Patient:");
        displayPatient(defaultPatient);
        System.out.println("\nDetails of User's Patient:");
        displayPatient(userPatient);
        System.out.println("\nDetails of Default Blood Patient:");
        displayPatient(defaultBloodPatient);

        scanner.close();
    }

    // Method to display patient object detals
    private static void displayPatient(Patient patient) {
        System.out.println("ID Number: " + patient.getIdNumber());
        System.out.println("Age: " + patient.getAge());
        System.out.println("Blood Type: " + patient.getBloodData().getBloodType());
        System.out.println("RH Factor: " + patient.getBloodData().getRhFactor());
    }
}
