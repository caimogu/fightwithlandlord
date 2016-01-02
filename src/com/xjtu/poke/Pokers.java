package com.xjtu.poke;

import java.util.ArrayList;
import java.util.List;

public class Pokers {
	private int pokerKeyNumber = 15;
	private  List<Card> pokerList;
	private int[] cardValue=new int[]{12,13,1,2,3,4,5,6,7,8,9,10,11,14,15};
	
	public Pokers()
	{
		pokerList = new ArrayList<Card>();
		initialize();
		for(int i=0;i<pokerList.size();++i)
		{
			Card card = new Card();
			card = pokerList.get(i);
			System.out.println("ÅÆÖµ£º"+card.getKey()+"»¨É«£º"+card.getColor());
		}
	}
	
	public void initialize()
	{
		for( int i=1; i<=pokerKeyNumber; i++ )
		{
			if(i>13)
			{
				Card card_small = new Card();
				card_small.setKey(i);
				card_small.setValue(14);
				card_small.setColor(Card.PokerColor.JOKER_SMALL);
				pokerList.add(card_small);
				Card card_big = new Card();
				//card_big.setKey(i);
				card_big.setKey(++i);
				card_big.setValue(15);
				card_big.setColor(Card.PokerColor.JOKER_BIG);
				pokerList.add(card_big);
				break;
			}else
			{	
				for(int  j=0; j<4; j++)
				{
					Card card = new Card();
					card.setKey(i);
					card.setValue(cardValue[i-1]);
					switch(j)
					{
					case 0:
						card.setColor(Card.PokerColor.HEART);	
						pokerList.add(card);
						break;
					case 1:
						card.setColor(Card.PokerColor.SPADE);
						pokerList.add(card);
						break;
					case 2:
						card.setColor(Card.PokerColor.CLUB);
						pokerList.add(card);
						break;
					case 3:
						card.setColor(Card.PokerColor.DIAMOND);
						pokerList.add(card);
						break;
					}	
				}
			}	
		}	
	}

	public List<Card> getPokerList() {
		return pokerList;
	}

	public void setPokerList(List<Card> pokerList) {
		this.pokerList = pokerList;
	}
	
}
