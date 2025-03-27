package ex10accessmodifier;
class FruitSeller1{
	/*
	멤버변수에 private 접근지정자를 추가한다. 이렇게 하면 클래스 내부에서만 접근할 수 있고,
	외부에서는 접근은 원천적으로 차단할 수 있다.
	 */
	private int numOfApple;
	private int myMoney;
	private final int APPLE_PRICE;
	
	public FruitSeller1(int money, int appleNum, int price) {
		this.myMoney = money;
		this.numOfApple = appleNum;
		this.APPLE_PRICE = price;
	}
	
	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	
	public void showSaleResult() {
		System.out.println("[판매자]남은사과갯수: "+ numOfApple);
		System.out.println("[판매자]판매수익: "+ myMoney);
	}
}

class FruitBuyer1{
	// 멤버변수 정보은닉
	private int myMoney;
	private int numOfApple;
	
	public FruitBuyer1(int _myMoney, int _numOfApple) {
		this.myMoney = _myMoney;
		this.numOfApple = _numOfApple;
	}
	
	public void buyApple(FruitSeller1 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액: "+ myMoney);
		System.out.println("[구매자]사과갯수: "+ numOfApple);
	}
}

public class E03InformationHiding {
	
	public static void main(String[] args) {
		// 판매자1 : 사과 100개, 단가 1,000원
		FruitSeller1 seller1 = new FruitSeller1(0, 100, 1000);
		
		// 판매자2 : 사과 80개, 단가 500원
		FruitSeller1 seller2 = new FruitSeller1(0, 80, 500);
		
		// 구매자 : 보유금액 10,000원
		FruitBuyer1 buyer = new FruitBuyer1(10000, 0);
		
		System.out.println("구매행위가 일어나기 전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		
		/*
		멤버변수를 private로 선언하면 클래스 외부에서는 접근이 불가능하므로 아래 코드는 에러가
		발생하게 된다. 즉, 멤버변수의 정보은닉을 통해 비정상적인 접근을 차단하고 멤버메서드를
		통해서만 구매가 이루어질 수 있도록 구현해야한다.
		 */
//		seller1.myMoney += 1000;	// 판매자1에게 1000원 지불
//		buyer.myMoney -= 1000;		// 구마재의 금액 차감
//		seller1.numOfApple -= 50;	// 사과 50개 구매
//		buyer.numOfApple += 50;		//구매자의 사과 50개 증가
		// 1000원으로 사과 50개를 구매한 것이 된다.
		
		// 각각의 판매자에게 5000원씩 지불한 후 사과 구매
		buyer.buyApple(seller1, 1000);
		buyer.buyApple(seller2, 1000);
		
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult(); // 5개 판매
		seller2.showSaleResult(); // 10개 판매
		buyer.showBuyResult();	  // 총 15개 구매
	}
}
