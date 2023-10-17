package Task;

import java.util.Scanner;

public class StudentGradeCalculator {
	
    private static char gradeCalculation(double averagePercentage) {
    	 
    	if(averagePercentage>=90) {
    		return 'A';
    	}
    	else if(averagePercentage>=80) {
    		return 'B';
    	}
    	else if(averagePercentage>=70) {
    		return 'C';
    	}
    	else if(averagePercentage>=60) {
    		return 'D';
    	}
    	else {
    		return 'F';
    	}
    }
		
		 

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the no. of subjects");
		int n =scn.nextInt();
		
		int totalmarks =0;
		
		for(int i =1;i<=n;i++){
			
		 System.out.print("Enter marks obtained in Subject " + i + " (out of 100): ");
		 int marks = scn.nextInt();
		 
		 if(marks < 0 || marks > 100) {
			 System.out.println("Invalid marks. Marks should be between 0 and 100.");
			 return;
			 
		 }
		 totalmarks+=marks;
		 
	}
		double averagePercentage =(double) totalmarks/n;
		
		char grade = gradeCalculation(averagePercentage);
		
		System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalmarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
		

	}

	

}
