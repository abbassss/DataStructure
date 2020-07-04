public class HighArray {

	private int array[];
	private int nItems;

	// constructor
	public HighArray() {
		array = new int[20];
		nItems = 0;
	}

	// insertion
	public void insert(int value) {
		/*
		 * array[nItems] = value; nItems++;
		 */
		array[nItems++] = value;
	}

	// searching
	public boolean find(int searchKey) {
		// Linear Search
		int j;
		for (j = 0; j < nItems; j++) {
			if (searchKey == array[j])
				break;
		}
		if (j == nItems)
			return false;
		else
			return true;
	}

	// deletion
	public boolean delete(int deleteKey) {
		int j;
		for (j = 0; j < nItems; j++) {
			if (deleteKey == array[j])
				break;
		}
		if (j == nItems)
			return false;
		else {
			// Left Shift
			for (int k = j; k < nItems; k++)
				array[k] = array[k + 1];
			nItems--;
			return true;
		}
	}
	
	// display
	public void display(){
		System.out.println("All Items:");
		for(int i=0;i<nItems;i++)
			System.out.print("[" + array[i] + "] ");
		System.out.println();
	}

}
