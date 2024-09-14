package com.bank;

import com.bank.axis.AxisBankEmiCaliculator;
import com.bank.hdfc.HdfcEmiCaliculator;
import com.bank.sbi.SbiEmiCaliculator;

public class EmiTest {
	
	public static void main(String[] args) {
		
		

		SbiEmiCaliculator sbiEmi = new SbiEmiCaliculator();
		
		int sbiRateOfInterest = sbiEmi.getRateofIntrest();
		
		int sbiYearlyEmi = sbiEmi.getEarlyEmi(100000, sbiRateOfInterest, 12);
		System.out.println(sbiYearlyEmi);
		
		
		HdfcEmiCaliculator hdfcEmi = new HdfcEmiCaliculator();
		
		int hdfcRateOfInterest = hdfcEmi.getRateofIntrest();
		
		int hdfcYearlyEmi = hdfcEmi.getEarlyEmi(100000, hdfcRateOfInterest, 12);
		System.out.println(hdfcYearlyEmi);
		
		AxisBankEmiCaliculator axisEmi = new AxisBankEmiCaliculator();
		
		int axisRateOfInterest = axisEmi.getRateofIntrest();
		
		int axisYearlyEmi = axisEmi.getEarlyEmi(100000, axisRateOfInterest, 12);
		System.out.println(axisYearlyEmi);
	}

}
