public class PrintedBook extends PhysicalBook{

    private int pages;

    public PrintedBook(String name, String title, String literatureType, int copies, int pages) {
        super(name, title, literatureType, copies);
        this.pages = pages;
    }

    @Override
    public double calculateRoyalty() {
        return 0;
    }

    @Override
    protected double getPoints() {
        return 0;
    }

    @Override
    public double getPages() {
        return 0;
    }
}
