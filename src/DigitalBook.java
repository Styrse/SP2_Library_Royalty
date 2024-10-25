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
    protected double calculatePoints() {
        return 0;
    }
}
