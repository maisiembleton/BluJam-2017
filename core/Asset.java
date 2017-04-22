package core;

import processing.core.PImage;

/**
 * Created by zva on 22/04/17.
 */
public class Asset {
    public final String name;
    public final PImage image;

    public Asset(String name, PImage image) {
        this.name = name;
        this.image = image;
    }

    public static Asset loadAsset(/*Args*/) {
        // Load and return an asset.
        return null;
    }
}
