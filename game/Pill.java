package game;


import city.cs.engine.*;
import city.cs.engine.BodyImage;
import city.cs.engine.PolygonShape;
import city.cs.engine.Shape;
import city.cs.engine.World;


public class Pill extends DynamicBody {
    private static final Shape pillShape = new PolygonShape(-0.014f,0.29f, -0.056f,-0.11f, -0.004f,-0.284f);
    private static final BodyImage image =
            new BodyImage("data/giphy456.gif", 3.00f);

    public Pill(World world) {
        super(world, pillShape);
        addImage(image);
    }
}



