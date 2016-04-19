package CompositePattern;

/**
 * Component class.
 * @author Bri Gerads
 */
public interface Course {
	
	public void add(Course course);
	public void remove(Course course);
	public Course getChild(int i);
	public String getName();
	public void print();
	public String getCourse();
	public String getTitle();
}
