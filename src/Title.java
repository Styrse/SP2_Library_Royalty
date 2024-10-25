public abstract class Title extends Author{
    private String title;
    private int literaturePoint;
    private String literatureType;
    private final double rate = 0.067574;

    public Title(String title, String literatureType) {
        this.title = title;
        this.literatureType = literatureType;
    }

    public double calculateRoyalty(){
        return calculatePoints() * rate;
    }

    public String getTitle() {
        return title;
    }

    protected abstract double calculatePoints();

    protected double calculateLiteraturePoints(Title title){
        float points = 1;
        switch (literatureType){
            case "BI":
            case "TE":
                points = 3;
                break;
            case "LYRIK":
            case "NO":
                points = 6;
                break;
            case "SKØN":
                points = 1.7F;
                break;
            case "OVERS":
            case "ORDBO":
                points = 1F/3F;
                break;
            case "OVLYR":
                points = 2;
                break;
            case "SAMLI":
            case "ALM":
                points = 1;
                break;
        }
        if (title instanceof AudioBook){
            points *= 0.5;
        }
        return points;
    }
}
