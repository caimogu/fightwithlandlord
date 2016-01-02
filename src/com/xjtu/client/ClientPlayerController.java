package com.xjtu.client;

import java.util.ArrayList;
import java.util.List;

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
	
	
}
