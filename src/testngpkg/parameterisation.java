package testngpkg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterisation {
    
	@Parameters("s")
	@Test
	public void set(String s) {
		System.out.println(s);
	}
	
}
