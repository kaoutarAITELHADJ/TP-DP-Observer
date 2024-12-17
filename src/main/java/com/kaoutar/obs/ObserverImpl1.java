package com.kaoutar.obs;

public class ObserverImpl1 implements Observer {
    @Override
    public void update(int newState) {
        System.out.println("----------- ObserverImpl1 ----------");
        System.out.println("Observer state: " + newState);
        System.out.println("----------- ObserverImpl1 ----------");
    }
}
