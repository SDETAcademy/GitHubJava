package day_39;

public class BestBuyObject {
    public static void main(String[] args) {

        BestBuy bestBuy = new BestBuy();

        bestBuy.setPhone("Iphone");
        bestBuy.setTablet("Ipad");
        bestBuy.setMic("Yetti");
        bestBuy.setSoundbar("Visio");
        bestBuy.setWebcam("Nexigo");
        bestBuy.setTv("Sony");

        System.out.println(bestBuy.getPhone());
        System.out.println(bestBuy.getTablet());
        System.out.println(bestBuy.getMic());
        System.out.println(bestBuy.getSoundbar());
        System.out.println(bestBuy.getWebcam());
        System.out.println(bestBuy.getTv());

    }
}
