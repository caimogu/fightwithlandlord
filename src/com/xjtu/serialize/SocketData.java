package com.xjtu.serialize;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.xjtu.gamestate.GameState;
import com.xjtu.player.Player;
import com.xjtu.poke.Card;

public class SocketData implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9111L;
	private Player[] players;//三个玩家的信息
	private List<Card> lastThreePokers;//三张底牌
	private GameState gameState;//游戏状态
	private int first;//东家
	private int current;//当前轮到谁出牌
	private int winner;
	private int yourIndex;//
	private List<Card> lastCardsOnDesk;
	
	
	public Player[] getPlayers() {
		return players;
	}
	public void setPlayers(Player[] players) {
		this.players = players;
	}
	public List<Card> getLastThreePokers() {
		return lastThreePokers;
	}
	public void setLastThreePokers(List<Card> lastThreePokers) {
		this.lastThreePokers = lastThreePokers;
	}
	public GameState getGameState() {
		return gameState;
	}
	public void setGameState(GameState gameState) {
		this.gameState = gameState;
	}
	public int getFirst() {
		return first;
	}
	public void setFirst(int first) {
		this.first = first;
	}
	public int getCurrent() {
		return current;
	}
	public void setCurrent(int current) {
		this.current = current;
	}
	public int getWinner() {
		return winner;
	}
	public void setWinner(int winner) {
		this.winner = winner;
	}
	public int getYourIndex() {
		return yourIndex;
	}
	public void setYourIndex(int yourIndex) {
		this.yourIndex = yourIndex;
	}
	public List<Card> getLastCardsOnDesk() {
		return lastCardsOnDesk;
	}
	public void setLastCardsOnDesk(List<Card> lastCardsOnDesk) {
		this.lastCardsOnDesk = lastCardsOnDesk;
	}
	
		
}
