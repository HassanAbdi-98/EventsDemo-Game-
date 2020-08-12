package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

public class KryptoniteBlock extends DynamicBody {
    private static final Shape kryptoniteblockshape = new PolygonShape(
            -0.048f,0.388f, 0.262f,0.296f, 0.378f,-0.126f, -0.198f,-0.34f, -0.404f,0.064f, -0.056f,0.388f






    );




    private static final BodyImage image =
            new BodyImage("data/g2.png", 3.00f);

    public KryptoniteBlock(World world) {
        super(world, kryptoniteblockshape);
        addImage(image);
    }

}