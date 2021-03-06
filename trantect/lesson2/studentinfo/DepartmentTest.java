package studentinfo;

import junit.framework.*;
import java.util.*;

public class DepartmentTest extends TestCase {
	private Department dept;
	private String tempName;
	private Date startDate1, startDate2, endDate;
	private CourseSessionTest cst;

	public void setUp() {
		tempName = "IT";
		dept = new Department("");
		cst = new CourseSessionTest();
		startDate1 = cst.createDate(2003, 1, 6);
		startDate2 = cst.createDate(2003, 1, 7);
		endDate = cst.createDate(2003, 4, 26);
	}

	public void testCreate() {
		dept.setDepartmentName(tempName);
		assertEquals("IT", dept.getDepartmentName());
	}

	public void testAddAndStartEnd() {
		CourseSession course = new CourseSession("ENGL", "824", startDate1);
		dept.add(course);
		assertEquals(course, dept.get(0));

		CourseSession course1 = new CourseSession("IT", "929", startDate2);
		dept.add(course1);
		assertEquals(course, dept.get(0));
		assertEquals(course1, dept.get(1));
		assertEquals(startDate1, dept.getStartDateDep());
		assertEquals(endDate, dept.getEndDateDep());
	}
}

