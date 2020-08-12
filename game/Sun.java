package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

public class Sun extends DynamicBody {
    private static final Shape sunShape = new PolygonShape(-0.008f,0.066f, -0.078f,-0.076f, -0.082f,-0.306f, 0.08f,-0.326f, 0.154f,-0.202f, -0.004f,0.068f


    );


    private static final BodyImage image =
            new BodyImage("data/fire1.gif", 7.00f);

    public Sun(World world) {
        super(world, sunShape);
        addImage(image);
    }

}