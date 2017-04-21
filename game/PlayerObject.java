package game;

import core.Asset;
import core.AssetHandler;
import core.GameObject;
import core.components.Collidable;
import core.components.ColliderComponent;
import core.components.Physicable;
import core.components.PhysicsComponent;

import javax.swing.*;

/**
 * Created by zva on 22/04/17.
 */
public class PlayerObject extends GameObject implements Collidable, Physicable{

    public Asset loadAsset() {
        return AssetHandler.assets.get("player.png");
    }

    private ColliderComponent collider;
    private PhysicsComponent physics;

    @Override
    public PhysicsComponent getPhysics() {
        return physics;
    }
    @Override
    public ColliderComponent getCollider() {
        return collider;
    }


    public PlayerObject() {

    }

    private void handleInput() {

    }

    @Override
    public void update(float dt) {
        asset.toString();
        position.toString();
    }
}
