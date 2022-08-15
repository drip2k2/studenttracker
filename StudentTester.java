/**
	StudentTester tests class Student and class Address
 	@author Subheg Sidhu 100362765
 	@version Java Version 8
 	Date: May 24, 2022

*/
class StudentTester{
	public static void main(String[] args){
		// test Student constructor
		Student student = new Student("Marry","jones",10000001);
		System.out.println(student); 

		// test Student getName, geyStudentNumber(), getLoginId()
		System.out.println(student.getName());
		System.out.println(student.getStudentNumber());
		System.out.println(student.getLoginId());


		// test Student getInfo()
		System.out.println(student.getInfo());

		// test Student addQuiz and getAverage
		student.addQuiz(6.0);
		student.addQuiz(8.5);
		student.addQuiz(9.8);
		System.out.println(student.getQuizAverage());

		// add your test cases:

		// test Student/Address setAddress and getAddress
		student.setAddress("123", "West St", "Vancouver", "BC", "V1T1T1");
		System.out.println(student.getAddress());

		//test Student setName
		student.setName("John", "Brown");
		System.out.println(student.getName());


	}
}
