package com.example.assignment.vehicletax;

import java.util.List;

public class DisplayAllVehicles {
	
	public void display(List<AddVehicle> list)
	{
		System.out.println("VehicleId   VehicleRegistrationNumber   VehicleBrand   MaximumVelocityOfVehicle   Capacity   TypeOfVehicle   VehicleTax");
   	 	list.forEach(x -> System.out.println(x.getVehicleId()+"             "+x.getVehicleRegistrationNumber()+"           "+x.getVehicleBrand()+"        "+x.getMaximumVelocityOfVehicle()+"                    "+x.getCapacity()+"            "+x.getTypeOfVehicle()+"              "+x.getVehicleTax()));
	}

}
