package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.example.propertySuper.PropertyTax;
import com.example.propertytax.AddProperty;

public class Main {

	public static void main(String[] args) {
		
		List<AddProperty> list = new ArrayList<>();
		Scanner ip = new Scanner(System.in);
		PropertyTax propertyTax = new PropertyTax();
		propertyTax.propertyMethod(list, ip);
		System.out.println(list);

	}

}
