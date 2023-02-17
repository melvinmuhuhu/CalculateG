public class CalculateG {

  public static double multiply(double a, double b) {
    return a * b;
  }

  public static double power(double a) {
    return Math.pow(a, 2);
  }

  public static double sum(double a, double b) {
    return a + b;
  }

  public static void printResult(String message, double result) {
    System.out.println(message + ": " + result);
  }

  public static void main(String[] args) {
    double gravity = -9.81; // Earth's gravity in m/s^2
    double fallingTime = 30;
    double initialVelocity = 0.0;
    double finalVelocity = sum(multiply(gravity, fallingTime), initialVelocity);
    double initialPosition = 0.0;
    double finalPosition = sum(sum(multiply(0.5, multiply(gravity, power(fallingTime))),
                          multiply(initialVelocity, fallingTime)), initialPosition);

    printResult("The object's position after " + fallingTime + " seconds", finalPosition);
    printResult("The object's velocity after " + fallingTime + " seconds", finalVelocity);
  }
}

