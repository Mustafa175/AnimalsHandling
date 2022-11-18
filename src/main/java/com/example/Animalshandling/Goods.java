package com.example.Animalshandling;

public class Goods {
    private int goodsNr;
    private String goodsDescribe;

    public Goods(int goodsNr, String goodsDescribe){

        this.goodsNr = goodsNr;
        this.goodsDescribe = goodsDescribe;

    }
    public String toString() {return goodsNr+"   "+ goodsDescribe;}
}
