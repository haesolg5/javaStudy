package ex05method;

public class QuTemperature {
    public static void main(String[] args){
        double celTem1 = 36.5;
        double fahTem1 = 0;

        double celTem2 = 0;
        double fahTem2 = 72.5;

        fahTem1 = celsiusToFahrenheit(celTem1);

        celTem2 = fahrenheitToCelsius(fahTem2);

        System.out.printf("섭씨 %.2f도는 화씨 %.2f도이다.%n",celTem1,fahTem1);
        System.out.printf("화씨 %.2f도는 섭씨 %.2f도이다.%n",fahTem2,celTem2);
    }
    public static double celsiusToFahrenheit(double c){
        double f = 1.8 * c + 32;    // 섭씨 -> 화씨
        return f;
    }

    public static double fahrenheitToCelsius(double f){
        double c = (f-32)/1.8;      // 화씨 > 섭씨
        return c;
    }
}
