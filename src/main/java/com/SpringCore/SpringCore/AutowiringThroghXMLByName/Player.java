package com.SpringCore.SpringCore.AutowiringThroghXMLByName;

public class Player {

	private int playerId;
	private String playerName;
	private Pistol revolver;
	
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
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", p_25=" + revolver + "]";
	}
	
	
	
	
	
	
	
}
