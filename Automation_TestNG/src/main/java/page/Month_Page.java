package page;

import org.testng.annotations.Test;

public class Month_Page {
	
	
	@Test
	public void month() {
		String month[] = new String[] {"Jan","Feb","Mar","Apr","May","June","July","Aug","Sept","Oct","Nov","Dec"};
		for (int i = 0; i < month.length; i++) {
		    System.out.println(month[i]);
		}
	}

}
