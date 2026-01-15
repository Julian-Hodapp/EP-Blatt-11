package h3;

public class H3_main {
	public static void main(String[] args) {
		int[] array = {1,6,9,5,4};
		
		array = mergeSort(array);
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static int[] mergeSort(int[] array) {
		if (array.length <= 1) {
			return array;
		} else {
			int cutOff = array.length / 2;
			
			int[] leftArray = new int[cutOff]; 
			int[] rightArray = new int[array.length - cutOff]; 
			
			for(int i = 0; i < leftArray.length; i++) {
				leftArray[i] = array[i];
			}
			
			for(int j = 0; j < rightArray.length; j++) {
				rightArray[j] = array[cutOff + j];
			}
			
			int[] left = mergeSort(leftArray);
			int[] right = mergeSort(rightArray);
			
			return merge(left, right);
		}	
	}
	
	public static int[] merge(int[] left, int[] right) {
		int[] merged = new int[left.length + right.length];
		
		int i = 0, j = 0, k = 0;
		
		while(i < left.length && j < right.length) {
			if(left[i] <= right[j]) {
				merged[k] = left[i];
				i++;
				k++;
			} else {
				merged[k] = right[j];
				j++;
				k++;
			}
		}
		
		while (i < left.length) {
			merged[k] = left[i];
			i++;
			k++;
		}
		
		while (j < right.length) {
			merged[k] = right[j];
			j++;
			k++;
		}
		
		return merged;
	}
}
