package game;

import city.cs.engine.*;

/**
 * Doors in a game. When the actor collides with a door, if
 * the current level is complete the game is advanced to the
 * next level.
 */
public class Door extends DynamicBody {
    private static final Shape shape = new PolygonShape(-0.166f,0.48f, 0.164f,0.48f, 0.164f,-0.462f, -0.166f,-0.456f, -0.166f,0.476f);
;
    private static final BodyImage img = new BodyImage("data/door.png",5.8f);
    /**
     * Initialise a new door.
     * @param world The world.
     */
    public Door(World world) {

        super(world, shape);
        this.addImage(img);
    }
}
