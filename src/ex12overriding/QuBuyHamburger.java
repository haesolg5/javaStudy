package ex12overriding;

class Burger {
	private String burgerName;
	private int price;
	private String patty;
	private String source;
	private String vegit;
	
	public Burger(String burgerName, int price, String patty, String source, String vegit) {
		this.burgerName = burgerName;
		this.price = price;
		this.patty = patty;
		this.source = source;
		this.vegit = vegit;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void addPrice(int p) {
		this.price += p;
	}
	
	public void subPrice(int p) {
		this.price -= p;
	}
	
	public void showBurgerInfo() {
		System.out.println(burgerName);
		System.out.println("가격: " + price);
		System.out.printf("식재료: %s, %s, %s\n", patty, source, vegit);
	}
}

class HamburgerPrice {
	Burger burger;
	final int COKE = 1000;
	final int POTATO = 1500;
	
	public HamburgerPrice(Burger burger) {
		this.burger = burger;
	}
	
	public void calPrice(boolean coke, boolean potato) {
		if(coke) {
			burger.addPrice(COKE);
		}
		
		if(potato) {
			burger.addPrice(POTATO);
		}		
	}
	
	public void showPrice() {
		burger.showBurgerInfo();
		System.out.println("결제금액: " + burger.getPrice());
		System.out.println("================================");
	}
}

class SetPrice extends HamburgerPrice {
	public SetPrice(Burger burger) {
		super(burger);
	}
	
	@Override
	public void calPrice(boolean coke, boolean potato) {
		super.calPrice(coke, potato);
		burger.subPrice(500);
	}
	
	@Override
	public void showPrice() {
		burger.showBurgerInfo();
		System.out.println("세트결제금액: " + burger.getPrice());
		System.out.println("================================");
	}
	
}
public class QuBuyHamburger {
public static void main(String[] args) {
		
		//치즈버거 객체 생성
		Burger burger1 = new Burger("치즈버거", 2000, "쇠고기패티", "케챱", "피클");
		//치킨버거 객체 생성
		Burger burger2 = new Burger("치킨버거", 3000, "닭고기패티", "마요네즈", "양상치");
		
		//치즈버거를 기본가격으로 구매
		HamburgerPrice price1 = new HamburgerPrice(burger1);
		price1.calPrice(true, true);
		price1.showPrice();	// 4500원	
		
		//치킨버거를 세트가격으로 구매
		HamburgerPrice price2 = new SetPrice(burger2); 
		price2.calPrice(true, true);
		price2.showPrice();	// 5000원
	}

}
