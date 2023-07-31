package javasessions;

public class SwitchCaseUseCases {

	public static void main(String[] args) {
		
		//aeiou-->vowels
		
		char c='p';
		
		switch (c) {
		case 'a':
			System.out.println("this is vowel");
			
			break;
		case 'e':
			System.out.println("this is vowel");
			
			break;
		case 'i':
			System.out.println("this is vowel");
			
			break;
		case 'o':
			System.out.println("this is vowel");
		case 'u':
			System.out.println("this is vowel");
			
			break;
			
			
			

		default:
			System.out.println("this is a consonant");
			break;
		}
		
		//env - dev/stage/QA/uat/prod
		
		String envName="dev ";
		
		switch (envName.trim().toLowerCase()) {
		case "qa":
			
			System.out.println("this run on QA");
			
			break;
		case "dev":

			System.out.println("this run on dev");

			break;
		case "uat":

			System.out.println("this run on uat");

			break;
		case "prod":

			System.out.println("this run on prod");

			break;
		case "stage":

			System.out.println("this run on stage");

			break;

		default:
			System.out.println("please pass the correct envName"+envName);
			break;
		}
		
		
		//cross browser testing:
		
		String browser="edge";
		double version=100.12;
		
		switch (browser) {
		case "chrome":
			
			System.out.println("running on chrome");
			
			break;
		case "firefox":
			
			System.out.println("running on firefox");
			if(version == 100.11) {
				System.out.println("run 100.11 version");
				break;
			}
			
			break;
		case "edge":
			System.out.println("running on edge");
			if(version == 100.12) {
				System.out.println("run 100.12 version");
				
			break;}
		case "safari":
			System.out.println("running on safari");
			
			break;
			

		default:
			System.out.println("please pass the correct browser");
			break;
		}
		
		//booking app-uber:mini/sedan/auto/prime
		
		String cartype ="sedan";
		int persons=7;
		
		switch (cartype) {
		case "sedan":
			
			if(persons>=5) {
				System.out.println("sedan is allocated");
				switch (persons) {
				case 6:
					System.out.println("extra 400 rs is increased");
					
					break;
				case 7:
					System.out.println("extra 700 rs is increased");
					
					break;


				}
			}
			
			break;
		case "mini":
			System.out.println("mini is allocated");
			break;
		
		case "auto":
			System.out.println("auto is allocated");
			break;
		case "prime":
			System.out.println("prime is allocated");
			break;
		default:
			System.out.println("cabs are not available");
			break;
		}
		
		//loans:Home.,car,education ,personal loan
		
		String loan="Home";
		
		int salary=30000;
		
		switch (loan) {
		case "Home":
			if(salary<35000) {
				switch (salary) {
				case 30000:
					System.out.println("NOT APPLICABLE FOR Housing Loan");
					
					break;
				
				default:
					System.out.println("please check the eligibility");
					break;
				}
			}
			System.out.println("home loan is selected");
			break;
		case "car":
			System.out.println("car loan is selected");
			break;
		case "Education":
			System.out.println("Education loan is selected");
			break;
		case "Personal":
			System.out.println("Personal loan is selected");
			break;
			

		default:
			System.out.println("please select the correct loan type"+loan);
			break;
		}
		
		//run testcases:sanity,smoke,regression,prod

		
		String testcases = "sanity";
		
		switch (testcases) {
		case "Regression":
			System.out.println("Regression tests are executing");
			break;
		case "sanity":
			System.out.println("sanity tests are executing");
			break;
		case "smoke":
			System.out.println("smoke tests are executing");
			break;
		case "unit":
			System.out.println("unit tests are executing");
			break;

		default:
			System.out.println("please pass the right tests");
			break;
		}
	}

}
