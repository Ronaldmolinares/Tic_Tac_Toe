package model;

import java.time.LocalDateTime;

public class Games {
    private Usuario usuario = new Usuario();
    private STATUS status;
    private FIGURE figure;
    private String DateTimeFormatter;

    public Games() {
    }

    public Games(Usuario usuario, STATUS status, FIGURE figure, String dateTimeFormatter) {
        this.usuario = usuario;
        this.status = status;
        this.figure = figure;
        DateTimeFormatter = dateTimeFormatter;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public STATUS getStatus() {
        return status;
    }

    public void setStatus(STATUS status) {
        this.status = status;
    }

    public FIGURE getFigure() {
        return figure;
    }

    public void setFigure(FIGURE figure) {
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

}