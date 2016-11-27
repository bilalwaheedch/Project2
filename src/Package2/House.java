package Package2;
import java.util.*;

public class House {

		// TODO Auto-generated method stub
		public int address;
		public String houseName;
		Scanner in = new Scanner(System.in);
	public String tvShowQuestion(){
		System.out.println("Enter name of the TV Show: ");
		String x = in.nextLine();
		return x;
	}
	public void tvPlayShow(String x){
		System.out.println("Playing TV Show: "+x);
	}
	
	public int addHouseSize(int length, int height){
		int total = length * height;
		return total;
	}
		
	}


