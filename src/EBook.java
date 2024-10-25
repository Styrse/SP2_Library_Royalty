public class EBook extends DigitalBook{
    private int characters;
    private boolean illustrated;
    private boolean text;

    public EBook(String title, String literatureType, int availability, int reach, int use, int characters, boolean illustrated, boolean text) {
        super(title, literatureType, availability, reach, use);
        this.characters = characters;
        this.illustrated = illustrated;
        this.text = text;
    }

    @Override
    protected double calculatePoints() {
        int pages = calculatePages();

        return pages * calculateLiteraturePoints(this) * ((availability*0.5) + (reach * 5) + usageFactor(use));
    }

    protected int calculatePages(){
        int pages = (characters / 1800);
        if (text == true || illustrated == true){
            pages += 20;
            if (illustrated == true){
                pages *= 1.1;
            }
        }
        return pages;
    }

    @Override
    protected double calculateLiteraturePoints(Title title) {
        return super.calculateLiteraturePoints(this);
    }
}
