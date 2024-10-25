public abstract class PhysicalBook extends Title{

    public int copies;

    public PhysicalBook(String title, String literatureType, int copies) {
        super(title, literatureType);
        this.copies = copies;
    }

    public abstract double getPages();
}
