package paralleltesting;

import org.testng.annotations.Test;

public class ConfigurationForIndividualTests {
	
	@Test(threadPoolSize = 3,invocationCount = 3, timeOut = 1000)
	public void runManyTimes() {
		System.out.println(1+" : "+Thread.currentThread().getId());
	}

}
