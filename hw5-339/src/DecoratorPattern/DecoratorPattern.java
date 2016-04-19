package DecoratorPattern;

public class DecoratorPattern {
	
	
	/*
	 * Write a program that demonstrates the advantages of the Decorator
	 * pattern. Create an object with two operations that produce output
	 * when they are called. Create a decorator for that object that adds
	 * two additional operations that produce output when they are called.
	 * (For simplicity, you should have the operations write to standard
	 * out, e.g. do not try to implement a GUI program that makes use of
	 * decorators graphically.) Instantiate an undecorated object and have
	 * your program call both operations. Then instantiate a decorator, use
	 * it to "decorate" the original object, then call all four operations
	 * provided by the decorator. The output of the original two operations
	 * should be decorated in some way. That is, it should be obvious that
	 * the original output of the undecorated object is being manipulated in
	 * some way by the decorator.
	 */
	
	public static void main(String[] args) {
		Number calcNumber = new Instantiate(4);
		calcNumber = new AdditionDecorator(4, 5);
		calcNumber = new SubtractionDecorator(calcNumber.getValue(), 8);
		calcNumber = new NegativeNumber(calcNumber.getValue());
		calcNumber = new PositiveNumber(calcNumber.getValue());
	}
	
}
