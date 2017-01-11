package dao;

import java.util.Map;

public interface StudentDAO {
	
	// READ
	Map<Long, String> getStudents();
	Student getStudentByID(long studentID);
	Student getStudentByName(String studentName);
	
	// CREATE
	int insertStudent(long studentID, String studentName);
	
	// DELETE
	int deleteStudentByID(long studentID);
	
	// UPDATE
	int updateStudent(Student student, long studentID);
}
