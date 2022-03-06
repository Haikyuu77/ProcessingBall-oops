import processing.core.PApplet;

public class Four_Balls extends PApplet{
    Ball ball1;
    Ball ball2;
    Ball ball3;
    Ball ball4;


    public Four_Balls() {
        this.ball1 = new Ball(1,800/5, 20, this);
        this.ball2 = new Ball(2,800/5 * 2, 20, this);
        this.ball3 = new Ball(3,800/5 * 3, 20, this);
        this.ball4 = new Ball(4,800/5 * 4, 20, this);
    }

    public static void main(String[] args) {
        PApplet.main(Four_Balls.class.getCanonicalName());
    }

    public void settings() {
        size(800, 800);
    }

    public void setup() {
        fill(255, 255, 255);
    }

    public void draw(){
        ball1.draw();
        ball2.draw();
        ball3.draw();
        ball4.draw();
    }
}
