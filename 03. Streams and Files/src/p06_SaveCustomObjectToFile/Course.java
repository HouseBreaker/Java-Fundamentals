package p06_SaveCustomObjectToFile;

import java.io.Serializable;

public class Course implements Serializable {
	private String course;
	private int students;

	public Course(String course, int students) {
		this.setCourse(course);
		this.setStudents(students);
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getStudents() {
		return students;
	}

	public void setStudents(int students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "{Course: " + this.getCourse() + ", Number of students: " + this.getStudents() + "}";
	}
}
