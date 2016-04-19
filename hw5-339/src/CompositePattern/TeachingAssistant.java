package CompositePattern;

/**
 * This is a leaf class, so many methods won't apply
 * @author Bri Gerads
 */
public class TeachingAssistant implements Course {
	
	private String name;
	private String courseName;
	private String title;
	
	public TeachingAssistant(String name, String courseName) {
		this.name = name;
		this.courseName = courseName;
		title = "TeachingAssistant";
	}
	
	@Override
	public void add(Course course) {
		//not applicable
	}

	@Override
	public void remove(Course course) {
		//not applicable
	}

	@Override
	public Course getChild(int i) {
		//not applicable
		return null;
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
