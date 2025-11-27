package com.example.assignment.vehicletax;

import java.util.Scanner;


import com.example.db.DbQueries;

public class AddVehicle {
	
	private int vehicleId;
	private int vehicleRegistrationNumber;
	private String vehicleBrand;
	private int maximumVelocityOfVehicle;
	private int capacity;
	private String typeOfVehicle;
	private int purchaseCost;
	private double vehicleTax;
	
	private String confirmToSave;
	
	
	
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public int getVehicleRegistrationNumber() {
		return vehicleRegistrationNumber;
	}
	public void setVehicleRegistrationNumber(int vehicleRegistrationNumber) {
		this.vehicleRegistrationNumber = vehicleRegistrationNumber;
	}
	public String getVehicleBrand() {
		return vehicleBrand;
	}
	public void setVehicleBrand(String vehicleBrand) {
		this.vehicleBrand = vehicleBrand;
	}
	public int getMaximumVelocityOfVehicle() {
		return maximumVelocityOfVehicle;
	}
	public void setMaximumVelocityOfVehicle(int maximumVelocityOfVehicle) {
		this.maximumVelocityOfVehicle = maximumVelocityOfVehicle;
	}
	
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getTypeOfVehicle() {
		return typeOfVehicle;
	}
	public void setTypeOfVehicle(String typeOfVehicle) {
		this.typeOfVehicle = typeOfVehicle;
	}
	public double getVehicleTax() {
		return vehicleTax;
	}
	public void setVehicleTax(double vehicleTax) {
		this.vehicleTax = vehicleTax;
	}
	
	public int getPurchaseCost() {
		return purchaseCost;
	}
	public void setPurchaseCost(int purchaseCost) {
		this.purchaseCost = purchaseCost;
	}
	@Override
	public String toString() {
		return "AddVehicle [vehicleId=" + vehicleId + ", vehicleRegistrationNumber=" + vehicleRegistrationNumber
				+ ", vehicleBrand=" + vehicleBrand + ", maximumVelocityOfVehicle=" + maximumVelocityOfVehicle
				+ ", capacity=" + capacity + ", typeOfVehicle=" + typeOfVehicle + ", vehicleTax=" + vehicleTax
				+ ", purchaseCost=" + purchaseCost + "]";
	}
	
	
	
	
	public void getProperty(Scanner ip)
	{
		System.out.println("ENTER THE PROPERTY DETAILS");
		
		System.out.println("ENTER vehicle Id");
		vehicleId = ip.nextInt();
		System.out.println("Enter Vehicle registration Number ");
		vehicleRegistrationNumber = ip.nextInt();
		ip.nextLine();
		System.out.println("Enter Vehicle Brand ");
		vehicleBrand = ip.nextLine();
		System.out.println("Enter Maximum Velocity of vehicle");
		maximumVelocityOfVehicle = ip.nextInt();
		System.out.println("Enter capacity");
		capacity = ip.nextInt();
		ip.nextLine();
		System.out.println("Enter type of vehicle");
		typeOfVehicle = ip.nextLine();
		System.out.println("Enter Purchase cost ");
		 purchaseCost = ip.nextInt();
		 ip.nextLine();
		 System.out.println("Enter Y to save");
		 confirmToSave = ip.nextLine();
		
		 if(confirmToSave.equals("Y"))
		 {
			AddVehicle ap = new AddVehicle();
			ap.setVehicleId(vehicleId);
			ap.setVehicleRegistrationNumber(vehicleRegistrationNumber);
			ap.setVehicleBrand(vehicleBrand);
			ap.setMaximumVelocityOfVehicle(maximumVelocityOfVehicle);
			ap.setCapacity(capacity);
			ap.setTypeOfVehicle(typeOfVehicle);
			ap.setPurchaseCost(purchaseCost);
				
			System.out.println(ap);
			DbQueries.insertVehicleRrecord(ap);
		 }
		
		
//		return list;
	}
	
	
	
	
	

}
