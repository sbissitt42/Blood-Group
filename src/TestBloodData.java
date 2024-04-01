import java.util.Scanner;

public class TestBloodData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare and initialize two blood data objects
        BloodData userBloodData;
        BloodData defaultBloodData = new BloodData();

        // Prompt the user for type and factor
        System.out.println("Enter blood type: ");
        String bloodType = scanner.nextLine();

        System.out.println("Enter rh factor (+ or -): ");
        String rhFactor = scanner.nextLine();

        // Create a BloodData object with user-provided values
        userBloodData = new BloodData(bloodType, rhFactor);

        // display details of both data objects
        System.out.println("User blood data:");
        displayBloodData(userBloodData);

        System.out.println("\nDefault blood data:");
        displayBloodData(defaultBloodData);

        // Change default BloodData object to user's values
        defaultBloodData.setBloodType(bloodType);
        defaultBloodData.setRhFactor(rhFactor);

        // Display details of default BloodData object after changes
        System.out.println("\nUpdated Default Blood Data:");
        displayBloodData(defaultBloodData);

        scanner.close();
    }
        // nethod to display BloodData object details
    public static void displayBloodData(BloodData bloodData) {
        System.out.println("Blood type: " + bloodData.getBloodType());
        System.out.println("Rh Factor: " + bloodData.getRhFactor());
    }
}
