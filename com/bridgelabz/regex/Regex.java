package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	static Pattern pattern = Pattern.compile("^[A-Z a-z]{3,}$");

    public static void main(String[] args) {
        
        Matcher matcher = pattern.matcher("Ravi");
        if(matcher.matches())
            System.out.println(true);
        else
            System.out.println(false);
    }

}
