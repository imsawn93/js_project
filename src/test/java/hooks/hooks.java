package hooks;

import base.baseclass;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks extends baseclass{

	
	@Before
	
public void start() {
		
	setup();
	}
	
	@After
	
public void close() {
	
driver.close();
		
	}
}
