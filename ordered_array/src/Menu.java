import java.util.Scanner;


public class Menu {
	
	private int request;
	private boolean exit;
	
	public Menu() {
		request = 0;
		exit = false;
	}
	
	public void display(){
		
		Scanner input = new Scanner(System.in);
		OrderedArray orderedArray = new OrderedArray();
		do{
			System.out.println("Menu Options:");
			System.out.println();
			System.out.println("    1. Insert a new item.");
			System.out.println("    2. Delete an item.");
			System.out.println("    3. Search an item.");
			System.out.println("    4. Display all items.");
			System.out.println("    5. Exit.");
			System.out.println();
			System.out.print("? ");
			
			request = input.nextInt();
			switch(request){
			case 1:
				// insert
				System.out.println("Please enter an integer value:");
				System.out.print("? ");
				int value = input.nextInt();
				orderedArray.insert(value);
				System.out.println();
				break;
			case 2:
				// delete
				System.out.println("Please enter an integer value for delete key:");
				System.out.print("? ");
				int deleteKey = input.nextInt();
				if(orderedArray.delete(deleteKey))
					System.out.println(deleteKey + " was deleted successfully...");
				else
					System.out.println(deleteKey + " is not found.");
				System.out.println();				
				break;
			case 3:
				// search
				System.out.println("Please enter an integer value for search key:");
				System.out.print("? ");
				int searchKey = input.nextInt();
				int location = orderedArray.find(searchKey);
				if(location != orderedArray.size())
					System.out.println(searchKey + " is exists in the array at index = " + location);
				else
					System.out.println(searchKey + " is not exists in the array.");
				System.out.println();
				break;
			case 4:
				// display
				orderedArray.display();				
				break;
			case 5:
				// exit
				exit = true;
				System.out.println("Thank you, See you later...");
				break;
			default:
				System.out.println("Invalid Option. Please try again!!!");
				System.out.println();
			}
		}while(!exit);
		
	}

}
