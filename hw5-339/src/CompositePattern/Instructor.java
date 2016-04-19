package CompositePattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Composite class
 * @author Bri Gerads
 */
public class Instructor implements Course {
	
	private String name;
	private String courseName;
	private String title;
	ArrayList<Course> course = new ArrayList<Course>();
	
	public Instructor(String name, String courseName) {
		this.name = name;
		this.courseName = courseName;
		title = "Instructor";
	}
	
	@Override
	public void add(Course course) {
		this.course.add(course);
	}

	@Override
	public void remove(Course course) {
		course.remove(course);
	}

	@Override
	public Course getChild(int i) {
		return course.get(i);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void print() {
		System.out.println("----------");
		System.out.println("Name = " + getName());
		System.out.println("Course = " + getCourse());
		System.out.println("Title = " + getTitle());
		System.out.println("----------");
		
		Iterator<Course> courseIterator = course.iterator();
		while (courseIterator.hasNext()) {
			Course Course = courseIterator.next();
			Course.print();
		}
	}

	@Override
	public String getCourse() {
		return courseName;
	}

	@Override
	public String getTitle() {
		return title;
	}

}
