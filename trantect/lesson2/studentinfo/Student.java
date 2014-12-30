package studentinfo;

import java.util.*;

class Student {
	private String firstName;
	private String lastName;
	private ArrayList<CourseSession> courseSessions;
	private Department departmentName;
	private Date d1;
	private Date d2;

	Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.courseSessions = new ArrayList<CourseSession>();
	}

	String getName() {
		return this.firstName + " " + this.lastName;
	}

	String getDepartmentName(Department department) {
		return department.getDepartmentName();
	}

	void addCourse(CourseSession course) {
		courseSessions.add(course);
	}

	CourseSession get(int index) {
		return courseSessions.get(index);
	}

	Date getStartDateStu() {
		d1 = this.courseSessions.get(0).getStartDate();
		for (int i = 1; i < courseSessions.size(); i++) {
			d2 = this.courseSessions.get(i).getStartDate();
			if (d1.after(d2)) {
				d1 = d2;
			}
		}
		return d1;
	}

	Date getEndDateStu() {
		d1 = this.courseSessions.get(0).getEndDate();
		for (int i = 1; i < courseSessions.size(); i++) {
			d2 = this.courseSessions.get(i).getEndDate();
			if (d2.after(d1)) {
				d1 = d2;
			}
		}
		return d1;
	}
}

