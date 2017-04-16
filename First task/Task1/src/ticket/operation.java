package ticket;
import java.util.Scanner;

public class operation {
	public void show(){
		System.out.println("enter the no. of seats you want to see");
		Scanner sc=new Scanner(System.in);
		int j=sc.nextInt();
		int[]seats=new int[j];
		for(int i=0;i<seats.length;i++){
			seats[i]=sc.nextInt();
		}
		for(int i=0;i<seats.length;i++){
			int div=seats[i]/12;
			if (seats[i]%12==0){
				div--;
			}
			int f=13+(24*div);
			int front=f-seats[i];
			System.out.print(front+" ");
			int k=Math.abs(front-seats[i]);
			if(j==1||j==11)
				System.out.println("WS");
			else if(j==3||j==9)
				System.out.println("MS");
			else if(j==7||j==5)
				System.out.println("AS");
		}
	}

}
