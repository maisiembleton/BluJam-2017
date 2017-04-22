package core;

import core.components.Collidable;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by zva on 22/04/17.
 */
public class Level {
    protected Collection<GameObject> gameObjects = new ArrayList<>();
    protected List<Collidable> collidables = new ArrayList<>();

    public Level() {

    }

    void update(float dt) {
        findCollisions();
        for (GameObject obj : gameObjects) {
            obj.update(dt);
        }
    }

    private void findCollisions() {
        for (int i = 0; i < collidables.size(); i++) {

            Collidable obj = collidables.get(i);

            for (int j = i+1; j < collidables.size(); j++) {
                Collidable objToCheck = collidables.get(j);
                if (obj.getCollider().collidesWith(objToCheck)) {
                    Debug.print("Found collision");
                }
            }
        }
    }

    public Level(File levelFile) {

    }
}
