public class DigitalBook extends Title{

private int availability;
private int reach;
private int use;

    public DigitalBook(String name, String title, int literaturePoint, String literatureType, int availability, int reach, int use) {
        super(name, title, literaturePoint, literatureType);
        this.availability = availability;
        this.reach = reach;
        this.use = use;
    }

    @Override
    public double calculateRoyalty() {
        return 0;
    }

    @Override
    public double getPoints() {
        return 0;
    }

    @Override
    public double getPages() {
        return 0;
    }
}
