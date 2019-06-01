package com.company.mypack.observer.observerMatch;

public class MatchDemo {
    public static void main(String[] args) {

        Match russiaVSegypt = new Match();
        Observer rusTV = new RussianTV(russiaVSegypt);
        Observer egyTV = new EgyptTV(russiaVSegypt);
        Observer engTV = new EnglandTV(russiaVSegypt);

        russiaVSegypt.addObserver(rusTV);
        russiaVSegypt.addObserver(egyTV);
        russiaVSegypt.addObserver(engTV);

        russiaVSegypt.setCounting(1,0);
        russiaVSegypt.setCounting(2,0);
        russiaVSegypt.setCounting(3,0);
        russiaVSegypt.setCounting(3,1);
        System.out.println(((RussianTV) rusTV).getMatch().getLeft() + " | " + ((RussianTV) rusTV).getMatch().getRight());

        for (int i = 0; i < russiaVSegypt.getListObservers().size(); i++)
            System.out.println(russiaVSegypt.getListObservers().get(i).getClass());
    }
}
