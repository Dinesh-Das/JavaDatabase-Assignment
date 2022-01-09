import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		int choice;
		Scanner sc= new Scanner(System.in);
		DbFunctions db =new DbFunctions();
		int stdId,stdAge;
		String stdName,stdCity,stdPhone,stdDept;
		do
		{
			System.out.println("Sql Curd Operations (Enter a number to proceed).");
			System.out.println("1. Insert Student Details");
			System.out.println("2. Retrive Student Detail");
			System.out.println("3. Delete Student Detail");
			System.out.println("4. Update Student Detail");
			System.out.println("5. Display Student Data");
			System.out.println("6. Exit");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				sc.nextLine();
				System.out.println("Enter Student Details");
				System.out.println("Name:");
				stdName=sc.nextLine();
				System.out.println("Age:");
				stdAge=sc.nextInt();
				sc.nextLine();
				System.out.println("City:");
				stdCity=sc.nextLine();
				System.out.println("Phone Number:");
				stdPhone=sc.nextLine();
				System.out.println("Department:");
				stdDept=sc.nextLine();
				db.InsertStudentDetail(stdName, stdAge, stdCity, stdPhone, stdDept);
				break;
			case 2:
				db.RetriveAllStudentDetails();
				break;
			case 3:
				sc.nextLine();
				System.out.println("Enter the StudentID which you want to delete");
				stdId=sc.nextInt();
				db.DeleteStudentDetail(stdId);
				break;
			case 4: 
				sc.nextLine();
				System.out.println("Enter the StudentID whose data you want to update");
				stdId=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Student Details");
				System.out.println("Name:");
				stdName=sc.nextLine();
				System.out.println("Age:");
				stdAge=sc.nextInt();
				sc.nextLine();
				System.out.println("City:");
				stdCity=sc.nextLine();
				System.out.println("Phone Number:");
				stdPhone=sc.nextLine();
				System.out.println("Department:");
				stdDept=sc.nextLine();
				db.UpdateStudentDetail(stdId, stdName, stdAge, stdCity, stdPhone, stdDept);
				break;
			case 5:
				sc.nextLine();
				System.out.println("Enter the StudentID whose data you want to retrive");
				stdId=sc.nextInt();
				sc.nextLine();
				db.RetriveStudentDetail(stdId);
				break;
			case 6:
				System.out.println("Exiting..... :)");
				break;
			default :
				System.out.println("Invalid Choice");
			}
			
		}while(choice!=6);
		sc.close();
	}

}
