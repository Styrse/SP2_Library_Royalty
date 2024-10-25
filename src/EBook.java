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

    protected int usageFactor(int use){
        int points = 0;
        if (use > 25 && use <= 75){
            points = 50;
        } else if (use > 75 && use <= 150) {
            points = 100;
        } else if (use > 150 && use <= 400) {
            points = 150;
        } else if (use > 400 && use <= 1000) {
            points = 200;
        } else if (use > 1000 && use <= 2000) {
            points = 250;
        } else if (use > 2000 && use <= 5000) {
            points = 500;
        } else if (use > 5000 && use <= 10000) {
            points = 750;
        } else if (use > 10000) {
            points = 1000;
        }
        return points;
    }

    @Override
    protected double calculateLiteraturePoints(Title title) {
        return super.calculateLiteraturePoints(this);
    }
}
