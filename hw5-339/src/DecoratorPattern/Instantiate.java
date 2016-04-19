package DecoratorPattern;

public class Instantiate implements Number {
	
	int num;
	
	public Instantiate(int i) {
		num = i;
		System.out.println("Instantiated to: " + num);
	}
	
	public Instantiate() {
		num = 0;
		System.out.println("Instantiated to: " + num);
	}

	@Override
	public int calculate() {
		return num;
	}

	@Override
	public int getValue() {
		return num;
	}
	
	
}
