package DecoratorPattern;

public abstract class NumberDecorator implements Number {
	Number number;
	int num;
	int calc;
	
	public NumberDecorator(int number, int calc) {
		this.num = number;
		this.calc = calc;
	}

	public int calculate() {
		return number.calculate();
	}
}
