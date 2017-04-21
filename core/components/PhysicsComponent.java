package core.components;

import core.GameObject;
import processing.core.PVector;

import java.util.Collection;
import java.util.Stack;

/**
 * Created by zva on 21/04/17.
 */
public class PhysicsComponent {

    GameObject obj;
    float mass;
    PVector velocity;
    PVector acceleration;

    private Stack<PVector> forces;

    public <T extends GameObject> PhysicsComponent(T obj) {

    }

    public void update(float dt) {

    }
}
