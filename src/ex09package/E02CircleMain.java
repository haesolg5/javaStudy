package ex09package;

// 넓이 계산을 위한 클래스 import
import ex09package.study.area.Circle;

public class E02CircleMain {

	public static void main(String[] args) {
		
		// 앞에서 import 했으므로 클래스명으로 인스턴스 생성
		Circle circle1 = new Circle(6.5);
		System.out.println("반지름이 6.5인 원의 넓이: "+
				circle1.getArea());
		
		// 넓이 계산을 위한 클래스는 패키지의 풀경로롤 인스턴스 생성
		ex09package.study.perimeter.Circle circle2 
				= new ex09package.study.perimeter.Circle(4.5);
		
		System.out.println("반지름이 4.5인 원의 넓이: "+
				circle2.getPerimeter());
	}
	
}
