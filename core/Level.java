package core;

import core.components.Collidable;

import java.io.File;
import java.util.Collection;
import java.util.List;

/**
 * Created by zva on 22/04/17.
 */
public class Level {
    private Collection<GameObject> gameObjects;
    private List<Collidable> collidables;

    public Level() {

    }

    void update(float dt) {
        findCollisions();
        for (GameObject obj : gameObjects) {
            obj.update(dt);
        }
    }

    public void findCollisions() {
        for (int i = 0; i < collidables.size(); i++) {

            Collidable obj = collidables.get(i);

            for (int j = i+1; j < collidables.size(); j++) {
                Collidable objToCheck = collidables.get(j);
                if (obj.getCollider().collidesWith(objToCheck)) {

                }
            }
        }
    }

    public Level(File levelFile) {

    }
}
