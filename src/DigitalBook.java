public class DigitalBook extends Title{

private int availability;
private int reach;
private int use;

    public DigitalBook(String title, String literatureType, int availability, int reach, int use) {
        super(title, literatureType);
        this.availability = availability;
        this.reach = reach;
        this.use = use;
    }


    @Override
    public float getPoints() {
        return 0;
    }

    @Override
    public float getPages() {
        return 0;
    }

    @Override
    public float calculatePoints() {
        return 0;
    }
}
