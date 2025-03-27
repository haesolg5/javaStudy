package ex04controlstatement;

public class QuPyramid03 {
    public static void main(String[] args) {
        int x = 0;
        while(x<9) {
            if (x < 5) {
                int y = 8;
                while (y > -1) {
                    if (y > 4) {
                        if (x < (y - 4)) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                        y--;
                    } else {
                        if (x < (4 - y)) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                        y--;
                    }
                }
                System.out.println();
                x++;
            }
        }
    }
}
