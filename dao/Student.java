package dao;

public class Student {
	private long studentID;
	private String name;
	
	public Student(long studentID, String name) {
		this.studentID = studentID;
		this.name = name;
	}

	public long getStudentID() {
		return studentID;
	}

	public void setStudentID(long studentID) {
		this.studentID = studentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return Long.toString(studentID) + " : " + this.name;
	}
}
