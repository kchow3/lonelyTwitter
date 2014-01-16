package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class TweetListModel {

	private static ArrayList<LonelyTweetModel> tweetlist;
	
	public TweetListModel() {
		super();
		tweetlist = new ArrayList<LonelyTweetModel>();
	}

	public ArrayList<LonelyTweetModel> getTweetlist() {
		return tweetlist;
	}

	public void setTweetlist(ArrayList<LonelyTweetModel> tweetlist) {
		this.tweetlist = tweetlist;
	}
	
	
}
