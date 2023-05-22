package model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Games {

	private STATUS status;
	private String figure;
	private String DateTimeFormatter;
	private String nickName;
	private ArrayList<Games> listPlayers = new ArrayList<Games>();

	public Games() {
	}

	public Games(STATUS status, String figure, String dateTimeFormatter, String nickName) {
		super();
		this.status = status;
		this.figure = figure;
		DateTimeFormatter = dateTimeFormatter;
		this.nickName = nickName;
	}

	public ArrayList<Games> getListPlayers() {
		return listPlayers;
	}

	public void setListPlayers(ArrayList<Games> listPlayers) {
		this.listPlayers = listPlayers;
	}

	public void addPlayer(Games player) {
		listPlayers.add(player);
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public STATUS getStatus() {
		return status;
	}

	public void setStatus(STATUS status) {
		this.status = status;
	}

	public String getFigure() {
		return figure;
	}

	public void setFigure(String figure) {
		this.figure = figure;
	}

	public String getDateTimeFormatter() {
		return DateTimeFormatter;
	}

	public void setDateTimeFormatter(String dateTimeFormatter) {
		DateTimeFormatter = dateTimeFormatter;
	}

	public String getActualTime() {
		DateTimeFormatter = "" + LocalDateTime.now();
		return DateTimeFormatter;
	}

    public String toString(){
    String info = "";
        for (Games infoPlayers : listPlayers) {
            info += "Nickname: " + infoPlayers.getNickName() + " Status: " + infoPlayers.getStatus() + " Figure: " + infoPlayers.getFigure() + " Data Time: " + infoPlayers.getDateTimeFormatter() + " \n";
        }
        
        return info;
    }
	
}