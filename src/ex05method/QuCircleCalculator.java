package ex05method;

public class QuCircleCalculator {

    public static void main(String[] args){
        double r = 5.5;                 // 반지름
        double area = circleArea(r);    // 넓이
        double round = circleRound(r);  // 둘레

        System.out.printf("원의 둘레(%.1f): %.2f%n", r, round);
        System.out.printf("원의 넓이(%.1f): %.3f%n", r, area);
    }

    public static double circleArea(double radius){
        double area = radius*radius*3.14;
        return area;
    }

    public static double circleRound(double radius){
        double round = 2*3.14*radius;
        return round;
    }
}
