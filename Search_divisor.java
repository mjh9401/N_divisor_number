import java.util.ArrayList;
import java.util.Scanner;

public class Search_divisor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();
		int a=0;
		ArrayList<Integer>list = new ArrayList<>();
		
		if(temp >= 1 && temp <=1000) {
			a= temp;
		}
		
		for(int i=1;i<=a;i++) {
			if(a % i == 0) {
				list.add(i);
			}
		}
		
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}

	}
}
