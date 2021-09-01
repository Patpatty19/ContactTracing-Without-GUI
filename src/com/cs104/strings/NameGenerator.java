package com.cs104.strings;

import java.util.*;

//NOTE: DO NOT EDIT ANYTHING FROM HERE
public class NameGenerator {
	final static String lexicon = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345674890";
	final static java.util.Random rand = new java.util.Random();
	final static Set<String> identifiers = new HashSet<String>();

	public static String randomUserID() {
	    StringBuilder builder = new StringBuilder();
	    while(builder.toString().length() == 0) {
	        int length = rand.nextInt(5)+5;
	        for(int i = 0; i < length; i++) {
	            builder.append(lexicon.charAt(rand.nextInt(lexicon.length())));
	        }
	        if(identifiers.contains(builder.toString())) {
	            builder = new StringBuilder();
	        }
	    }
	    return builder.toString();
	}
}
