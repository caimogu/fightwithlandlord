package com.xjtu.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.Test;

import com.xjtu.controller.PlayerController;
import com.xjtu.gamestate.GameState;
import com.xjtu.player.Player;
import com.xjtu.poke.Card;
import com.xjtu.serialize.SocketData;
import com.xjtu.serialize.SocketData2;

public class ClientPlayerController extends PlayerController
{

	private MyClient client ;
	
	public ClientPlayerController()
	{
		client = new MyClient(this);
	}	
	//连接主机	
	public void connect()
	{	
		client.connect();
	}
	@Test
	public void test1()
	{
		ClientPlayerController cpc =  new ClientPlayerController();	
		cpc.connect();
		new Thread(new TestDataThread(this)).start();
			
	}
	class  TestDataThread implements Runnable
	{
		PlayerController pc = null;
		public TestDataThread(PlayerController playerController)
		{
			this.pc = playerController;
		}
		@Override
		public void run() {
			while(true)
			{
				List<Card> cards = new ArrayList<>();
				Card c = new Card();
				c = new Card();c.setKey(1);c.setValue(12);cards.add(c);
				c = new Card();c.setKey(2);c.setValue(13);cards.add(c);	
				c = new Card();c.setKey(3);c.setValue(1);cards.add(c);
				c = new Card();c.setKey(4);c.setValue(2);cards.add(c);
				c = new Card();c.setKey(5);c.setValue(3);cards.add(c);
				c = new Card();c.setKey(6);c.setValue(4);cards.add(c);
				c = new Card();c.setKey(7);c.setValue(5);cards.add(c);	
				c = new Card();c.setKey(8);c.setValue(6);cards.add(c);
				c = new Card();c.setKey(9);c.setValue(7);cards.add(c);
				c = new Card();c.setKey(10);c.setValue(8);cards.add(c);
				c = new Card();c.setKey(11);c.setValue(9);cards.add(c);
				c = new Card();c.setKey(12);c.setValue(10);cards.add(c);
				c = new Card();c.setKey(13);c.setValue(11);cards.add(c);
				c = new Card();c.setKey(14);c.setValue(14);cards.add(c);
				c = new Card();c.setKey(15);c.setValue(15);cards.add(c);

				Scanner reader=new Scanner(System.in);
				while(true){
					List<Card> inputCard = new ArrayList<>();
					int key = 0;
					do{
					key = reader.nextInt();
						for(Card cccc:cards){
							if(cccc.getKey() == key){
								inputCard.add(cccc);
							}
						}
					}while(key != -1);
				pc.setPlayingCards(inputCard);
//				sd.setCallLandlord(pc.getPlayers()[yourIndex].isCallLandlord());
//				sd.setPlayingCards(pc.getPlayingCards());
//				sd.setReady(pc.getPlayers()[yourIndex].isReady());
//				sd.setPassCard(pc.getPlayers()[yourIndex].isPassCard());
			}

				
			}	
		}
		
		
//		pc.setPlayers(sd.getPlayers());
//		pc.setFirst(sd.getFirst());
//		pc.setCurrent(sd.getCurrent());
//		pc.setWinner(sd.getWinner());
//		pc.setGameState(sd.getGameState());
		
//		sd.setCallLandlord(pc.getPlayers()[yourIndex].isCallLandlord());
//		sd.setPlayingCards(pc.getPlayingCards());
//		sd.setReady(pc.getPlayers()[yourIndex].isReady());
//		sd.setPassCard(pc.getPlayers()[yourIndex].isPassCard());
	}
	
	
}
