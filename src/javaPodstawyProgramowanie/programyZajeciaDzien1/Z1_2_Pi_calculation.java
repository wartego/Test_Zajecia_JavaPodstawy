package javaPodstawyProgramowanie.programyZajeciaDzien1;

import java.util.Scanner;

public class Z1_2_Pi_calculation {
    private static final float PI = 3.14F;

    public static void main(String[] args) {
        float radius = getDiameterFromUser() / 2;
        float circumference = calculateCircumferenceOfACircle(radius);
        float area = calculateAreaOfACircle(radius);

        System.out.println("Circumference of a circle: "+ circumference);
        System.out.println("Area of a circle: " + area);
    }

    private static float getDiameterFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please insert diameter: ");
//        float diameter = input.nextFloat();  to jest rownowazne temu na dole
//        return diameter;
        return input.nextFloat();
    }

    private static float calculateCircumferenceOfACircle(float radius) {
//        return 2 * PI * radius;
        return 2 * (float) Math.PI * radius;
    }
    private static float calculateAreaOfACircle(float radius){
//        return PI * radius * radius;
        return (float)( Math.PI * Math.pow(radius,2)); // rzutowanie na float
    }
}
