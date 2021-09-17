import java.util.*;

public class StringConversion {

	public static void main(String args[]){
	String input = "mY nAmE iS srIniDhI";
	String firstLetterofsentence= input.substring(0,1);
	String remainingLetterofsentence= str.substring(1,input.length());
	firstLetterofsentence = firstLetterofsentence.toUpperCase();
	input = firstLetterofsentence + remainingLetterofsentence;
	System.out.println("input:"+input);
	}

}
