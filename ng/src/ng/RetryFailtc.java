package ng;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryFailtc {
	@Test
	public void Retry() {
		
		Assert.assertTrue(false, "retrying");
		
	}
}
