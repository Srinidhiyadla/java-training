package com.evoke.oopsConcepts;

public  class EncapsulationExample {

	private int stdId;
	private String StdName;
	private String StdBranch;
	public int getStdId() {
		return stdId;
	}
	public String getStdName() {
   return StdName;
	}
	public String getStdBranch() {
		return StdBranch;
	}
	public void setStdId(int val) {
		stdId = val;
	}
	public void setStdName(String val) {
	
		StdName = val;
	}
	public void setStdBranch(String val) {
		StdBranch = val;
	}
}
