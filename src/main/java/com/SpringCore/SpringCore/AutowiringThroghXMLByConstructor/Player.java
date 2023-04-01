package com.SpringCore.SpringCore.AutowiringThroghXMLByConstructor;

public class Player {

	private int playerId;
	private String playerName;
	private Pistol revolver;
	
	
	
	public Player() {
		
	}
	
	public Player(int playerId, String playerName, Pistol revolver) {
		System.out.println("Inside paremeterized constructor");
		this.playerId = playerId;
		this.playerName = playerName;
		this.revolver = revolver;
	}

	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	public Pistol getRevolver() {
		return revolver;
	}
	public void setRevolver(Pistol revolver) {
		this.revolver = revolver;
	}
	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", revolver=" + revolver + "]";
	}
	
	
	
	
	
	
	
}
