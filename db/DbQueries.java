package com.example.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.example.assignment.propertytax.AddProperty;
import com.example.assignment.vehicletax.AddVehicle;

public class DbQueries {
	
	public static void insertRrecord(AddProperty ap)
	{
		try
		{
			System.out.println("In insertRecord function");
			Connection connection = DbConnect.getConnection();
			String sql = "insert into addProperty values (?,?,?,?,?,?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			
				ps.setInt(1,ap.getPropertyId());
				ps.setInt(2,ap.getBaseValueOfLand());
				ps.setInt(3,ap.getBuildUpArea());
				ps.setInt(4,ap.getAgeOfLandInYears());
				ps.setString(5,ap.getLocatedInCity());
				ps.setDouble(6,ap.getTax());
			int n = ps.executeUpdate();
			System.out.println("Inserted "+n+" rows successfully");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
	
	public static List<AddProperty> getRecord()
	{
		List<AddProperty> list = new ArrayList();
		try
		{
			Connection connection = DbConnect.getConnection();
			String sql = "select * from addProperty";
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			AddProperty ap = new AddProperty();
			while(rs.next())
			{
				ap = new AddProperty();
				ap.setPropertyId(rs.getInt(1));
				ap.setBaseValueOfLand( rs.getInt(2));
				ap.setBuildUpArea( rs.getInt(3));
				ap.setAgeOfLandInYears(rs.getInt(4));
				ap.setLocatedInCity(rs.getString(5));
				ap.setTax((int) rs.getDouble(6));
				list.add(ap);
			}
//			System.out.println("Inserted "+n+" rows successfully");
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		return list;
		
	}
	
	
	public static void updateRecord(AddProperty ap, double tax)
	{
		try {
			Connection connection = DbConnect.getConnection();
			String sql = "update addProperty set propertyTaxes = ? where propertId = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setDouble(1, tax);
			ps.setInt(2, ap.getPropertyId());
			int rs = ps.executeUpdate();
			System.out.println("propertyId "+ap.getPropertyId()+" is updated!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	
//	 Vehicle Related Queries
	
	
	
	public static void insertVehicleRrecord(AddVehicle av)
	{
		try
		{
			System.out.println("In insertRecord function");
			Connection connection = DbConnect.getConnection();
			String sql = "insert into addVehicle values (?,?,?,?,?,?,?,?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			
				ps.setInt(1,av.getVehicleId());
				ps.setInt(2,av.getVehicleRegistrationNumber());
				ps.setString(3,av.getVehicleBrand());
				ps.setInt(4,av.getMaximumVelocityOfVehicle());
				ps.setInt(5,av.getCapacity());
				ps.setString(6,av.getTypeOfVehicle());
				ps.setInt(7,av.getPurchaseCost());
				ps.setDouble(8,av.getVehicleTax());
			int n = ps.executeUpdate();
			System.out.println("Inserted "+n+" rows successfully");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
	
	
	
	
	
	public static List<AddVehicle> getVehicleRecord()
	{
		List<AddVehicle> list = new ArrayList();
		try
		{
			Connection connection = DbConnect.getConnection();
			String sql = "select * from addVehicle";
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			AddVehicle ap = new AddVehicle();
			
			while(rs.next())
			{
				ap = new AddVehicle();
				ap.setVehicleId(rs.getInt(1));
				ap.setVehicleRegistrationNumber(rs.getInt(2));
				ap.setVehicleBrand(rs.getString(3));
				ap.setMaximumVelocityOfVehicle(rs.getInt(4));
				ap.setCapacity(rs.getInt(5));
				ap.setTypeOfVehicle(rs.getString(5));
				ap.setPurchaseCost(rs.getInt(7));
				ap.setVehicleTax(rs.getDouble(8));
				list.add(ap);
			}
//			System.out.println("Inserted "+n+" rows successfully");
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		return list;
		
	}
	
	
	
	
	
	
	
	public static void updateVehicleRecord(AddVehicle ap, double tax)
	{
		try {
			Connection connection = DbConnect.getConnection();
			String sql = "update addVehicle set vehicletax = ? where vehicleId = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setDouble(1, tax);
			ps.setInt(2, ap.getVehicleId());
			int rs = ps.executeUpdate();
			System.out.println("vehicleId "+ap.getVehicleId()+" is updated!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static int[] recordCount() throws Exception
	{
		Connection connection = DbConnect.getConnection();
		String sql = "select count(*) from addProperty";
		PreparedStatement ps1 = connection.prepareStatement(sql);
		ResultSet count1 = ps1.executeQuery();
		int res1 = 0;
		if (count1.next()) {  
		    res1 = count1.getInt(1); 
		}
		
		sql = "select count(*) from addVehicle";
		PreparedStatement ps2 = connection.prepareStatement(sql);
		ResultSet count2 = ps2.executeQuery();
//		int res2 = count2.getInt(1);
		int res2 = 0;
		if (count2.next()) {  
		    res2 = count2.getInt(1);  
		}
		return new int[] {res1, res2};
		
	}
	public static double[] taxSum() throws Exception
	{
		Connection connection = DbConnect.getConnection();
		String sql = "select sum(propertyTaxes) from addProperty";
		PreparedStatement ps1 = connection.prepareStatement(sql);
		ResultSet count1 = ps1.executeQuery();
		int res1 = 0;
		if (count1.next()) {  
		    res1 = count1.getInt(1); 
		}
		
		sql = "select sum(vehicleTax) from addVehicle";
		PreparedStatement ps2 = connection.prepareStatement(sql);
		ResultSet count2 = ps2.executeQuery();
		int res2 = 0;
		if (count2.next()) {  
		    res2 = count2.getInt(1);  
		}
		return new double[] {res1, res2};
		
	}
	
	

}
