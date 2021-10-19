package com.evoke.constructors;

public class Overloadingconstructors {
	String language;
	Overloadingconstructors(String lang) {
		this.language = "python";
	}
	public void getname() {
			System.out.println(this.language + " programing language");
		}
		public static void main(String[] args) {
			Overloadingconstructors obj = new Overloadingconstructors("python");	
			obj.getname();
		}

}
