package org.example.store;

public class BusanRes extends BasicRes{
    public void makeGanZZ() {
        System.out.println("계란후라이있는간짜장");
    }

    @Override
    public void makeZazang() {
        makeGanZZ();
    }
}
