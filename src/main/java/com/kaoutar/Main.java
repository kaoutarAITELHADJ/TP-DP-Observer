package com.kaoutar;

import com.kaoutar.obs.*;

public class Main {
    public static void main(String[] args) {
        ObservableImpl observable = new ObservableImpl();
        Observer o1 = new ObserverImpl1();
        Observer o2 = new ObserverImpl2();
        // faire un subscribe
        observable.subscribe(o1);
        observable.subscribe(o2);
        observable.setState(88);
        observable.setState(99);
        // unsubscribe pr o2
        observable.unsubscribe(o2);
        //un objet anonyme
        observable.subscribe((newState) -> {
            System.out.println("+++++++++ ObserverImpl3 +++++++++ " );
            System.out.println("Resultat: "+newState * Math.random()*5);
            System.out.println("++++++++++++++++++++++++++++++++++");
        });
        observable.setState(111);
    }
}