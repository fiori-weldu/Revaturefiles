package main;


import java.util.Scanner;
public class Converter {
public static void CupToSpoons(float value) {
	System.out.println(value+"cup is" +" "+value*48+"spoons");
		
	}
public static void GalToImpgal(float value) {
	System.out.println(value+"Gallon is"+" "+value/1.201+"Imp gallon");	
	}
public static void TonToKilo(float value) {
	 System.out.println(value+"Ton is" +" "+value*907.18474+" Killogram");
	
}
public static void FeetToMeters (float value) {
	 System.out.println(value+"Feet is" +" "+value*0.3048+"Meters");
}
public static void MilesToLilo(float value) {
	 System.out.println(value+"Mile is" +" "+value*1.609344+" Killometer");
}
public static void KiloToMeters(float value) {
	System.out.println(value+"Kilometers is"+" "+value*1000+"meters");
	
}
	public static void main(String[] args) {
		int Selection = 0;
	while( Selection!=3) {
		 try {
			 
			 System.out.println("Please select an option:\n"+
			 
					 "1.Volume conversions \n"+
					 "2.Distance conversions \n"+
			           "3.quit");
			 Scanner scann=new Scanner(System.in);
			   Selection=scann.nextInt();
			  
			  
		 
		 
  if(Selection==1) {
				  
	int  menuSelection = 0; 
			System.out.println("Please select an option:\n"+
				"1. Cups to Teaspoons \n"+
				"2. US Gallons to Imperial Gallons\n"+
				"3. US ton to kilogram \n"); 
			
			Scanner scan=new Scanner(System.in);
			  menuSelection=scan.nextInt();
			  System.out.println("Enter quantity");
			  Scanner scan1=new Scanner(System.in);
			  float value=Float.parseFloat(scan1.nextLine());
			 
			  switch( menuSelection) {
			
			  case 1:
				  
				  CupToSpoons(value);
				  break;
			  
			  case 2:
				 
				  GalToImpgal (value);
				  break;
				  
			  case 3:
				
				  TonToKilo(value);
				  break;
				  
			  }
			  }
  
  
if(Selection==2) {
	int  menuSelection = 0;  
			
				System.out.println("Please select an option:\n"+
					"1. Feet to Meters \n"+
					"2. Miles to Kilometers \n"+
					"3. kilometers to meter\n"
					);

				
				Scanner scan=new Scanner(System.in);
				  menuSelection=scan.nextInt();
				  System.out.println("Enter quantity of Feet");
				  Scanner scan1=new Scanner(System.in);
				  float value=Float.parseFloat(scan1.nextLine());
				  switch( menuSelection) {
				
				  case 1:
					  
					  FeetToMeters(value);
					  break;
					  
				  case 2:
					 
					  MilesToLilo(value);
					  break;
					  
				  case 3:
					 
					  KiloToMeters(value);
					  break;
					  
				  }
			  }
	}
			  catch(Exception e) {
					System.out.println("There is " + e + ". Please try again.");
				}
			  
	}
	
				
		
	}

}
