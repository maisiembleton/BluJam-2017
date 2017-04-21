package core;

import processing.core.PVector;

import javax.swing.*;

/**
 * Created by zva on 21/04/17.
 */
public abstract class GameObject {
    protected PVector position;
    protected final Asset asset = loadAsset();

    public abstract Asset loadAsset();

    public PVector getPosition() {
        return position;
    }

    public Asset getAsset() {
        return asset;
    }
    public abstract void update(float dt);
}