import java.util.*;
public class ArraysLab3 {

	
	public static void main(String[] args) {
		int[] a1 = {5,10,15,20,25,30,35,40};
		int[] a2 = {7,14,21,28,35,42,49,56};
		int[] sumArr = sum(a1,a2);
		System.out.println(Arrays.toString(sumArr));
		int appendNum = 200;
		int[] appendArr = append(a1,appendNum);
		System.out.println(Arrays.toString(appendArr));
		int removeIdx = 5;
		int[] removeArr = remove(a2,removeIdx);
		System.out.println(Arrays.toString(removeArr));
		int sumOfEvens = sumEven(appendArr);
		System.out.println(sumOfEvens);
		rotateRight(a1);
		System.out.println(Arrays.toString(a1));

	}
	
	public static int[] sum(int[] arr1, int[] arr2) { 
		int [] output = new int [arr1.length];
		for(int i = 0; i < arr1.length; i++) {
			output[i] = arr1[i] + arr2[i];
		}
		return output;
	}
	
	public static int[] append(int[] arr, int num){
		int [] output = new int [arr.length + 1];
		for ( int i = 0; i <output.length-1; i+=1) {
			output[i] = arr[i];
		}
		output[output.length-1] = num;
		return output;
	}
	
	public static int[] remove(int[] arr, int idx) {
		int [] output = new int [arr.length - 1];
		for ( int i = 0; i <idx; i+=1) {
			output[i] = arr[i];
		}
		for (int k = idx; k< output.length; k++) {
			output[k] = arr[k+1];
		}
		return output;
	}
	
	public static int sumEven (int[] arr) {
		int output = arr[0];
		for ( int i = 2; i <arr.length; i+=2) {
			output = arr[i] + output;
		}
		return output;
	}
	
	public static void rotateRight( int[] arr) {
		int temp = arr[arr.length-1] ;
		for ( int i = arr.length-1; i >0; i-=1) {
			arr[i] = arr[i-1];
		}
		arr[0] = temp;
	}


}
