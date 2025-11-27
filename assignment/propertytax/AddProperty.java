package com.example.assignment.propertytax;


import java.util.List;
import java.util.Scanner;

import com.example.db.DbQueries;

public class AddProperty {
	
	public int propertyId;
	public int baseValueOfLand;
	public int buildUpArea;
	public int ageOfLandInYears;
	public String locatedInCity;
	public double tax;
	public String confirmToSave;
	
	
//	List<AddProperty> list = new ArrayList<AddProperty>();
	
	
	
	public int getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}
	public int getBaseValueOfLand() {
		return baseValueOfLand;
	}
	public void setBaseValueOfLand(int baseValueOfLand) {
		this.baseValueOfLand = baseValueOfLand;
	}
	public int getBuildUpArea() {
		return buildUpArea;
	}
	public void setBuildUpArea(int buildUpArea) {
		this.buildUpArea = buildUpArea;
	}
	public int getAgeOfLandInYears() {
		return ageOfLandInYears;
	}
	public void setAgeOfLandInYears(int ageOfLandInYears) {
		this.ageOfLandInYears = ageOfLandInYears;
	}
	public String getLocatedInCity() {
		return locatedInCity;
	}
	public void setLocatedInCity(String locatedInCity) {
		this.locatedInCity = locatedInCity;
	}
	
	
	
	
	
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "AddProperty [propertyId=" + propertyId + ", baseValueOfLand=" + baseValueOfLand + ", buildUpArea="
				+ buildUpArea + ", ageOfLandInYears=" + ageOfLandInYears + ", locatedInCity=" + locatedInCity + ", tax="
				+ tax + "]";
	}
	
	
	public void getProperty(Scanner ip)
	{
		System.out.println("ENTER THE PROPERTY DETAILS");
		
		System.out.println("ENTER Property Id");
		propertyId = ip.nextInt();
		System.out.println("Enter Base Value Of Land ");
		baseValueOfLand = ip.nextInt();
		System.out.println("Enter BuildUp Area");
		buildUpArea = ip.nextInt();
		System.out.println("Enter Age of Land");
		ageOfLandInYears = ip.nextInt();
		ip.nextLine();
		System.out.println("Enter Y if it is situated in city if not enter N ");
		locatedInCity = ip.nextLine();
		System.out.println("Enter Y if you want to save else N ");
		 confirmToSave = ip.nextLine();
		
		 if(confirmToSave.equals("Y"))
		 {
			AddProperty ap = new AddProperty();
			ap.setPropertyId(propertyId);
			ap.setBaseValueOfLand(baseValueOfLand);
			ap.setAgeOfLandInYears(ageOfLandInYears);
			ap.setBuildUpArea(buildUpArea);
			ap.setLocatedInCity(locatedInCity);
			ap.setTax(tax);
				
			System.out.println(ap);
			DbQueries.insertRrecord(ap);
		 }
		
		
//		return list;
	}
	
	
	
	

}
