package com.knexno.letters;

public class Letter {

    private String from;
    private String text;

    public Letter(String from, String text){
        this.from = from;
        this.text = text;
    }

    public String getFrom() {
        return from;
    }

    public String getText(){return text;}
}
