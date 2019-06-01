package com.company.mypack.observer.observerBase;

public class VegetableBase {
    public static void main(String[] args) {
        CostData costData = new CostData();
        costData.setCost(150, 250, 200);

        MarketSun marketSun = new MarketSun(costData);
        marketSun.display();

        costData.costChanged();

        MarketRain marketRain = new MarketRain(costData);
        MarketMini marketMini = new MarketMini(costData);

        marketRain.display();
        marketMini.display();

        costData.costChanged();
        costData.costChanged();
        costData.costChanged();

        System.out.println(costData.getList().size());
        System.out.println(costData.getList().get(2));
        System.out.println(costData.getList().get(1));
        System.out.println(costData.getList().get(0));

        costData.removeObserver(marketRain);
        costData.costChanged();

        System.out.println(costData.getList().size());

    }
}
