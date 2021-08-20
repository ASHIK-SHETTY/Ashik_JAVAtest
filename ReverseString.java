import java.util.ArrayList;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<>();
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the size of string : ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			ar.add(sc.next());
		}
		System.out.println("Reversed String : ");
		for(int j=ar.size()-1;j>=0;j--) {
			System.out.println(ar.get(j));
		}

	}

}