package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class phone{

    void phone(){
        String phoneno;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter phone no: ");
        phoneno = scan.next();
        Pattern pattern = Pattern.compile("[6-9][0-9]{9}");
        Matcher match = pattern.matcher(phoneno);
        if (match.matches()){
            System.out.println("Valid number");
        }
        else {
            System.out.println("Not valid number");
        }
    }
}


public class Main {

    public static void main(String[] args) {
	// write your code here
        phone ph = new phone();
        ph.phone();
    }
}
