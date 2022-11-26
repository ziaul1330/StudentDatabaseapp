package StudentDattabaseApp;

import java.util.Scanner;

public class Student {
	private String firstname;
	private String lastname;
	private int gradeyear;
	private String studentId;
	private String cources = "";
	private int tuitionbalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;

	// constructor for name and gradeyear
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first name");
		this.firstname = in.nextLine();

		System.out.println("Enter last name ");
		this.lastname = in.nextLine();
		System.out.print(
				"  1 - firstyear \n  2 - secondyear \n  3 - thirdyear \n  4 - fourthyear \nEnter student class level ");

		this.gradeyear = in.nextInt();
//		in.close();
		setStudentId();

		System.out.println(firstname + " " + lastname + "\nGrade " + gradeyear + "\nID " + studentId);

	}

	// generate strudentid
	private void setStudentId() {
		// gratelevel +id
		id++;
		this.studentId = gradeyear + "" + id;
	}

	// enroll in a course
	public void enroll() {
		do {
			System.out.print("Enter the courses (E to exit) :");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
		
			if (!course.equals("E")) {
				this.cources = this.cources.isEmpty() ? course : this.cources + " \n  " + course;
				this.tuitionbalance = tuitionbalance + costOfCourse;
				
			} else {
				// System.out.println("break:?");
			
				break;
			}
		} while (true);
		// System.out.println("ENROLLED IN "+cources);
		System.out.println("TUITION BALANCE IS  " + tuitionbalance);
		
	}

	// view balance
	public void viewbalnce() {
		System.out.println("your balance is $" + tuitionbalance);
	}

	// pay tuition
	public void payTuition() {
		System.out.print("enter your payment $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionbalance =payment - tuitionbalance  ;
		System.out.print("Thank you for your payment od $" + payment);
		viewbalnce();
//		in.close();
	}

	// show status
	public String showInfo() {
		return "Name:" + firstname + " " + lastname + "\nGrade Level:" + gradeyear + "\nStudent Id:" + studentId
				+ "\nCources Enrolled:\n  " + cources + "\nRemaining Balance:" + tuitionbalance;

	}
	
	
}
