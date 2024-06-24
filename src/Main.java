
public class Main {

	public static void main(String[] args) {
		Student student1 = new Student("Parsa","Asadi","40231072") ;
		Student student2 = new Student("Kasra","Rezaei","40231061");
		student1.setGrade(17);
		student2.setGrade(20);
		student1.printStudentInfo();
		student2.printStudentInfo();
		Lab lab1 = new Lab("Mr.Smith","Monday",30);
		lab1.enrollStudent(student1);
		lab1.enrollStudent(student2);
		lab1.printLabInfo();
	}

}
