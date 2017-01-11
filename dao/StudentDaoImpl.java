package dao;

import java.util.HashMap;
import java.util.Map;

public class StudentDaoImpl implements StudentDAO{

	Map<Long, String> studentMap = new HashMap<>();
	
	@Override
	public Map<Long, String> getStudents() {
		return studentMap;
	}

	@Override
	public int insertStudent(long studentID, String studentName) {
		System.out.println("Inserted: " + studentID + " " + studentName);
		studentMap.put(studentID, studentName);
		return 0;
		
	}

	@Override
	public int deleteStudentByID(long studentID) {
		studentMap.remove(studentID);
		return 0;
	}

	@Override
	public int updateStudent(Student student, long studentID) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Student getStudentByID(long studentID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudentByName(String studentName) {
		// TODO Auto-generated method stub
		return null;
	}

}
