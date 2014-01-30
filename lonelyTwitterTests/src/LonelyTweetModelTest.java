import java.util.Date;

import ca.ualberta.cs.lonelytwitter.ImportantTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import android.test.ActivityInstrumentationTestCase2;


public class LonelyTweetModelTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

	public LonelyTweetModelTest() {
		super(LonelyTwitterActivity.class);
	}
	
	/*
	public void testFailure()
	{
		//assertTrue()
		//assertFalse()
		assertEquals("5 should equal 5", 5, 4);
	}
	*/
	
	public void testEquals()
	{
		Date date = new Date();
		NormalTweetModel normal = new NormalTweetModel("test", date);
		ImportantTweetModel important = new ImportantTweetModel("test", date);
		
		assertTrue("should always be false", normal.equals(important));
	}

}
