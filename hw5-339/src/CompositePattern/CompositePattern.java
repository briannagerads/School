package CompositePattern;

public class CompositePattern {
	
	/*
	 * Write a program that demonstrates the advantages of the
	 * Composite design pattern. The program should create a tree of
	 * objects consisting of both composite and leaf nodes (demonstrating
	 * that the composite has correctly implemented a subset of the child
	 * management functions, such as addChild(), getChild(), and
	 * getParent()). Make sure that your tree consists of at least three
	 * levels, e.g. a root node with multiple children, where at least one of
	 * those nodes is a composite node with children. The program should
	 * then call an operation on the root of the tree. All composite objects
	 * should delegate the operation to their children while all leaf nodes
	 * should perform the action. Note: you can optionally have the
	 * composite nodes do something in response to the operation but they
	 * should then delegate the operation to their children.
	 */
	
	
	public static void main(String[] args) {
		String course1 = "Embedded Systems";
		Course ta1 = new TeachingAssistant("Bri", course1);
		Course ta2 = new TeachingAssistant("David", course1);
		Course instructor1 = new Instructor("Jones", course1);
		instructor1.add(ta1);
		instructor1.add(ta2);
		
		String course2 = "Object Oriented Learning";
		Course ta3 = new TeachingAssistant("Miranda", course2);
		Course LeadInstructor = new Instructor("Harrison", course2);
		LeadInstructor.add(ta3);
		LeadInstructor.add(instructor1);
		LeadInstructor.print();
	}
	
}
