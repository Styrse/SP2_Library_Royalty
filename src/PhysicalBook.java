public abstract class PhysicalBook extends Title {

    private int copies;

    public PhysicalBook(String title, String literatureType, int copies) {
        super(title, literatureType);
        this.copies = copies;
    }

    public abstract float getPoints();

    public abstract float getPages();
}
