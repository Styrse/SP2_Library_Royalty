public class PrintedBook extends PhysicalBook{

    private int pages;

    public PrintedBook(String title, String literatureType, int copies, int pages) {
        super(title, literatureType, copies);
        this.pages = pages;
    }

    @Override
    protected double calculatePoints() {
        return pages * calculateLiteraturePoints(this) * copies;
    }

    @Override
    protected double calculateLiteraturePoints(Title title) {
        return super.calculateLiteraturePoints(this);
    }
}
