package com.example.assignment.propertytax;

import java.util.List;
import java.util.Scanner;

public class CalculatePropertyTax {
	

	
	public double inCity(AddProperty addProperty)
	{
		double propertyTax = (addProperty.getBuildUpArea() * addProperty.ageOfLandInYears * addProperty.baseValueOfLand) + ( 0.5 * addProperty.buildUpArea);
		return  propertyTax;
	}
	
	public double notInCity(AddProperty addProperty)
	{
		double propertyTax = (addProperty.getBuildUpArea() * addProperty.ageOfLandInYears * addProperty.baseValueOfLand);
		return propertyTax;
	}

}
