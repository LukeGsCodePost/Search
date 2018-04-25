public class SelfOrganisingSearch { //a public class with the same name as the java file
	// a private integer array as member data

	SelfOrganisingSearch(){  //public constructor

	} // end of toString method

	private static void printArray(int[] anArray) { //prints array by implementing stringbuilder
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < anArray.length; i++) {
			if (i > 0) {
				sb.append(", ");
			}
			sb.append(anArray[i]);
		}
		System.out.println(sb.toString());
	}

	public static int search( int[] arr, int valueToBeFound){ 
		int loc = 0;

		while(loc<arr.length && arr[loc] != valueToBeFound){ //traverses the array

			loc++;
		}
		if(loc==arr.length){ 
			loc--;

		}
		else if(loc!=0){           //moves the found number one space to the left
			int temp =arr[loc-1]; 
			arr[loc-1]=arr[loc];
			arr[loc]=temp;
			loc = loc-1;

		}

		return loc;  //returns the integer if found

	}

	public static void main(String a[]){

		int numList[] = { 1, 3, 8, 12, 34, 56, 78, 87, 92 }; //first array to be tested
		int toSearch = 12;                                  //first value to be found
		SelfOrganisingSearch selfOrganising = new SelfOrganisingSearch(); //creates an object of the class
		printArray(numList);
		System.out.println("Value "+toSearch+" found at index: "+selfOrganising.search(numList, toSearch) );
		printArray(numList);
		System.out.println("Value "+toSearch+" found at index: "+selfOrganising.search(numList, toSearch) );
		printArray(numList);
		System.out.println("Value "+toSearch+" found at index: "+selfOrganising.search(numList, toSearch) );
		printArray(numList);

		//applies the method and prints accordingly


	}
}