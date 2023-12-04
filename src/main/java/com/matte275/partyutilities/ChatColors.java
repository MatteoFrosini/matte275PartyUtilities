package com.matte275.partyutilities;

public enum ChatColors {
    //Console text colors
    //https://i.stack.imgur.com/9UVnC.png
    GREEN("\u001B[92m"),
    CYAN("\u001B[96m"),
    RED("\u001B[91m"),
    END("\u001B[0m");
    private String color;
    ChatColors(String color){
        this.color = color;
    }
    public String toString(){
        return this.color;
    }
    public static String stringColor(ChatColors color, String messagge){
        return color + messagge + END;
    }
}
