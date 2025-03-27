package ex09package;

import ex09package.study.buyer.FruitBuyer4;
import ex09package.study.seller.FruitSeller4;

public class E03FruitSalesMain4 {
	
	public static void main(String[] args) {
		/*
		생성자를 사용해서 인스턴스를 생성하면 생성과 동시에 초기화할 수 있으므로 초기화 메서드를
		사용하는 것보다 편리하게 코드를 작성할 수 있다.
		 */
		// 판매자1 : 사과 100개, 단가 1,000원
		FruitSeller4 seller1 = new FruitSeller4(0, 100, 1000);
		
		// 판매자2 : 사과 80개, 단가 500원
		FruitSeller4 seller2 = new FruitSeller4(0, 80, 500);
		
		// 구매자 : 보유금액 10,000원
		FruitBuyer4 buyer = new FruitBuyer4(10000, 0);
		
		System.out.println("구매행위가 일어나기 전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		// 각각의 판매자에게 5000원씩 지불한 후 사과 구매
		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 5000);
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult(); // 5개 판매
		seller2.showSaleResult(); // 10개 판매
		buyer.showBuyResult();	  // 총 15개 구매
	}
}
