import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the  Total Number of Subjects: ");
        int totalsubjects = scanner.nextInt();

        double totalmarks = 0;
        for(int i = 1; i <= totalsubjects; i++) {
            while(true) {
                System.out.print("Enter marks of subject (out of 100) " + i + ": ");
                double marks = scanner.nextDouble();
                if(marks >= 0 && marks <= 100) {
                    totalmarks += marks;
                    break;
                } else {
                    System.out.println("Invalid marks . Marks should be between 0-100");
                }
           }
        }
        double averagemarks = totalmarks/totalsubjects ;

        System.out.println("\nResult :-");
        System.out.println("Total Marks: " + totalmarks );
        System.out.printf("Average Percentage: " + "%.2f\n", averagemarks);
        
         if ( averagemarks >= 95) {
            System.out.println("Grade: A+");
            System.out.println("Remark: Excellent performance! Keep it up.");
        } else if ( averagemarks >= 90 && averagemarks < 95) { 
            System.out.println("Grade: A");
            System.out.println("Remark: Very Good! Aim for perfection.");
        } else if ( averagemarks >= 80) {
            System.out.println("Grade: B");
            System.out.println("Remark: Good job! A little more effort will take you further.");
        } else if ( averagemarks >= 70) {
            System.out.println("Grade: C");
            System.out.println("Remark: Fair performance. You can do better!");
        } else if ( averagemarks >= 60) { 
            System.out.println("Grade: D");
            System.out.println("Remark: Need improvement. Stay focused and practice more.");
        } else {
            System.out.println("Grade: F");
            System.out.println("Remark: Don't give up. Work harder and seek help when needed.");
        }
        scanner.close();
    }
}
