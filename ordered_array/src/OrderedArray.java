public class OrderedArray {

	private int array[];
	private int nItems;

	// constructor
	public OrderedArray() {
		array = new int[20];
		nItems = 0;
	}
	
	public int size(){
		return nItems;
	}

	// insertion
	public void insert(int value) {
		int j;
		for (j = 0; j < nItems; j++)
			if (array[j] > value)
				break;

		// Right Shift
		for (int k = nItems; k > j; k--)
			array[k] = array[k - 1];
		array[j] = value;
		nItems++;
	}

	// searching
	public int find(int searchKey) {
		// Binary Search
		int lowerBound = 0;
		int upperBound = nItems - 1;
		int mid;

		while (true) {
			mid = (lowerBound + upperBound) / 2;
			if (array[mid] == searchKey)
				return mid; // exists
			else if (lowerBound > upperBound)
				return nItems; // not exists
			else {
				if (array[mid] < searchKey)
					lowerBound = mid + 1;
				else
					upperBound = mid - 1;
			}
		}
	}

	// deletion
	public boolean delete(int deleteKey) {
		int location = find(deleteKey);
		if (location == nItems)
			return false;
		else {
			// Left Shift
			for (int k = location; k < nItems; k++)
				array[k] = array[k + 1];
			nItems--;
			return true;
		}
	}

	// display
	public void display() {
		System.out.println("All Items:");
		for (int i = 0; i < nItems; i++)
			System.out.print("[" + array[i] + "] ");
		System.out.println();
	}

}
