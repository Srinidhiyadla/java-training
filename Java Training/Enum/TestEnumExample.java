package com.evoke.Enum;

public class TestEnumExample {
static EnumMonth Mnth;
	public TestEnumExample(EnumMonth Mnth)
	{
		this.Mnth = Mnth;
	}
	public void season()
	{
		switch(Mnth)
		{
		case  JANUARY:
			System.out.println("Winter.");
			break;
		case  MAY:
			System.out.println("Summer.");
			break;
		case  AUGUST:
			System.out.println("Rainy.");
			break;
			default:
				System.out.println("Spring.");
		}
	}
	public static void main(String[] args) {
		TestEnumExample firstmonth = new TestEnumExample(Mnth.MAY);
		firstmonth.season();
	}
	}
		

