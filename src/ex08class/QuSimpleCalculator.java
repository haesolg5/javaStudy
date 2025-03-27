package ex08class;

class CalculatorEx {
	int ctrAdd;
	int ctrSub;
	int ctrMul;
	int ctrDiv;
	
	public void init() {
		this.ctrAdd = 0;
		this.ctrSub = 0;
		this.ctrMul = 0;
		this.ctrDiv = 0;
	}
	
	public double add(double n1, double n2) {
		this.ctrAdd++;
		return (n1 + n2);
	}
	public double sub(double n1, double n2) {
		this.ctrSub++;
		return (n1 - n2);
	}
	public double mul(double n1, double n2) {
		this.ctrMul++;
		return (n1 * n2);
	}
	public double div(double n1, double n2) {
		if(n2 != 0) {
			this.ctrDiv++;
			return (n1 / n2);
		}
		return -1;
	}
	
	public void showOpCount() {
		System.out.println("덧셈횟수 : " + ctrAdd);
		System.out.println("뺄셈횟수 : " + ctrSub);
		System.out.println("곱셈횟수 : " + ctrMul);
		System.out.println("나눗셈횟수 : " + ctrDiv);
	}
}

public class QuSimpleCalculator {
	public static void main(String[] args)
	{
		CalculatorEx cal = new CalculatorEx();
		cal.init();
		System.out.println("1 + 2 = " + cal.add(1 , 2));
		System.out.println("10.5 - 5.5 = " + cal.sub(10.5 , 5.5));
		System.out.println("4.0 * 5.0 = " + cal.mul(4.0 , 5.0));
		System.out.println("100 / 25 = " + cal.div(100 , 25));
		System.out.println("10.0 * 3.0 = " + cal.mul(10.0 , 3.0));
		cal.showOpCount();
	}	
}
