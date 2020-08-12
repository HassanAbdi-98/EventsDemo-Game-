package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

public class Cloud extends DynamicBody {
    private static final Shape cloudShape = new PolygonShape(0.025f,0.439f, 0.436f,0.281f, 0.35f,-0.353f, -0.528f,-0.153f, 0.0f,0.436f
    );


    private static final BodyImage image =
            new BodyImage("data/ice.jpg", 3.00f);

    public Cloud(World world) {
        super(world, cloudShape);
        addImage(image);
    }

}