import java.util.*;

public class grade {
    public static void main(String[] args) {

        int totalSubjects = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Total Number of Subjects: ");
        do {
            try {
                totalSubjects = s.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.print("Invalid Input ! \nEnter Number of Subjects: ");
                s.nextLine();
            }
        }while(true);

        int totalSum = 0;
        int m = 0;
        for (int i = 0; i < totalSubjects; i++) {
            System.out.print("Marks in Subject" + (i + 1) + " : ");
            while (true) {
                try {
                    m = s.nextInt();
                    if (m < 0 || m > 100) {
                        System.out.print("Invalid marks! \nMarks in Subject" + (i + 1) + " (0-100): ");
                        continue;
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.print("Invalid Input ! \nMarks in Subject" + (i + 1) + " : ");
                    s.nextLine();
                }
            }
            totalSum += m;
        }
        System.out.println("\n-------------------------\n");
        int percent = totalSum / totalSubjects;

        if (percent > 90) {
            System.out.println("Total Marks: " + totalSum);
            System.out.println("Percentage: " + percent + "%");
            System.out.println("Grade: A+ !!");
            System.out.println("\n-------------------------\n");
        } else if (percent > 80) {
            System.out.println("Total Marks: " + totalSum);
            System.out.println("Percentage: " + percent + "%");
            System.out.println("Grade: A !!");
            System.out.println("\n-------------------------\n");
        } else if (percent > 70) {
            System.out.println("Total Marks: " + totalSum);
            System.out.println("Percentage: " + percent + "%");
            System.out.println("Grade: B !!");
            System.out.println("\n-------------------------\n");
        } else if (percent > 60) {
            System.out.println("Total Marks: " + totalSum);
            System.out.println("Percentage: " + percent + "%");
            System.out.println("Grade: C !!");
            System.out.println("\n-------------------------\n");
        } else if (percent > 50) {
            System.out.println("Total Marks: " + totalSum);
            System.out.println("Percentage: " + percent + "%");
            System.out.println("Grade: D !!");
            System.out.println("\n-------------------------\n");
        } else if (percent > 40) {
            System.out.println("Total Marks: " + totalSum);
            System.out.println("Percentage: " + percent + "%");
            System.out.println("Grade: E !!");
            System.out.println("\n-------------------------\n");
        } else {
            System.out.println("Total Marks: " + totalSum);
            System.out.println("Percentage: " + percent + "%");
            System.out.println("Fail !!");
            System.out.println("\n-------------------------\n");
        }
        s.close();
    }
}
