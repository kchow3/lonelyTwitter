package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class TweetListModel {

	private static ArrayList<AbstractTweetModel> tweetlist;
	
	public TweetListModel() {
		super();
		tweetlist = new ArrayList<AbstractTweetModel>();
	}

	public ArrayList<AbstractTweetModel> getTweetlist() {
		return tweetlist;
	}

	public void setTweetlist(ArrayList<AbstractTweetModel> tweetlist) {
		this.tweetlist = tweetlist;
	}
	
	
}
