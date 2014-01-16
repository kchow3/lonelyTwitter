package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class TweetController implements TweetControllerInterface {

	private TweetListModel tweetListModel;
	
	public TweetController() {
		super();
		tweetListModel = new TweetListModel();
	}

	public void addTweet(String text) {
		ArrayList<LonelyTweetModel> list = tweetListModel.getTweetlist();
		list.add(new NormalTweetModel());
	}

	
	
}
