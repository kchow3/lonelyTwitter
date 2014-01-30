package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class TweetSetModel {

	private int count;
	private ArrayList<NormalTweetModel> list;
	
	public TweetSetModel()
	{
		list = new ArrayList<NormalTweetModel>();
		count = 0;
	}
	
	public int countTweets() {
		return count;
	}

	public void addTweet(NormalTweetModel normalTweetModel) {
		count++;
		list.add(normalTweetModel);
	}

	public NormalTweetModel[] getTweets() {
		
		return (NormalTweetModel[]) list.toArray();
	}

}
