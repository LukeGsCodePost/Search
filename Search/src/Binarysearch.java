public class Binarysearch { //a public class with the same name as the java file
	private int [] arr;       // a private integer array as member data

	Binarysearch(){  //public constructor

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
	public static void selectionSort(int[] arr){  
		for (int i = 0; i < arr.length - 1; i++)   //outer loop
		{  
			int index = i;  
			for (int j = i + 1; j < arr.length; j++){   //inner loop
				if (arr[j] < arr[index]){               
					index = j;//searching for minimum of the index  
				}  
			}  
			int smallerNumber = arr[index];   
			arr[index] = arr[i];  
			arr[i] = smallerNumber;  
		}  //end for(outer)
	}      

	public  int search( int[] arr, int valueToBeFound){ 
		int loc =0;                                    //location variable
		int start = 0;                                 // start of the array
		int end = arr.length - 1;                        // end of the array
		int mid = (start+end)/2;                         //middle of the array
		while (start <= end && arr[mid]!= valueToBeFound) {       //if the start is less than or equal to the end or if the middle of the array is not the value to be found


			if (valueToBeFound < arr[mid]){    // if the value is found below the middle
				end = mid - 1;                       
			}
			else  start = mid + 1;            
			mid = (start + end)/2;       
		}


		if (arr[mid]==valueToBeFound){ // if the mid is equal to the value to be found i.e. if the value is found
			loc = mid; }               // location equals mid     
		else { loc = loc-1;}             // minus the index of the location 
		return loc;                      // returns the index of the found element
	}

	public static void main(String a[]){

		int numList[] = { 1, 3, 8, 12, 34, 56, 78, 87, 92 }; //first array to be tested
		int toSearch = 12;                                  //first value to be found
		Binarysearch binarysearch = new Binarysearch(); //creates an object of the class
		selectionSort(numList);
		printArray(numList);

		System.out.println("Value "+toSearch+" found at index: "+binarysearch.search(numList, toSearch) );
		printArray(numList);
		System.out.println("Value "+toSearch+" found at index: "+binarysearch.search(numList, toSearch) );
		printArray(numList);
		System.out.println("Value "+toSearch+" found at index: "+binarysearch.search(numList, toSearch) );
		printArray(numList);

		//applies the method and prints accordingly


	}
}