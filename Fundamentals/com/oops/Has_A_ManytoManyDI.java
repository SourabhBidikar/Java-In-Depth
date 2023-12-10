package com.oops;

class Course{
	int courseId;
	int cost;
	String CourseName;
	
	public Course(int courseId, int cost, String courseName) {
		super();
		this.courseId = courseId;
		this.cost = cost;
		CourseName = courseName;
	}
	
	
}

class Student22{
	int sid;
	String name;
	Course courses[];
	/**
	 * @param sid
	 * @param name
	 * @param courses
	 */
	public Student22(int sid, String name, Course[] courses) {
		super();
		this.sid = sid;
		this.name = name;
		this.courses = courses;
	}
	
	
	public void disp() {
		System.out.println("Student details");
		System.out.println("sid: "+sid+" name: "+name);
		System.out.println("Course details: ");
		for(Course course:courses) {
			System.out.println("courseId: "+course.courseId+" course name: "+course.CourseName+" cost "+course.cost);
		}
	}
	
}

public class Has_A_ManytoManyDI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Course course1= new Course(1,14000,"Java");
			Course course2= new Course(2,17000,"Web dev");
			Course course3= new Course(3,24000,"Devops");
			
			Course[] courses = new Course[3];
			courses[0]=course1;
			courses[1]=course2;
			courses[2]=course3;
			
			Student22 s1= new Student22(11, "sourabh", courses);
			Student22 s2= new Student22(12, "Sandeep", courses);
			Student22 s3= new Student22(13, "Appu", courses);
			
			s1.disp();
			s2.disp();
			s3.disp();
	}

}
