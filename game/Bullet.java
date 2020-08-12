package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

public class Bullet  extends DynamicBody {
    private static final Shape bulletShape = new PolygonShape(-0.214f,0.152f, 0.232f,0.004f, -0.16f,-0.14f, -0.216f,0.142f
    );


    private static final BodyImage image =
            new BodyImage("data/p4.png", 3.00f);

    public Bullet (World world) {
        super(world, bulletShape);
        addImage(image);
    }

}