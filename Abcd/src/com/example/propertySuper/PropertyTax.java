package com.example.propertySuper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.example.propertytax.AddProperty;
import com.example.propertytax.CalculatePropertyTax;

public class PropertyTax {
	
	AddProperty addProperty = new AddProperty();
	CalculatePropertyTax calculatePropertyTax = new CalculatePropertyTax();
//	List<AddProperty> list = new ArrayList<>();
//	Scanner ip = new Scanner(System.in);
	public void propertyMethod(List<AddProperty> list, Scanner ip)
	{

     while (true) {

         System.out.println("Enter 1-Add Property | 2-Calculate Tax | 3-Exit");
         int n = ip.nextInt();

         switch (n) {

             case 1:
                 addProperty.getProperty(list, ip);
                 System.out.println(list);
                 break;

             case 2:
                 if (list.isEmpty()) {
                     System.out.println("No properties added!");
                     break;
                 }

                 AddProperty last = list.get(list.size() - 1);

                 if (last.getLocatedInCity() == 'Y') {
                     double tax = calculatePropertyTax.inCity(last);
                     System.out.println("PROPERTY TAX = " + tax);
                 } else {
                     double tax = calculatePropertyTax.notInCity(last);
                     System.out.println("PROPERTY TAX = " + tax);
                 }
                 break;

             case 3:
                 System.out.println("Exiting...");
                 return;

             default:
                 System.out.println("Invalid option!");
         }
     }
	
	
	}

}
