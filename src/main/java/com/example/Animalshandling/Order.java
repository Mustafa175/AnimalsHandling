package com.example.Animalshandling;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderNr;
    private String customerName;
    private String date;



private List<Goods> goods = new ArrayList<Goods>();
public Order (int orderNr, String customerName, String date) {

    this.orderNr = orderNr;
    this.customerName = customerName;
    this.date = date;
}
public  void attachGoods (Goods g) {goods.add(g);}
public String toString() {return orderNr + "  " + customerName;}
}