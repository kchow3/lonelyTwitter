import java.util.ArrayList;
import java.util.Date;

import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import ca.ualberta.cs.lonelytwitter.TweetSetModel;
import android.test.ActivityInstrumentationTestCase2;


public class TweetSetModelTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

	public TweetSetModelTest() {
		super(LonelyTwitterActivity.class);
	}
	
	/*
	public void testCount()
	{
		TweetSetModel tweets = new TweetSetModel();
		
		assertEquals("tweets should start empty", 0, tweets.countTweets());
		
		tweets.addTweet(new NormalTweetModel("test"));
		assertEquals("after adding a tweet, count should be 1", 1, tweets.countTweets());
	}
	*/
	
	public void testTweet()
	{
		TweetSetModel tweets = new TweetSetModel();

		Date adate = new Date();
		NormalTweetModel[] array = new NormalTweetModel[3];
		
		NormalTweetModel model = new NormalTweetModel("test1", adate);
		tweets.addTweet(model);
		array[0] = model;
		
		model = new NormalTweetModel("test2", adate);
		tweets.addTweet(model);
		array[1] = model;
		
		model = new NormalTweetModel("test3", adate);
		tweets.addTweet(model);
		array[2] = model;
		
		NormalTweetModel[] tweet = tweets.getTweets();
		
		assertEquals("These 2 arrays are equal", tweet[0], array[0]);
		
		model = new NormalTweetModel("test1", adate);
		tweets.addTweet(model);
		
	}

}
