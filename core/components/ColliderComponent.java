package core.components;

import core.GameObject;

import java.util.Collection;

/**
 * Created by zva on 21/04/17.
 */
public class ColliderComponent {

    private GameObject obj;
    private GameObject collidedWith;
    private Rectangle collisionBox;

    public <T extends GameObject & Collidable> ColliderComponent(T obj) {
        this.obj = obj;
    }

    public boolean hasCollided() {
        return collidedWith != null;
    }

    public void findCollisions(Collection<Collidable> obj) {

    }

    private class Rectangle {
        private float dx = 0;
        private float dy = 0;
        private float width;
        private float height;

        private Rectangle(float width, float height) {
            this.width = width;
            this.height = height;
        }
    }
}
