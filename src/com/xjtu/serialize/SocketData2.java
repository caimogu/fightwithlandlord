package com.xjtu.serialize;

import java.io.Serializable;
import java.util.List;

import com.xjtu.poke.Card;

public class SocketData2 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 911L;
	
	private boolean isReady;
	private boolean isCallLandlord;
	private List<Card> playingCards;
	private boolean isPassCard = false;
	
	public boolean isPassCard() {
		return isPassCard;
	}
	public void setPassCard(boolean isPassCard) {
		this.isPassCard = isPassCard;
	}
	public boolean isReady() {
		return isReady;
	}
	public void setReady(boolean isReady) {
		this.isReady = isReady;
	}
	public boolean isCallLandlord() {
		return isCallLandlord;
	}
	public void setCallLandlord(boolean isCallLandlord) {
		this.isCallLandlord = isCallLandlord;
	}
	public List<Card> getPlayingCards() {
		return playingCards;
	}
	public void setPlayingCards(List<Card> playingCards) {
		this.playingCards = playingCards;
	}
	
}
