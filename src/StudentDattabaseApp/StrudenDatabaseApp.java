package StudentDattabaseApp;

import java.util.Scanner;

public class StrudenDatabaseApp {

	public static void main(String[] args) {
//		Student stnd1=new Student();
//		stnd1.enroll();
//		stnd1.payTuition();
//		System.out.println(stnd1.showInfo());
		// ask the user how many student need to be enroll 
         System.out.print("Enter the number of students to enroll: ");
         Scanner in =new Scanner(System.in);
         int noOfStudents=in.nextInt();
         Student[] student=new Student[noOfStudents];
      
		// create n number of student 
         for(int i=0;i<noOfStudents;i++) {
        	 student[i]=new Student();
        	 student[i].enroll();
     		student[i].payTuition();
     		System.out.println(student[i].showInfo());
         }
         
	}

}
