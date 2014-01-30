import java.util.ArrayList;

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

		ArrayList<NormalTweetModel> tweetstest = new ArrayList<NormalTweetModel>();
		tweets.addTweet(new NormalTweetModel("test1"));
		tweetstest.add(new NormalTweetModel("test1"));
		
		tweets.addTweet(new NormalTweetModel("test2"));
		tweetstest.add(new NormalTweetModel("test2"));
		
		tweets.addTweet(new NormalTweetModel("test3"));
		tweetstest.add(new NormalTweetModel("test3"));
		
		tweets.addTweet(new NormalTweetModel("test4"));
		tweetstest.add(new NormalTweetModel("test4"));
		
		tweets.addTweet(new NormalTweetModel("test5"));
		tweetstest.add(new NormalTweetModel("test5"));
		
		NormalTweetModel tweet[] = tweets.getTweets();
		NormalTweetModel[] array = (NormalTweetModel[])tweetstest.toArray();
		
		assertEquals("These 2 arrays are equal", tweet, array);
		
	}

}
