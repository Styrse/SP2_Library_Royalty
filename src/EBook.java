public class EBook extends DigitalBook{
    private int characters;
    private boolean illustrated;

    public EBook(String name, String title, int literaturePoint, String literatureType, int availability, int reach, int use, int characters, boolean illustrated) {
        super(name, title, literaturePoint, literatureType, availability, reach, use);
        this.characters = characters;
        this.illustrated = illustrated;
    }

    @Override
    public double getPages() {
        return super.getPages();
    }
}
