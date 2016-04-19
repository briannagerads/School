package DecoratorPattern;

public class AdditionDecorator extends NumberDecorator {
	
	int num;
	int add;
	
	public AdditionDecorator(int num, int calc) {
		super(num, calc);
		this.num = num;
		this.add = calc;
		calculate();
	}
	
	@Override
	public int calculate() {
		int result = num + calc;
		System.out.println(num + " + " + calc + " = " + result);
		return (num = result);
	}

	@Override
	public int getValue() {
		return num;
	}

}
