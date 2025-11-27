package com.example.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import com.example.assignment.vehicletax.AddVehicle;
import com.example.assignment.vehicletax.CalculateVehicleTax;
import com.example.assignment.vehicletax.DisplayVehicleProperties;
import com.example.db.DbQueries;

public class VehicleTax {
	
	AddVehicle addVehicle = new AddVehicle();
	CalculateVehicleTax calculatePropertyTax = new CalculateVehicleTax();
	List<AddVehicle> list = new ArrayList<>();
	Scanner ip = new Scanner(System.in);
	
	public VehicleTax()
	{
		list = DbQueries.getVehicleRecord();
//		System.out.println(list);
//		list.forEach(x -> System.out.println(x.getPropertyId()+" "+x.getBaseValueOfLand()+" "+x.getBuildUpArea()+" "+x.getAgeOfLandInYears()+" "+x.getLocatedInCity()+" "+x.getTax()));
	}
	
	
	public void vehicleMethod()
	{

     while (true) {

         System.out.println("Enter 1-Add Vehicle | 2-Calculate Tax | 3-Display All Properties | 4-Back to main menu");
         int n = ip.nextInt();

         switch (n) {

             case 1:
                 addVehicle.getProperty(ip);
                 System.out.println(list);
                 break;

             case 2:
            	 list = DbQueries.getVehicleRecord();
                 System.out.println("VehicleId   VehicleRegistrationNumber   VehicleBrand   MaximumVelocityOfVehicle   Capacity   TypeOfVehicle   VehicleTax");
            	 list.forEach(x -> System.out.println(x.getVehicleId()+"             "+x.getVehicleRegistrationNumber()+"           "+x.getVehicleBrand()+"        "+x.getMaximumVelocityOfVehicle()+"                    "+x.getCapacity()+"            "+x.getTypeOfVehicle()+"              "+x.getVehicleTax()));
            	 System.out.println("Enter propertyId from 1 to "+ list.size());
            	 int id = ip.nextInt();
            	 AddVehicle ap = list.get(id-1);

//                 AddProperty last = list.get(list.size() - 1);

                 if (ap.getTypeOfVehicle().equals("petrol")) {
                     double tax = CalculateVehicleTax.petrol(ap);
                     ap.setVehicleTax(tax);
                     list.set(id-1, ap);
                     DbQueries.updateVehicleRecord(ap, tax);
                     System.out.println("PROPERTY TAX = " + tax);
                 }
                 else if (ap.getTypeOfVehicle().equals("diesel")) {
                     double tax = CalculateVehicleTax.diesel(ap);
                     ap.setVehicleTax(tax);
                     list.set(id-1, ap);
                     DbQueries.updateVehicleRecord(ap, tax);
                     System.out.println("PROPERTY TAX = " + tax);
                 }
                 else {
                     double tax = CalculateVehicleTax.lpg(ap);
                     ap.setVehicleTax(tax);
                     list.set(id-1, ap);
                     DbQueries.updateVehicleRecord(ap,tax);
                     System.out.println("PROPERTY TAX = " + tax);
                 }
                 break;

             case 3:
            	 DisplayVehicleProperties.display(list);
                 break;
                 
             case 4:
            	 return;

             default:
            	 System.out.println("Enter a valid number");
         }
     }
	
	
	}

}
