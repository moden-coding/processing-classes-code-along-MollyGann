import java.util.ArrayList;

import processing.core.*;

public class App extends PApplet {
    ArrayList<Bubble> bubbles;

    public static void main(String[] args) {
        PApplet.main("App");
    }

    public void setup() {
        bubbles = new ArrayList<>();
    }

    public void settings() {
        size(600, 600);
    }

    public void draw() {
        background(0);

        for (Bubble b : bubbles) {
            b.display();
            b.update();
        }

    }

    public void keyPressed() {
        if (key == ' ') {
            int x = (int) random(500) + 20;
            int y = (int) random(500);

            Bubble bubble = new Bubble(x, y, this);
            bubbles.add(bubble);

        }
    }

    public void mousePressed() {
        for (Bubble b : bubbles) {
            b.checkTouch(mouseX, mouseY);
        }
    }
}
