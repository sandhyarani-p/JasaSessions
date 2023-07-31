package oop_Abstraction;

public class FortisHospital extends Medical implements USMEdical, UKMedical, IndianMedical {

	// we have solved the diamond problems with the interfaces
	// class can have multiple interfaces implemented
	// if interfaces has common method then class has to implement the common method
	// only once.here its EmergencyService()

	public static void main(String[] args) {

	}

//US
	@Override
	public void physioServices() {
		System.out.println("FH--physioServices");

	}

	@Override
	public void CardioService() {
		System.out.println("FH--CardioService");

	}

	@Override
	public void ENTService() {
		System.out.println("FH--ENTService");

	}

	// UK
	@Override
	public void neuroService() {
		System.out.println("FH--neuroService");

	}

	@Override
	public void orthoServices() {
		System.out.println("FH--dentalServices");

	}

//Indian
	@Override
	public void dentalServices() {
		System.out.println("FH--dentalServices");

	}

	@Override
	public void oncologyServices() {
		System.out.println("FH--oncologyServices");
	}

	@Override
	public void gynoServices() {
		System.out.println("FH--gynoServices");

	}

	// FH individual methods:

	public void medicalTraining() {
		System.out.println("FH--medicalTraining");
	}

	public void medicalInsurance() {
		System.out.println("FH--medicalInsurance");
	}

	@Override
	public void EmergencyService() {
		// TODO Auto-generated method stub

	}

	@Override
	public void test(int a) {
		// TODO Auto-generated method stub

	}

	@Override
	public String get(int a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String get(int a, int b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void covidVaccination() {
		System.out.println("FH-covidvaccination");
		
	}

	@Override
	public void medicalNews() {
		System.out.println("FH-medicalNews");
		
	}
	
	//we can override the default method without using the keyword default
	@Override
public void billing() {
		
		System.out.println("US--billing");
	}

}
