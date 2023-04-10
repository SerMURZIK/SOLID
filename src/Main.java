import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final int breadPrice = 56;
    private static final int butterPrice = 153;
    private static final int sausagePrice = 211;
    private static final int piePrice = 45;

    public static void main(String[] args) {
        HashMap<String, Integer> products = new HashMap<>();
        products.put("Хлеб", breadPrice);
        products.put("Масло", butterPrice);
        products.put("Колбаса", sausagePrice);
        products.put("Пирожок", piePrice);

        System.out.println("В МАГАЗИНЕ В НАЛИЧИИ");
        for (Map.Entry<String, Integer> productAndPrice : products.entrySet()) {
            System.out.println(productAndPrice.getKey() + " за " + productAndPrice.getValue() + " руб./шт.");
        }

        System.out.println("Введите два слова: название товара и количество. Или end");
        Scanner scanner = new Scanner(System.in);
        Purchase purchase = new Purchase();
        Basket basket = new Basket();
        while (true) {
            String line = scanner.nextLine();
            if ("end".equals(line)) break;
            String[] parts = line.split(" ");
            String product = parts[0];
            int count = Integer.parseInt(parts[1]);
            basket.addPurchase(product, count);
        }
        long sum = basket.sum(products);
        System.out.println("ИТОГО: " + sum);
    }
}
