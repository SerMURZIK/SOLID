import java.util.Map;

public class Basket {
    private Purchase[] purchases = new Purchase[4];

    public void addPurchase(String title, int count) {
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] == null) {
                purchases[i] = new Purchase(title, count);
                return;
            }
            if (purchases[i].getTitle().equals(title)) {
                purchases[i].addCount(count);
                return;
            }
        }
    }



    public long sum(Map<String, Integer> prices) {
        long sum = 0;
        System.out.println("КОРЗИНА:");
        for (int i = 0; i < purchases.length; i++) {
            Purchase purchase = purchases[i];
            if (purchase == null) continue;
            System.out.println("\t" + purchase.getTitle() + " " +
                    purchase.getCount() + " шт. в сумме " +
                    (purchase.getCount() * prices.get(purchase.getTitle()))
                    + " руб.");
            sum += purchase.getCount() * prices.get(purchase.getTitle());
        }
        return sum;
    }
}
