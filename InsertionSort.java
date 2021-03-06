/**
 * An implementation of an Insertion sort algorithm
 * @author Christopher
 *
 */
public class InsertionSort {

	public static void main(String[] args) {

	}
	
	/**
	 * Sort the elements in a given array by visiting each location and comparing their values
	 * @param array an array to be sorted
	 */
	public void sort(int[] array) {
		//If the array has nothing in it
		if(array == null) {
			return;
		}
		//Get the length of the array
		int arrayLength = array.length;
		//Loop through the length of the array
		for (int i = 1; i <= arrayLength- 1; i++) {
			//The element to be tested
			int tempPoint = array[i];
			//Set a previous marker
			int j = i - 1;
			//If the previous arrays value is greater than the currently tested element
			while(j >= 0 && array[j] > tempPoint) {
				//swap the points
				array[j + 1] = array[j];
				j -= 1;
			}
			//Update the new point
			array[j + 1] = tempPoint;
		}
	}

}
