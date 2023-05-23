package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Games {

	private STATUS status;
	private String figure;
	private String nickName;

	public Games() {
	}

	public Games(STATUS status, String figure, String nickName) {
		super();
		this.status = status;
		this.figure = figure;
		this.nickName = nickName;
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
	
	public String LocalDate() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return now.format(formatter);
	}

	@Override
	public String toString() {
		return nickName+ ";" + status + ";" + figure + ";" + LocalDate()+"\n";
	}


}