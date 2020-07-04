
import java.util.Scanner;
public class Menu extends Operations {	
	static Scanner input=new Scanner(System.in);	
	
	private int UserInput;
	private boolean Exit;
	/***************************************/
	public Menu() {
		UserInput=0;
		Exit=false;
	}
	/***************************************************/
	
	public void display() {		
		
		Operations op=new Operations();
		
		while(!Exit) {			
			Employee Emp=new Employee();
			System.out.println();
			System.out.println("************** MENU **************");
			System.out.println("Choose a number:");
			System.out.println("1-Insert an Employee");
			System.out.println("2-Delete an Employee");
			System.out.println("3-Search an Employee");
			System.out.println("4-Display Employees");
			System.out.println("5-Exit");
			System.out.print("->");
			UserInput =input.nextInt();
			
			switch(UserInput) {
				case 1:
					System.out.println("Enter ID:");
					Emp.setId(input.nextInt());					
					System.out.println("Enter name:");
					Emp.setName(input.next());			
					System.out.println("Enter salary:");
					Emp.setSalary(input.nextDouble());					
					op.Insert(Emp);
					break;
				case 2:
					System.out.println("Enter an ID:");			
					op.Delete(input.nextInt());
					break;
				case 3:
					System.out.println("Enter Id:");
					int in=input.nextInt();
					int exist = op.Search(in);
					if(exist== mid) {
						System.out.println("ID "+in+" is exist.");
					}
					else {
						System.out.println(in+" is not exist.");
					}
					break;
				case 4:
					op.Display();
					break;	
				case 5:
					Exit=true;
					break;
				default:
					System.out.println("Invalid input.choose again.");
			
			}
		
		}
	}
}
