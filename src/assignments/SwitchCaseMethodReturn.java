package assignments;

public class SwitchCaseMethodReturn {

	public static void main(String[] args) {

		int marks = -1;
		
		switch (marks) {
		case 90:
			System.out.println("Neelam got 90");
			break;
		case 95:
			System.out.println("Mitaz got 95");
			break;
		case 80:
			System.out.println("Ravi got 80");
			break;
		case 10:
			System.out.println("Naveen got 10");
			break;

		default:
			System.out.println("Employee not found");
			break;
		}

	}

}
