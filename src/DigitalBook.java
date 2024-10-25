public abstract class DigitalBook extends Title {

    protected int availability;
    protected int reach;
    protected int use;

    public DigitalBook(String title, String literatureType, int availability, int reach, int use) {
        super(title, literatureType);
        this.availability = availability;
        this.reach = reach;
        this.use = use;
    }
}
