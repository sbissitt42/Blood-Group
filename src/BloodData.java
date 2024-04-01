public class BloodData {
    // Fields for blood type and Rh factor
    private String bloodType;
    private String rhFactor;

    // Default constructor with default values O+
    public BloodData() {
        bloodType = "O";
        rhFactor = "+";
    }

    // Overloaded constructor allowing to set blood type and Rh factor
    public BloodData(String bloodType, String rhFactor) {
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }

    // get blood type
    public String getBloodType() {
        return bloodType;
    }

    // set blood type
    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    // get rh factor
    public String getRhFactor() {
        return rhFactor;
    }

    // set rh factor
    public void setRhFactor(String rhFactor) {
        this.rhFactor = rhFactor;
    }
}
