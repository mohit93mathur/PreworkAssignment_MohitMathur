import java.util.Scanner;

public class PatternPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j,k;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		for(i=n;i>0;i--) 
		{   k=n;
			while(k>0) {
				for(j=i;j>0;j--) 
				{
					System.out.print(" "+ k);
				}
				k--;
			}
			
			System.out.println(" ");
		}
	}

}
