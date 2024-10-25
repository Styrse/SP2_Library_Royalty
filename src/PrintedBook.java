public class PrintedBook extends PhysicalBook{

    private int pages;

    public PrintedBook(String title, String literatureType, int copies, int pages) {
        super(title, literatureType, copies);
        this.pages = pages;
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
