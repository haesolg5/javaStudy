package ex06array;

public class QuArray1To10 {

	public static void main(String[] args) {
		int[] arr = new int[10];	// 크기가 10인 정수타입의 배열 선언
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i+1;
		}	// 배열을 1,2,3,4 순서대로 채운다.
		
		System.out.println("초기화된 배열 요소");
		for(int i = 0; i<arr.length; i++) {
			System.out.printf("%d ",arr[i]);
		}	// 배열을 출력한다.
		
		System.out.println();
		
		int sum = 0;
		
		for(int i = 0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println("배열전체요소의 합: " + sum);
	}

}
