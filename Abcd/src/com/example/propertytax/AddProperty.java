package com.example.propertytax;

import java.util.List;
import java.util.Scanner;

public class AddProperty {
	

	public int propertyId;
	public int baseValueOfLand;
	public int buildUpArea;
	public int ageOfLandInYears;
	public char locatedInCity;
	
	
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
	public char getLocatedInCity() {
		return locatedInCity;
	}
	public void setLocatedInCity(char locatedInCity) {
		this.locatedInCity = locatedInCity;
	}
	@Override
	public String toString() {
		return "AddProperty [propertyId=" + propertyId + ", baseValueOfLand=" + baseValueOfLand + ", buildUpArea="
				+ buildUpArea + ", ageOfLandInYears=" + ageOfLandInYears + ", locatedInCity=" + locatedInCity + "]";
	}
	
	
	public void getProperty(List<AddProperty>list, Scanner ip)
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
		locatedInCity = ip.nextLine().charAt(0);
		
		AddProperty ap = new AddProperty();
		ap.setPropertyId(propertyId);
		ap.setBaseValueOfLand(baseValueOfLand);
		ap.setAgeOfLandInYears(ageOfLandInYears);
		ap.setBuildUpArea(buildUpArea);
		ap.setLocatedInCity(locatedInCity);
		
		list.add(ap);
		
//		return list;
	}
	

}
