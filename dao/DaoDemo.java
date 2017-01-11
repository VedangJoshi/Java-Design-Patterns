package dao;

import java.util.Map;

public class DaoDemo {

	public static void main(String[] args) {
		StudentDAO studentDao = new StudentDaoImpl();
		studentDao.insertStudent(123, "John Doe");
		Map<Long, String> students = studentDao.getStudents();
		for (Long s : students.keySet()) {
			System.out.println(students.get(s));
		}
	}
}
