package javaPodstawyProgramowanie.programyZajeciaDzien1;

import java.util.Scanner;

public class Z4_ProgramBMI {
    private static Scanner input = new Scanner(System.in);
private static final float MIN_BMI_VALUE = 18.5F;
private static final float MAX_BMI_VALUE = 24.9F;

    public static void main(String[] args) {

        float weight = getWeightFromUser();
        int height = getHeightFromUser(); // zmiana cm na m
        float calculateBMI = calculateBMI(weight,height);
        checkCalculateBMI(calculateBMI);

    }
    private static float getWeightFromUser(){

        System.out.print("Please insert your weight in kg: ");
        return input.nextFloat();
    }

    private static int getHeightFromUser(){

        System.out.print("Please insert your height in cm: ");
        return input.nextInt();
    }


    private static float calculateBMI(float weight, int height) {
        float heightInMeter = height / 100F;
        return weight / (float)Math.pow(heightInMeter,2);
    }
    private static void checkCalculateBMI(float bmi){
        if (bmi > MIN_BMI_VALUE && bmi < MAX_BMI_VALUE) {
            System.out.println("BMI is correct: " + bmi);
       } else {
           System.out.println("BMI is not correct: " + bmi);
       }
    }
}