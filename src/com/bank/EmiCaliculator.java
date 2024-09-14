package com.bank;

public abstract class EmiCaliculator {
	
	public int getEarlyEmi(int p,int t,int r) {
		return p*t*r/100;
	}
	
	public abstract int getRateofIntrest();

}
