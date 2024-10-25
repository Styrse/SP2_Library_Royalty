public abstract class PhysicalBook extends Title {

    private int copies;

    public PhysicalBook(String name, String title, int literaturePoint, String literatureType, int copies) {
        super(name, title, literaturePoint, literatureType);
        this.copies = copies;
    }

    public abstract double getPoints();

    public abstract double getPages();
}
