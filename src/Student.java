
public class Student {

		private String lastName;
		private String firstName;
		private String id;
		private double grade;
		
		public Student(String fName,String lName,String id) {
			this.lastName = lName;
			this.firstName = fName;
			this.id = id;
			grade = 0;
		}
		public void printStudentInfo() {
			System.out.println(firstName + " " + lastName + " " + 
								"\nID: " + id + "\nGRADE: " + grade);
		}
		public void setGrade(double grade) {
			this.grade = grade;
		}
		public double getGrade() {
			return this.grade;
		}
}
