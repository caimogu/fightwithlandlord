package com.xjtu.poke;

public class Card {
	public  enum PokerColor
	{
		HEART,SPADE,CLUB,DIAMOND,JOKER_SMALL,JOKER_BIG
	}
	
	private PokerColor color;//花色
	private int key;//牌值
	private int value;//大小
	
	public PokerColor getColor() {
		return color;
	}
	public void setColor(PokerColor color) {
		this.color = color;
	}
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	
	public boolean equals(Card card){
		if(card != null && color == card.getColor() && key ==card.getKey()){
			return true;
		}
		return false;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	

}
