package photo;
import java.util.Scanner;

public class operation {
	public void show(){
		int l,n,w,h;
		System.out.println("enter the image values");
		Scanner sc=new Scanner(System.in);
		l=sc.nextInt();
		n=sc.nextInt();
		for(int i=0;i<n;i++){
			w=sc.nextInt();
			h=sc.nextInt();
			if(w<l||h<l){
				System.out.println("Upload Another");
			}
			else if(w==h){
				System.out.println("Accepted");
			}else{
				System.out.println("Crop It");
			}
		}
	}

}
