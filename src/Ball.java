import processing.core.PApplet;
public class Ball{
    private final int speed;
    private final int height;
    private final int diameter;
    private int x;
    private PApplet pApplet;

    public Ball(int speed, int height, int diameter, PApplet pApplet) {
        this.speed = speed;
        this.height = height;
        this.diameter = diameter;
        this.x = 0;
        this.pApplet = pApplet;
    }

    public void draw(){
        pApplet.ellipse(x, height, diameter, diameter);
        x += speed;
    }
}
