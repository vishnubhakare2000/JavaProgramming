package program;
import java.util.Scanner;
public class Duplicateelement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an size of array:");
		int size=sc.nextInt();
		int duplicatecount=0;
		int arr []=new int [size];
		System.out.println("Enter a array element:");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();		}
		
	
	for(int i=0;i<size;i++) {
		for(int j=i+1;j<size;j++) {
			if(arr[i]==arr[j]) {
				System.out.println("Duplicate element:"+arr[i]);
				duplicatecount ++;
			}
			
		}
	}
		System.out.println("Duplicatecount:"+duplicatecount);
	
}
}
