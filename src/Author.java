import java.util.ArrayList;

public class Author {

    private String name;
    private ArrayList<Title> titles;

    public Author(String name) {
        this.name = name;
        titles = new ArrayList<>();
    }

    public Author() {
    }

    public void addTitle(Title title){
        titles.add(title);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Title> getTitles() {
        return titles;
    }

    public float calculateTotalPay(){
        float totalPay = 0;
        for (Title t : titles){
            totalPay += t.calculateRoyalty();
        }
        return totalPay;
    }
}
