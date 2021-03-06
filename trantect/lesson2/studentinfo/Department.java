package studentinfo;

import java.util.*;
import java.util.Date;

class Department {
	private String name;
	public ArrayList<CourseSession> courseSessions;
	private Date d1;
	private Date d2;

	Department(String departmentName) {
		this.name = departmentName;
		this.courseSessions = new ArrayList<CourseSession>();
	}

	void add(CourseSession coursesession) {
		this.courseSessions.add(coursesession);
	}

	CourseSession get(int index) {
		return courseSessions.get(index);
	}

	void setDepartmentName(String departmentName) {
		this.name = departmentName;
	}

	String getDepartmentName() {
		return this.name;
	}

	Date getStartDateDep() {
		d1 = courseSessions.get(0).getStartDate();
		for (int i = 1; i < (courseSessions.size()); i++) {
			d2 = this.courseSessions.get(i).getStartDate();
			if (d2.before(d1)) {
				d1 = d2;
			}
		}
		return d1;
	}

	Date getEndDateDep() {
		d1 = this.courseSessions.get(0).getEndDate();
		for (int i = 1; i < (courseSessions.size()); i++) {
			d2 = this.courseSessions.get(i).getEndDate();
			if (d2.after(d1)) {
				d1 = d2;
			}
		}
		return d1;
	}
}

