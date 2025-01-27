package javacorner;

import java.util.Scanner;

public class StudGradeCalculator {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of subjects: ");
	        int numSubjects = scanner.nextInt();
	        int[] marks = new int[numSubjects];
	        
	        for(int i = 0; i < numSubjects; i++) 
	        {
	            System.out.print("Enter marks for subject(out of 100): ");
	            marks[i] = scanner.nextInt();
	        }
	        
	        int totalMarks = calculateTotalMarks(marks);
	        double avgper = calculateAveragePercentage(totalMarks, numSubjects);
	        char grade = calculateGrade(avgper);
	        displayResults(totalMarks, avgper, grade);
	        scanner.close();
	    }

	    private static int calculateTotalMarks(int[] marks) {
	        int total = 0;
	        for (int mark : marks) 
	        {
	            total += mark;
	        }
	        return total;
	    }
	    
	    private static double calculateAveragePercentage(int totalMarks, int numSubjects) {
	        return (double) totalMarks / numSubjects;
	    }

	    private static char calculateGrade(double avgper) {
	        if (avgper >= 90) 
	        {
	            return 'A';
	        } 
	        else if (avgper >= 80) 
	        {
	            return 'B';
	        } 
	        else if (avgper >= 70) 
	        {
	            return 'C';
	        } 
	        else if (avgper >= 60) 
	        {
	            return 'D';
	        } 
	        else 
	        {
	            return 'F';
	        }
	    }
	    
	    private static void displayResults(int totalMarks, double avgper, char grade) {
	        System.out.println("\nResults:");
	        System.out.println("Total Marks: " + totalMarks);
	        System.out.printf("Average Percentage: %f\n", avgper);
	        System.out.println("Grade: " + grade);

	}

}
