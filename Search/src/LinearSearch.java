public class LinearSearch { //a public class with the same name as the java file
	private int [] arr;       // a private integer array as member data

	LinearSearch(){  //public constructor


	}
	public String toString(int number){ //toString method, creates a string showing the private member data of the class

		StringBuffer sb = new StringBuffer(); 
		for(int i = 0; i<arr.length; i++){ 
			sb.append(arr[i]).append(",");
		}

		return sb.toString();

	} // end of toString method

	public  int search( int[] arr, int valueToBeFound){ 

		int size = arr.length;
		for(int i=0;i<size;i++){ //traverses the array 
			System.out.println("Linear search:" +  Integer.toString(arr[i]));

			if(arr[i] == valueToBeFound){  
				//checks if valueToBeFound matches any of the elements found in each index of the array

				return i;  //returns the integer if found
			}
		}
		return -1; //returns -1 if not found
	}

	public static void main(String a[]){

		int numList[] = { 1, 3, 8, 12, 34, 56, 78, 87, 92 }; //first array to be tested
		int toSearch = 12;                                  //first value to be found
		LinearSearch linearSearch = new LinearSearch(); //creates an object of the class
		System.out.println("Value "+toSearch+" found at index: "+linearSearch.search(numList, toSearch)); //applies the method and prints accordingly
		System.out.println(" ");
		int numList2[] = { 3, 8, 8, 12, 34, 56, 78, 87, 10 }; // 2nd array to be tested
		int toSearch2 = 10;                                   //2nd value to be found
		System.out.println("Value "+toSearch2+" found at index: "+linearSearch.search(numList2, toSearch2));
		System.out.println(" ");
		int numList3[] = { 4, 5, 1, 3, 10, 6, 65, 12, 180 };  //3rd array to be tested
		int toSearch3 = 10;                                   //3rd value to be found 
		System.out.println("Value "+toSearch2+" found at index: "+linearSearch.search(numList3, toSearch3));


	}
}
