package game;

import city.cs.engine.*;

/**
 * A bowling ball.
 */
public class FireBall extends DynamicBody {

    private static final float radius = 2.5f;
    private static final Shape ballShape = new CircleShape(radius);
    private static final BodyImage ballImage =
        new BodyImage("data/fire.gif", 2*radius);

    /**
     * Construct a bowling ball.
     * @param world the world in which this body exists.
     */
    public FireBall(World world) {
        super(world, ballShape);
        addImage(ballImage);
    }
}
