package com.example.assignment;

import com.example.db.DbQueries;

public class TotalTax {
	
//	PropertyTax propertyTax = new PropertyTax();
//	VehicleTax vehicleTax = new VehicleTax();
	
	
	public void totalList() throws Exception
	{
		int arr1[] = DbQueries.recordCount();
		double arr2[] = DbQueries.taxSum();
		
		
		
		System.out.println("SR.NO.      PARTICULAR        QUANTITY             TAX");
		System.out.println("1           PROPERIES        "+ arr1[0]+"          "+arr2[0]);
		System.out.println("1           PROPERIES        "+ arr1[1]+"          "+arr2[1]);
	}

}
