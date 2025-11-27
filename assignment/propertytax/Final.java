package com.example.assignment.propertytax;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.example.assignment.PropertyTax;
import com.example.assignment.TotalTax;
import com.example.assignment.VehicleTax;
import com.example.assignment.PropertyTax;

public class Final {

	public static void main(String[] args) throws Exception {
		
		
		
		while(true)
		{
			System.out.println("1. PROPERTY TAX");
			System.out.println("2. VEHICLE TAX");
			System.out.println("3. TOTAL");
			System.out.println("4. EXIT");
		}
	
//		List<AddProperty> list = new ArrayList<>();
//		Scanner ip = new Scanner(System.in);
//		PropertyTax propertyTax = new PropertyTax();
//		propertyTax.propertyMethod();
//		System.out.println(list);
		
//		VehicleTax vehicleTax = new VehicleTax();
//		vehicleTax.vehicleMethod();
		
		TotalTax totalTax = new TotalTax();
		totalTax.totalList();

	}

}
