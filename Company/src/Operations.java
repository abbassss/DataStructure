
import java.util.Scanner;
public class Operations extends Employee {
	static Scanner input=new Scanner(System.in);	
	static Employee[] MyArray=new Employee[5];
	
	static private int nItems = 0;
	static int mid;
	/*****************constructor**************************/
	public Operations() {
		
	}
	
	/***********************Insert*******************************/
	public void Insert(Employee emp) {
			
		if(nItems<5) {
			MyArray[nItems]= emp;
			nItems++;	
		}
		else {
			System.out.println("Memory is full.");
		}
	}
	/*************************Delete*******************************/
	public void Delete(int ID) {
			
		int location = Search(ID);
		if (location == nItems)
			System.out.println("Not found!");
		else {
			// Left Shift
			for (int k = location; k < nItems; k++)
				MyArray[k] = MyArray[k + 1];
			nItems--;
			System.out.println("Deleted succesfully.");
		}
						
			
		
			/*for(int i=0;i<MyArray.length;i++){
				if(MyArray[i].getId()== ID) {
					for(int j=i;j <= MyArray.length;j++) {
						MyArray[j]=MyArray[j+1];
						nItems--;
					}
				}
				else {
					System.out.println("ID "+ID+" does Not Exist!");
				}
			}*/
		}
	/************************Search********************************/
	public int Search(int searchKey) {
		// Binary Search
		int lowerBound = 0;
		int upperBound = nItems - 1;
		int mid;

		while (true) {
			mid = (lowerBound + upperBound) / 2;
			if (MyArray[mid].getId() == searchKey)
				return mid; // exists
			else if (lowerBound > upperBound)
				return nItems; // not exists
			else {
				if (MyArray[mid].getId() < searchKey)
					lowerBound = mid + 1;
				else
					upperBound = mid - 1;
			}
		}
	}
	/************************Display********************************/
	public void Display() {
		
		for(int i=0;i<nItems;i++) {
			System.out.println((i+1)
			+"- id: "+MyArray[i].getId()
			+" , name: "+MyArray[i].getName()
			+" , salary: "+MyArray[i].getSalary());
		}
	}
	
}
