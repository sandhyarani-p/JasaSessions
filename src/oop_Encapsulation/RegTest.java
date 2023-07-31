package oop_Encapsulation;



public class RegTest {

	public static void main(String... args) {
		
		
		//CRUD
		//POst  call- create user
		Register rg = new Register("Sandhya", 25, 1212121253L, "Pune", true);
		
		//GET call
		System.out.println(rg.getName());
		System.out.println(rg.getAge());
		System.out.println(rg.getPhonenumber());
		System.out.println(rg.getCity());
		System.out.println(rg.isPermanent());
		
		//setter are required here to update values later 
		//PUT -update call
		rg.setCity("Bangalore");
		rg.setPhonenumber(989898989);
		//GET call
		//check my profile
		System.out.println(rg.getName());
		System.out.println(rg.getAge());
		System.out.println(rg.getPhonenumber());
		System.out.println(rg.getCity());
		System.out.println(rg.isPermanent());
		
		
		Register reg1 =new Register("Sandhya", 1134253422);
		//check my profile //GET call
		System.out.println(reg1.getName());
		System.out.println(reg1.getPhonenumber());
		System.out.println(reg1.getAge());
		System.out.println(reg1.getCity());
		System.out.println(reg1.isPermanent());
		
		reg1.setAge(33);
		reg1.setCity("Delhi");
		reg1.setPermanent(true);
		
		//check profile after update
		//PUT call
		System.out.println(reg1.getName());
		System.out.println(reg1.getPhonenumber());
		System.out.println(reg1.getAge());
		System.out.println(reg1.getCity());
		System.out.println(reg1.isPermanent());
		
		
	}

}
