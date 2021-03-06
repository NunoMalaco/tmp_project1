package geral;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Twitter {

	public HashMap<Tweet,Integer> topTweets;
	public HashMap<String,Integer> tweetPorMinuto;
	public HashMap<String,LinkedList<Tweet>> Tweets;
	public List<Area> cidades;
	
	public Twitter(){
		
	}
	
	public void post(Tweet tweet){
		String user = tweet.getUser();
		if(Tweets.containsKey(user)){
			Tweets.get(user).addFirst(tweet);
		}else{
			LinkedList<Tweet> lista = new LinkedList<Tweet>();
			lista.add(tweet);
			Tweets.put(user, lista);
		}
		
		ActualizaTopTweets(tweet);
		ActualizaTweetsPorData(tweet.getData());
		ActualizaCidades(tweet.getGeoLoc());
		
	}
	
	public LinkedList<Tweet> getTweetsUserOrderByDate(String user){
		Collections.sort(Tweets.get(user), new DateComp());
		return Tweets.get(user);
		
	}

	
	private void ActualizaCidades(Ponto geoLoc) {
		// TODO Auto-generated method stub
		
	}

	private void ActualizaTweetsPorData(Date data) {
		// TODO Auto-generated method stub
		
	}

	private void ActualizaTopTweets(Tweet tweettweet){
		
	}
	
	public void getTopTweets(int rangeTweets){
		
		
	}
	
	public void getNumTweetsUser(String c){
		
	}
	
	public void getBestWindows(Date d1, Date d2, int granularidade){
		
	}
	
	public void getTopCidades(){
		
	}
	
	
}
