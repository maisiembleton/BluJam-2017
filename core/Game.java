package core;

import processing.core.PApplet;
import processing.core.PGraphics;
import processing.core.PImage;

import java.util.HashMap;

public class Game extends PApplet {

    float x = 0;

    public void keyPressed() {
        InputHandler.keyDown.put(keyCode, true);
    }

    public void keyReleased() {
        InputHandler.keyDown.put(keyCode, false);
    }

    public void settings() {
        size(500, 500);
    }

    public void setup() {
        PGraphics testGraphic = createGraphics(32, 32);
        testGraphic.beginDraw();
        testGraphic.fill(100);
        testGraphic.rect(0, 0, 32, 32);
        testGraphic.endDraw();
        Asset testAsset = new Asset("test", testGraphic);
        AssetHandler.assets.put(testAsset.name, testAsset);
        img = AssetHandler.assets.get("test").image;
    }

    float delta = 1;
    PImage img;
    public void draw() {
        background(255);
        image(img, x+=delta, x+=delta);
        if (x +32 > width || x +32 > height) {
            delta = -1;
        } else if (x < 0) {
            delta = 1;
        }

    }

    public void render(Level level) {

    }

    public void run() {
        // could probably put in draw tbh..
        //while true
            // while (playing level)
                // simulate all the stuff in the level (update(dt) i guess).
                // render the level render(level)
            // render the ui

    }

    public static void main(String[] args) {
        PApplet.main("core.Game");
    }
}
