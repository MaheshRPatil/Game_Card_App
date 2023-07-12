package com.example.gamesapp;

public class GameModel {
    private String gameName;
    private int gameImg;

    public GameModel(String gameName,int gameImg){
        this.gameImg=gameImg;
        this.gameName=gameName;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public int getGameImg() {
        return gameImg;
    }

    public void setGameImg(int gameImg) {
        this.gameImg = gameImg;
    }
}
