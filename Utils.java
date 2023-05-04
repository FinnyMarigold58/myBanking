import java.lang.Math;
import java.util.Scanner;

public class Utils {
  // Create a Scanner object to use for user input
  static Scanner sc = new Scanner(System.in);

  public static void clearScreen() {
    // print escape sequences that will clear the screen (buffer)
    System.out.print("\033[H\033[2J");
    // Force writes out any data in the buffer
    System.out.flush();
  }

  public static double getRandomDoubleNumber(double rangeMin, double rangeMax) {
    // rangeLow is the lowest (minimum) number you would like to get back
    // rangeHigh is the highest (maximum) number you would like to get back
    return (Math.random() * (rangeMax - rangeMin)) + rangeMin;
  }

  public static int getRandomIntegerNumber(int rangeMin, int rangeMax) {
    // rangeLow is the lowest (minimum) number you would like to get back
    // rangeHigh is the highest (maximum) number you would like to get back
    return (int) ((Math.random() * (rangeMax - rangeMin)) + rangeMin);
  }

  public static String getUserInputString() {
    // Use an input Scanner to get data from the user's device
    return sc.nextLine();
  }
}