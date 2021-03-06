package com.example.yokaigameisep;

public class CaseBoard {

    private int color;

    private TipCard cardOnTop;

    public CaseBoard(int color, TipCard cardOnTop){
        this.color = color;
        this.cardOnTop = cardOnTop;

    }

    static public CaseBoard NullCard(){
        return new CaseBoard(Constant.VOID_CASE, null);
    }

    public int getColor() {
        return color;
    }

    public TipCard getCardOnTop() {
        return cardOnTop;
    }


    public void setColor(int color) {
        this.color = color;
    }

    public void setCardOnTop(TipCard cardOnTop) {
        this.cardOnTop = cardOnTop;
    }

    @Override
    public String toString() {
        if (cardOnTop != null)
            return color + "#" +  cardOnTop.toString();
        else
            return color + "#" + "null";
    }
}
