public class BlueRayDisk {
    private String title,director;
    private int yearOfRelease;
    private double cost;
    public BlueRayDisk next;
    public BlueRayDisk(String title, String director, int yearOfRelease, double cost){
        this.title = title;
        this.director = director;
        this.yearOfRelease = yearOfRelease;
        this.cost = cost;
        this.next = null;
    }
    @Override
    public String toString(){
        return this.title + " - " + this.director + " (" + this.yearOfRelease + "): $" + this.cost;
    }
}
