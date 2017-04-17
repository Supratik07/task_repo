package ascii;
import java.util.*;
public class operation {
	static ArrayList<Integer> list=new ArrayList<>();
	public void show(){
		for(int i=67;i<=122;i++){
			if(i%2!=0 & i%3!=0 & i%5!=0 & i%7!=0 & i%11!=0)
				list.add(i);
		}
		//for(int i:list)
		//	System.out.println("Character in list "+i);
		Scanner input = new Scanner(System.in);
		int count=input.nextInt();
		for(int i=1;i<=count;i++)
			{
			int length=input.nextInt();
			char[] inputString=input.next().toCharArray();
			System.out.println(getMagicWord(inputString));
			}
		     
	}
 
	private static StringBuffer getMagicWord(char[] inputString) {
		StringBuffer output= new StringBuffer();
		int smaller = 0,larger;
		
		for(char input:inputString){
			
			if(list.contains(input))
				output.append(Character.toString(input));
			else{
				if(input<65)
				{
					output.append("C");
					continue;
				}
				for(int i:list)
				{
					if(input>i){
						smaller= i;	
						if(smaller==113)
							output.append(Character.toString((char)smaller));
							
						
					}
					else{
						larger=i;
						if(input-smaller<=larger-input)
							output.append(Character.toString((char)smaller));
						else
							output.append(Character.toString((char)larger));
						break;
					}
					
				}
			}
			smaller=0;larger=0;
			//System.out.println("Output: "+input+"   at  "+output);
		}
		return output;
	}

}
