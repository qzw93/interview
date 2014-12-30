package studentinfo;

import java.util.*;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * This class provides a representation of a single-semester session of a
 * specific university course.
 * 
 * @author Administrator
 */
class CourseSession {
	private String department;
	private String number;
	private ArrayList<Student> students = new ArrayList<Student>();
	private Date startDate;

	/**
	 * Constructs a CourseSession starting on a specific date
	 * 
	 * @param startDate
	 *            the date on which the CourseSession begins
	 */
	CourseSession(String department, String number, Date startDate) {
		this.department = department;
		this.number = number;
		this.startDate = startDate;
	}

	String getDepartment() {
		return department;
	}

	String getNumber() {
		return number;
	}

	int getNumberOfStudents() {
		return students.size();
	}

	void enroll(Student student) {
		students.add(student);
		student.addCourse(this);
	}

	Student get(int index) {
		return students.get(index);
	}

	Date setStartDate(Date date) {
		return this.startDate;
	}

	Date getStartDate() {
		return startDate;
	}

	/**
	 * @return Date the last date of the course session
	 */
	Date getEndDate() {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(startDate);
		final int sessionLength = 16;
		final int daysInWeek = 7;
		final int daysFromFridayToMonday = 3;
		int numberOfDays = sessionLength * daysInWeek - daysFromFridayToMonday;
		calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
		return calendar.getTime();
	}
}

