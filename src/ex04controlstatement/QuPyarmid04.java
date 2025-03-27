package ex04controlstatement;

public class QuPyarmid04 {
    public static void main(String[] args) {
        int x = 0; // 행

        while(x<9) {
            if(x<5){    // 1~5행까지는 *의 수가 증가
                int y = 0; // 열
                while(y<=x) { // x가 y이상일때 출력
                    System.out.print("*");
                    y++;
                }
                x++;
                System.out.println();
            }
            else{       // 6~마지막 행은 *의 수가 감소
                int y = 0; // 열
                while((9-y)>x) {
                    System.out.print("*");
                    y++;
                }  // 9-y가 x보다 클때 *출력
                x++;
                System.out.println();
            }
        }
    }
}
