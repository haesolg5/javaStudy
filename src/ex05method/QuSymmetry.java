package ex05method;

public class QuSymmetry {
    public static void main(String[] args){
        rotationSymmetryFor(); // for문

        System.out.println("\n========\n");

        rotationSymmetryWhile(); // while문
    }

    public static void rotationSymmetryFor(){
        for(int x = 0 ; x < 4 ; x++) {
            for(int y = 0 ; y < 4 ; y++) {
                if((x+y)==3) {
                    System.out.print("1 ");
                }
                else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void rotationSymmetryWhile(){
        int x = 0;
        while (x<4){
            int y = 0;
            while(y<4){
                if((x+y)==3) {
                    System.out.print("1 ");
                }
                else {
                    System.out.print("0 ");
                }
                y++;
            }
            System.out.println();
            x++;
        }
    }
}
