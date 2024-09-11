package com.home.demos.PrepInsta_Training;

public class String_datatype {

    public static void main(String[] args) {

        String stringValue = "abcd";
        System.out.println("stringValue: " +stringValue);

        String stringValue1 = "456";
        System.out.println("stringValue1: " +stringValue1);

        String sumOfString  = stringValue + stringValue1;
        System.out.println("sumOfString: " +sumOfString);

        String concatOfString  = stringValue.concat(stringValue1);
        System.out.println("concatOfString: " +concatOfString);

        String reverseConcatOfString  = stringValue1.concat(stringValue);
        System.out.println("reverseConcatOfString: " +reverseConcatOfString);


        String myName = "Hi, My name is Anjali Upadhyay. ";
        String myAge = "My age is 25 years old. ";
        String myPlace = "I live in New Delhi, India.";

        String sumOfIntros  = myName + myAge + myPlace;
        System.out.println("sum of all intros: " +sumOfIntros);


    }
}
