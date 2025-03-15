/*
  @author eugen
  @project Default (Template) Project
  @class ${NAME}
  @version 1.0.0
  @since 3/15/2025 - 13.23
*/
/**
 * Main class for the BMI calculator application.
 */
public class Main {
    public static void main(String[] args) {
        HumanBmiCalculator humanBmiCalculator = new HumanBmiCalculator(80, 1.52);
        System.out.println(humanBmiCalculator.getCategorizingResult());
    }
}
