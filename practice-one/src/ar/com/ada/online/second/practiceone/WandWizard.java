package ar.com.ada.online.second.practiceone;

public class WandWizard {
    private int points;
    private String name;
    public WandWizard (int points, String name) {
        this.points = points;
        this.name = name;
    }
    public WandWizard (){}
    public int getPoints() {
        return points;
    }
    public void setPoints(int points) {
        this.points = points;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " +" + points + " attacking points";
    }
}
