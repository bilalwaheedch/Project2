package Package2;

public class TestHouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		House myHouse = new House();
		myHouse.tvPlayShow(myHouse.tvShowQuestion());
		
		System.out.println("Total House Area: "+myHouse.addHouseSize(10, 10));
	}

}
