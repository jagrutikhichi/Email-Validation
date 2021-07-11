package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidateImpl implements EmailId {

	@Override
	public void emailValidate() {
		Scanner sc = new Scanner(System.in);


        System.out.println("Enter your Email id");
        String email = sc.next();

        Pattern pattern = Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()){
            System.out.println("Given email id is valid");
        }else{
            System.out.println("Given email id is not valid");
        }
		
	}

}
