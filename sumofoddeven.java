import java.util.Scanner;
class SumOddEven{
	
	public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in)
			int  N=sc.nextInt();
			  int sumEven=0;
			  int sumOdd=0;
			  while(N>0){
				  int R=N%10;
				  if(R%2==0){
					  sumEven+=R;
				  }
				  else{
					  sumOdd+=R;
				  }
				  N/=10;
			    }
			    System.out.println(sumEven);
				System.out.println(sumOdd);
		
		
		
	}
}