package com.home.demos.PrepInsta_Training;

public class PracticeQuestion1 {

    public static void main(String[] args) {
        int intValue = 23455;
        byte byteValue = 22;
        short shortValue = 82;

        long multipliedValue = (long) (intValue + byteValue + shortValue)*1000;
        System.out.println("multiplied value is: " +multipliedValue);

        short multipliedValue1 = (short) ((intValue + byteValue + shortValue)*1000);
        System.out.println("multipliedValue1 value is: " +multipliedValue1);

        Float floatMaxValue = Float.MAX_VALUE;
        Float floatMinValue = Float.MIN_VALUE;
        System.out.println("floatMaxValue value is: " +floatMaxValue);
        System.out.println("floatMinValue value is: " +floatMinValue);

        Double doubleMaxValue = Double.MAX_VALUE;
        Double doubleMinValue = Double.MIN_VALUE;
        System.out.println("floatMaxValue value is: " + doubleMaxValue);
        System.out.println("floatMinValue value is: " +doubleMinValue);

    }
}
