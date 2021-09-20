import java.util.Scanner;

	public class SecondstoHrs {

		public static void main(java.lang.String[] args) {
			Scanner Sc=new Scanner(System.in);
			System.out.println("enter Seconds:");
			int s=Sc.nextInt();
		int hr= (s/3600);
		int min= (s/60)%60;
		int sec=(s%60);
		
		System.out.println(hr+":"+min+":"+sec);

		}

	}
