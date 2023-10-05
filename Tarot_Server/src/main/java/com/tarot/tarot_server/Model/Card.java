package com.tarot.tarot_server.Model;
import java.util.Random;
public class Card {

    private Long id;
    private String cardName;
    private String meaning;
    private String reversed;
    private final Random rd = new Random();
    private boolean upRight = rd.nextBoolean();

    public Card() {}

    public Card(Long id, String cardName, String meaning, String reversed, boolean upRight) {
        this.id = id;
        this.cardName = cardName;
        this.meaning = meaning;
        this.reversed = reversed;
        this.upRight = upRight;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public String getReversed() {
        return reversed;
    }

    public void setReversed(String reversed) {
        this.reversed = reversed;
    }

    public boolean isUpRight() {
        return upRight;
    }

    public String cardDirection(){
        if (upRight){
            return getMeaning();
        } else {
            return getReversed();
        }
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", cardName='" + cardName + '\'' +
                ", meaning='" + meaning + '\'' +
                ", reversed='" + reversed + '\'' +
                ", upRight=" + upRight +
                '}';
    }
}
