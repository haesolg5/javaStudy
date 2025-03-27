package ex05method;

public class QuSimpleOperation {
    public static void main(String[] args){
        int n1 = 100;
        int n2 = 77;

        arithmetic(n1, n2);

    }

    public static void arithmetic(int num1, int num2){
        
        if(num1<0 || num2<0) {      // 두 정수가 0보다 작으면 그냥 반환
            System.out.println("0이상의 정수를 입력하세요");
            return;
        }
        System.out.println("덧셈결과->"+ (num1 + num2));
        System.out.println("뺄셈결과->"+ (num1 - num2));
        System.out.println("곱셈결과->"+ (num1 * num2));
        System.out.println("나눗셈몫->"+ (num1 / num2));
        System.out.println("나눗셈나머지->"+ (num1 % num2));

    }
}

