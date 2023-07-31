package oop_Abstraction;

public class TestHospital {

	public static void main(String[] args) {
		
		
		FortisHospital fs = new FortisHospital();
		fs.physioServices();
		fs.neuroService();
		fs.CardioService();
		fs.EmergencyService();
		fs.dentalServices();
		fs.ENTService();
		fs.gynoServices();
		fs.medicalInsurance();
		fs.medicalTraining();
		System.out.println(USMEdical.min_fee);
		System.out.println(FortisHospital.min_fee);
		//FortisHospital.min_fee=33;//not possible to reassign as its final in nature.
		
		USMEdical.usMedPharmacy();
		fs.billing();
		
		
		//we cannot create object for interface,because we dont have business logic in Interface
		
		//USMEdical us = new USMEdical();
		
		//can we do topcasting?
		//child class object referred by parent interface ref variable-top casting
		
		USMEdical us=new FortisHospital();
		us.CardioService();
		us.ENTService();
		us.physioServices();
		us.EmergencyService();
		
		UKMedical uk=new FortisHospital();
		uk.EmergencyService();
		uk.neuroService();
		uk.orthoServices();
		
		IndianMedical in=new FortisHospital();
		
		in.dentalServices();
		in.oncologyServices();
		in.gynoServices();
		
		
		//downcasting:compile time error- we cant create object of parent interface
		
		//FortisHospital f1 = new USMEdical();
		

	}

}
