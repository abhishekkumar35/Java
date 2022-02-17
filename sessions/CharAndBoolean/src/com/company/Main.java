package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // char and boolean are of 2 bytes(16bit) in java , because it  stores unicode value,
        // boolean has by default true and false value in java;
        char myChr = 'D';
        char $char = '\u0044';  //source unicode table dot com // must be in single quote
        System.out.println($char);

        boolean myTrue = true;
        System.out.println(myTrue);
    }
}
