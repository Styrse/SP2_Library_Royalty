public abstract class Title extends Author implements Lendable{
    private String title;
    private int literaturePoint;
    private String literatureType;
    private final float rate = 0.067574F;

    public Title(String title, String literatureType) {
        this.title = title;
        this.literatureType = literatureType;
    }

    public float calculateRoyalty(){
        return calculatePoints() * rate;
    }



    public abstract float getPoints();

    public abstract float getPages();
}
