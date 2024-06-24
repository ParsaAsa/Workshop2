
public class Lab {
	private Student[] students;
	private String teacherName;
	private String dayOfWeek;
	private int maxSize;
	private int currentSize;
	private double avgGrade;
	
	public Lab(String teacherName, String dayOfWeek, int maxSize) {
		this.teacherName = teacherName;
		this.dayOfWeek = dayOfWeek;
		this.maxSize = maxSize;
		students = new Student[maxSize];
	}
	public void setMaxSize(int maxSize) {
		this.maxSize = maxSize;
	}
	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public void setCurrentSize (int currentSize) {
		this.currentSize = currentSize;
	}
	public void setStudents(Student[] students) {
		this.students = students;
	}
	public void setAvgGrade(double average) {
		this.avgGrade = average;
	}
	public double getAvgGrade() {
		return this.avgGrade;
	}
	public int getCurentSize() {
		return this.currentSize;
	}
	public int getMaxSize() {
		return this.maxSize;
	}
	public String getDayOfWeek() {
		return this.dayOfWeek;
	}
	public Student[] getStudents() {
		return this.students;
	}
	public String getTeacherName() {
		return this.teacherName;
	}
	public void calAvg(){
		double gradeSum = 0;
		for (int i = 0; i < this.currentSize; i++)
			gradeSum += this.students[i].getGrade();
		System.out.println("Average grade is: " + (gradeSum/this.currentSize));
	}
	public void enrollStudent(Student student) {
		if (this.currentSize == this.maxSize) {
			System.out.println("You have the maximum number of students");
			return;
		}
		this.students[this.currentSize] = student;
		this.currentSize++;
	}
	public void printLabInfo() {
		System.out.println("Teacher name: " + this.teacherName + 
				"\nDay of week: " + this.dayOfWeek + "\nAverage grade is: " + this.avgGrade);
	}
}
