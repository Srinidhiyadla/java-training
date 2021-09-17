import java.util.*;
import java.util.Scanner;
public class Counting {
public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int letter=0,space=0,number=0,other=0;
		String str= Sc.nextLine();
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='a'&& str.charAt(i)<='z')
				letter++;
			else if(str.charAt(i)==' ')
				space++;
			else if(str.charAt(i)>='0'&& str.charAt(i)<='9')
				number++;
			else 
			{
				other++;
			}
		}
		System.out.println("letter:" + letter);
		System.out.println("space:" + space);
		System.out.println("numberr:" + number);	
		System.out.println("other:" + other);
	}
}