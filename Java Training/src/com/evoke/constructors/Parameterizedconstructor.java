package com.evoke.constructors;

public class Parameterizedconstructor {
	String languages;
	Parameterizedconstructor(String lang) {
		languages = lang;
		System.out.println(languages + " programing language");
	}
	public static void main(String[] args) {
		Parameterizedconstructor obj = new Parameterizedconstructor("Java");	
	}

}
