/*
  @author eugen
  @project LabWork1
  @class HumanBmiCalculator
  @version 1.0.0
  @since 3/15/2025 - 18.35
*/
/**
 * Class that calculates and categorizes BMI for a human.
 */
class HumanBmiCalculator {
    private double weightInKilograms;
    private double heightInMeters;
    private double bmi;

    /**
     * Constructs a HumanBmi object with the given weight and height.
     *
     * @param weightInKilograms Weight in kilograms
     * @param heightInMeters Height in meters
     */
    public HumanBmiCalculator(double weightInKilograms, double heightInMeters) {
        this.weightInKilograms = weightInKilograms;
        this.heightInMeters = heightInMeters;
        this.bmi = calculateBmi();
    }

    /**
     * Gets the weight.
     *
     * @return Weight in kilograms
     */
    public double getWeightInKilograms() {
        return weightInKilograms;
    }

    /**
     * Sets the weight and recalculates BMI.
     *
     * @param weightInKilograms Weight in kilograms
     */
    public void setWeightInKilograms(double weightInKilograms) {
        this.weightInKilograms = weightInKilograms;
        this.bmi = calculateBmi();
    }

    /**
     * Gets the height.
     *
     * @return Height in meters
     */
    public double getHeightInMeters() {
        return heightInMeters;
    }

    /**
     * Sets the height and recalculates BMI.
     *
     * @param heightInMeters Height in meters
     */
    public void setHeightInMeters(double heightInMeters) {
        this.heightInMeters = heightInMeters;
        this.bmi = calculateBmi();
    }

    /**
     * Gets the BMI value.
     *
     * @return BMI value
     */
    public double getBmi() {
        return bmi;
    }

    /**
     * Calculates the BMI using the formula: weight / (height * height).
     *
     * @return Calculated BMI value
     */
    private double calculateBmi() {
        return weightInKilograms / (heightInMeters * heightInMeters);
    }

    /**
     * Gets the BMI category result.
     *
     * @return String representing the BMI category
     */
    public String getCategorizingResult() {
        if (bmi < 18.5) {
            return "Deficit";
        } else if (bmi < 25) {
            return "Norm";
        } else if (bmi < 30) {
            return "Warning!";
        } else {
            return "Fat";
        }
    }
}
