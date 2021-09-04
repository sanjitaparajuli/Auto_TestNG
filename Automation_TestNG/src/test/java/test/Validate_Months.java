package test;

import org.testng.annotations.Test;

public class Validate_Months {
	int n = 12;
	
	@Test
	public void validateMonths() {
	
		String[] month = {"Jan","Feb","Mar", "Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
				 	
		     for(int i = 1; i<12; i++){
		        System.out.println(month[n]);
		
	}
	}
}

