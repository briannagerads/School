package DecoratorPattern;

public class PositiveNumber implements Number {

	int num;
	
	public PositiveNumber(int num) {
		this.num = num;
		calculate();
	}

	@Override
	public int calculate() {
		if (num < 0) num*=-1;
		System.out.println("Number is now positive: " + num);
		return num;
	}

	@Override
	public int getValue() {
		return num;
	}

}
