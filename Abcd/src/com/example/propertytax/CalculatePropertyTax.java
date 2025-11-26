package com.example.propertytax;



public class CalculatePropertyTax {
	
	
	
	public double inCity(AddProperty addProperty)
	{
		double propertyTax = (addProperty.baseValueOfLand * addProperty.ageOfLandInYears * addProperty.baseValueOfLand) + ( 0.5 * addProperty.buildUpArea);
		return propertyTax;
	}
	
	public double notInCity(AddProperty addProperty)
	{
		double propertyTax = (addProperty.baseValueOfLand * addProperty.ageOfLandInYears * addProperty.baseValueOfLand);
		return propertyTax;
	}

}
