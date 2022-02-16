package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        long myValue = 1000l;  // we can use L also // but we dont have to write l, L expicitely as java automatically convert int to long if variable datatype is long.
        long myMinValue = Long.MIN_VALUE; // same can be done for Integer as Integer.MIN.VALUE storing in int variable
        long myMaxValue = Long.MAX_VALUE; // same can be done for Integer as Integer.MAX.VALUE storing in int variable
        System.out.println(myMinValue);
        System.out.println(myMaxValue);
        System.out.println("Busted Min value:"+ (myMinValue-1)); // overflowing
        System.out.println("Busted Max Value:"+ (myMaxValue+1)); // overflowing

        int myNum = 1_254_345_742; // we can format integers to make it more readable
        System.out.println(myNum);

        byte minValueByte = Byte.MIN_VALUE;  // min value of byte
        byte maxValueByte = Byte.MAX_VALUE;  // max value of byte
        System.out.println("byte: "+minValueByte);
        System.out.println("byte: "+maxValueByte);

        short minValueShort = Short.MIN_VALUE;  // min value of short
        short maxValueShort = Short.MAX_VALUE;  // max value of short
        System.out.println("short: "+ minValueShort);
        System.out.println("short: "+ maxValueShort);

        int minValueInteger = Integer.MIN_VALUE;  // min value of Integer
        int maxValueInteger = Integer.MAX_VALUE;  // max value of Integer
        System.out.println("integer: "+ minValueInteger);
        System.out.println("integer: "+ maxValueInteger);


        // Casting
        int myNumber = 758695468;
//        short myLongNumber = myNumber/26; // will throw error, conversion int to byte
      short myLongNumber = (short)(myNumber/26); // casting to short
        System.out.println(myLongNumber);

        // note :

    }
}
