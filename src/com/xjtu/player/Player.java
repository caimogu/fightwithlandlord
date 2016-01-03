package com.xjtu.player;

import java.util.List;

import com.xjtu.gamestate.GameState;
import com.xjtu.poke.Card;

public abstract class Player {

	protected List<Card> hand = null;//ÊÖÅÆ
	protected int score = 0;//»ý·Ö
	protected boolean isCallLandlord = false;
	protected boolean isReady = false;
	protected boolean isPassCard = false;
	
	
	
	public boolean isPassCard() {
		return isPassCard;
	}
	public void setPassCard(boolean isPassCard) {
		this.isPassCard = isPassCard;
	}
	public boolean isCallLandlord() {
		return isCallLandlord;
	}
	public void setCallLandlord(boolean isCallLandlord) {
		this.isCallLandlord = isCallLandlord;
	}
	public List<Card> getHand() {
		return hand;
	}
	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public boolean isReady() {
		return isReady;
	}
	public void setReady(boolean isReady) {
		this.isReady = isReady;
	}

	
	
	
	
	
}
