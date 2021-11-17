package com.evoke.collections;

import java.util.ArrayList;
import java.util.Collections;


public class TestAddressComparable {

	public static void main(String[] args) {
		ArrayList<AddressComparable> al=new ArrayList<>();
		al.add(new AddressComparable(16,"Hyd",5));
		al.add(new AddressComparable(101,"goa",17));
		al.add(new AddressComparable(24,"peru",34));
		
		
		Collections.sort(al); 
		for(AddressComparable ac:al) {
			System.out.println(ac.Plotno+ " "+ac.city+ " "+ac.Roadno);
		}

	}

}
