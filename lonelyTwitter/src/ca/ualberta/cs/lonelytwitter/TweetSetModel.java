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

	public void addTweet(NormalTweetModel normalTweetModel) throws IllegalArgumentException
	{
		
		for(int i = 0; i <count; i++)
		{
			if(list.get(i).equals(normalTweetModel))
			{
				throw new IllegalArgumentException();	
			}
		}
		
		count++;
		list.add(normalTweetModel);
	}

	public NormalTweetModel[] getTweets() {
		return list.toArray(new NormalTweetModel[list.size()]);
	}

}
