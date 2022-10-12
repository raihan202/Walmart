package upskill.Utilities;

import cucumber.api.Scenario;
import cucumber.api.java.After;


public class AfterAction {

	
	@After
	public void afterActins(Scenario Scenario) throws Exception {
		
		SetupDrivers.tearDownDriver();
		System.out.println("------Test complete,Browse closed");
	}
}
