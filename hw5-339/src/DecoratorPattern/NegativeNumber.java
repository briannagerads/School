package DecoratorPattern;

public class NegativeNumber implements Number {
	
	int num;
	
	public NegativeNumber(int num) {
		this.num = num;
		calculate();
	}
	
	@Override
	public int calculate() {
		if (num > 0) num*=-1;
		System.out.println("Number is now negative: " + num);
		return num;
	}

	@Override
	public int getValue() {
		return num;
	}

}
