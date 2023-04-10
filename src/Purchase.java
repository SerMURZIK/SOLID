import java.util.Map;

public class Purchase {
    private String title;
    private int count;

    public Purchase(String title, int count) {
        this.title = title;
        this.count = count;
    }

    public Purchase() {
    }

    public String getTitle() {
        return title;
    }

    public int getCount() {
        return count;
    }

    public void addCount(int count) {
        this.count += count;
    }
}