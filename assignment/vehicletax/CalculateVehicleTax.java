package com.example.assignment.vehicletax;


public class CalculateVehicleTax {
	
	public static double petrol(AddVehicle addVehicle)
	{
		double vehicleTax = (addVehicle.getMaximumVelocityOfVehicle() + addVehicle.getCapacity() + ( 0.1 *addVehicle.getPurchaseCost()));
		return  vehicleTax;
	}
	
	public static double diesel(AddVehicle addVehicle)
	{
		double vehicleTax = (addVehicle.getMaximumVelocityOfVehicle() + addVehicle.getCapacity() + ( 0.11 *addVehicle.getPurchaseCost()));
		return vehicleTax;
	}
	
	public static double lpg(AddVehicle addVehicle)
	{
		double vehicleTax = (addVehicle.getMaximumVelocityOfVehicle() + addVehicle.getCapacity() + ( 0.12 *addVehicle.getPurchaseCost()));
		return vehicleTax;
	}

}
