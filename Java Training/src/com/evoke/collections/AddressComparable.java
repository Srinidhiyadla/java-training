package com.evoke.collections;

public class AddressComparable implements Comparable<AddressComparable> {
	int Plotno;;
	String city;
	int Roadno ;
	AddressComparable(int Plotno,String city,int Roadno) {
		this.Plotno=Plotno;
		this.city=city;
		this.Roadno=Roadno;
		
	}
public int compareTo(AddressComparable ac) {
	if(Roadno==ac.Roadno)
		return 0;
	else if(Roadno>ac.Roadno)
		return 1;
	else
		return -1;
}
}
