package com.example.assignment.propertytax;

import java.util.List;

public class DisplayAllProperties {
	
	public static void display(List<AddProperty> list)
	{
		System.out.println("PropertyId   BaseValueOfLand   BuildUpArea   AgeOfLandInYears   LocatedInCity   Tax");
   	 	list.forEach(x -> System.out.println(x.getPropertyId()+"             "+x.getBaseValueOfLand()+"           "+x.getBuildUpArea()+"        "+x.getAgeOfLandInYears()+"                    "+x.getLocatedInCity()+"            "+x.getTax()));
	}

}
