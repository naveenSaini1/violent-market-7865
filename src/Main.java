import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==============Online Hardware and software support system======================");
		while(true) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Your Choice");
			System.out.println("1 HOD");
			System.out.println("2 Enginer");
			System.out.println("3 Employee");
			int choice=sc.nextInt();
			switch (choice) {
			case 1:
					
				break;
			case 2:
				
				break;
			case 3:
				
				break;
				
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
			
			
			
		}
		

	}

}
