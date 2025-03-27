package ex05method;

public class QuFindPrimeNumber {

    public static void main(String[] args){
        for(int i = 1; i<=100; i++ ){
            if(isPrimeNumber(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isPrimeNumber(int num){
        boolean isPrime = true;

        if(num == 1){   // 1은 소수가 아니다
            return false;
        }

        for (int i = num-1; i>1; i--){  // num-1 ~ 2까지 나누어본다.
            if (num%i==0){      // 나누어 떨어지면 소수가 아니다
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
}
