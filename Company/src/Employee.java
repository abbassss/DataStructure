
import java.util.Scanner;
public class Employee {
	static Scanner input=new Scanner(System.in);
	static Employee[] MyArray=new Employee[5];
	
	
	private int Id;
	private String Name;
	private double salary;	
	
	public Employee() {

	}
	/***************setter/getter*******************************/
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	
	public void setName(String name) {
		boolean flag=false;
		
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)>'a' && name.charAt(i)<'z') {
				flag = true;
				break;
			}
			
		}
		if(flag==true) {
			Name = name;
		}
		else {
			System.out.println("Name is not valid.try again.");
			setName(input.nextLine());
		}
		
	}

	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if(0<salary) {
			this.salary = salary;
		}
		else {
			System.out.println("Enter valid number.");
			double s=input.nextDouble();
			setSalary(s);
		}
	}
	
	
	
}
