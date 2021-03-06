package studentinfo;

import junit.framework.*;
import java.util.*;

public class StudentTest extends TestCase {
	private Student student;
	private Date startDate1, startDate2, endDate;
	private CourseSession course;
	private CourseSessionTest ct;

	public void setUp() {
		student = new Student("qu", "zhiwei");
		ct = new CourseSessionTest();
		startDate1 = ct.createDate(2003, 1, 6);
		startDate2 = ct.createDate(2003, 1, 7);
		endDate = ct.createDate(2003, 4, 26);
	}

	public void testCreate() {
		Student firstStudent = new Student("li", "jun");
		assertEquals("li jun", firstStudent.getName());
		Student secondStudent = new Student("qu", "zhiwei");
		assertEquals("qu zhiwei", secondStudent.getName());
	}

	public void testAddCourseAndDate() {
		CourseSession course = new CourseSession("ENGL", "824", startDate1);
		student.addCourse(course);
		assertEquals(course, student.get(0));

		CourseSession course1 = new CourseSession("IT", "929", startDate2);
		student.addCourse(course1);
		assertEquals(course, student.get(0));
		assertEquals(course1, student.get(1));
		assertEquals(startDate1, student.getStartDateStu());
		assertEquals(endDate, student.getEndDateStu());
	}
}

