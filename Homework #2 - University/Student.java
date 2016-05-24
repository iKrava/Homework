package homework.Hillel;

public class Student extends Human {
	private String faculty;
	private string course;
	
	public Student(String firstname, String lastname, int age, String faculty, int course) {
		super(firstname, lastname, age);
		this.faculty = faculty;
		this.course - course;
	}
	
	public String getFaculty() {
		return faculty;
	}

	public String getCourse() {
		return course;
	}

}
	