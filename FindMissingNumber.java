import java.util.Scanner;

public class FindMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,d,i;
		System.out.println("Enter the value of n:");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		int[] arr = new int[n]; 
		int[] array = new int[n];
		for(i=0;i<n;i++) {
			array[i]=i+1;
		}
		System.out.println("Enter the values in array: " + n + " times");
		for(i=0;i<n-1;i++) {
			arr[i]=in.nextInt();
		}
		for(i=0;i<n;i++) {
			if(arr[i] != array[i]) {
			System.out.println(" Missing Number is: "+array[i]);
			break;
			}
		}
	}

}
