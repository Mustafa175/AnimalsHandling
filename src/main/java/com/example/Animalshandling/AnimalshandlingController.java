package com.example.Animalshandling;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class AnimalshandlingController {

    @FXML
    private ListView orderList = new ListView();


    @FXML
    private ListView goodsList = new ListView();



    public void initialize(){
        Order o0 = new Order(1,"M","22/02");
        Order o1 = new Order(2,"N","5/5");
        Order o2 = new Order(3,"H","8/12");
        Order o3 = new Order(4,"C","7/7");
        Order o4 = new Order(5,"A","7/8");

        Goods g0 = new  Goods(1,"hundefoder");
        Goods g1 = new  Goods(2,"kattelem");
        Goods g2 = new  Goods(3,"slange");
        Goods g3 = new  Goods(4,"aquarium");
        Goods g4 = new  Goods(5,"fuglebur");
        Goods g5 = new  Goods(6,"bold");
        Goods g6 = new  Goods(7,"madskål");
        Goods g7 = new  Goods(8,"guldfisk");
        Goods g8 = new  Goods(9,"terrarium");
        Goods g9 = new  Goods(10,"kødben");

        orderList.getItems().add(o0.toString());
        orderList.getItems().add(o1.toString());
        orderList.getItems().add(o2.toString());
        orderList.getItems().add(o3.toString());
        orderList.getItems().add(o4.toString());

       goodsList.getItems().add(g0.toString());
        goodsList.getItems().add(g1.toString());
        goodsList.getItems().add(g2.toString());
        goodsList.getItems().add(g3.toString());
        goodsList.getItems().add(g4.toString());
        goodsList.getItems().add(g5.toString());
        goodsList.getItems().add(g6.toString());
        goodsList.getItems().add(g7.toString());
        goodsList.getItems().add(g8.toString());
        goodsList.getItems().add(g9.toString());

    }



}
