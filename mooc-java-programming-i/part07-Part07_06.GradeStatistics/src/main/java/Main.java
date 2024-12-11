import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> points = new ArrayList<>();

        System.out.println("Enter point totals, -1 stops:");

        // Input points
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            if (input >= 0 && input <= 100) {
                points.add(input);
            }
        }

        // Calculate averages
        double averageAll = calculateAverage(points);
        double averagePassing = calculatePassingAverage(points);

        // Calculate pass percentage
        double passPercentage = calculatePassPercentage(points);

        // Print statistics
        System.out.println("Point average (all): " + averageAll);
        if (averagePassing == -1) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + averagePassing);
        }
        System.out.println("Pass percentage: " + passPercentage);

        // Print grade distribution
        printGradeDistribution(points);
    }

    // Method to calculate the average of all points
    public static double calculateAverage(ArrayList<Integer> points) {
        int sum = 0;
        for (int point : points) {
            sum += point;
        }
        return 1.0 * sum / points.size();
    }

    // Method to calculate the average of passing grades
    public static double calculatePassingAverage(ArrayList<Integer> points) {
        int sum = 0;
        int count = 0;
        for (int point : points) {
            if (point >= 50) {
                sum += point;
                count++;
            }
        }
        return count > 0 ? 1.0 * sum / count : -1;
    }

    // Method to calculate pass percentage
    public static double calculatePassPercentage(ArrayList<Integer> points) {
        int passingCount = 0;
        for (int point : points) {
            if (point >= 50) {
                passingCount++;
            }
        }
        return 100.0 * passingCount / points.size();
    }

    // Method to print grade distribution
    public static void printGradeDistribution(ArrayList<Integer> points) {
        int[] grades = new int[6]; // 0: failed, 1-5: grades

        for (int point : points) {
            if (point < 50) {
                grades[0]++;
            } else if (point < 60) {
                grades[1]++;
            } else if (point < 70) {
                grades[2]++;
            } else if (point < 80) {
                grades[3]++;
            } else if (point < 90) {
                grades[4]++;
            } else {
                grades[5]++;
            }
        }

        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < grades[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
