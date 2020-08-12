package game;


import city.cs.engine.*;
import city.cs.engine.BodyImage;
import city.cs.engine.PolygonShape;
import city.cs.engine.Shape;
import city.cs.engine.World;


public class Metal extends DynamicBody {
    private static final Shape metalShape = new PolygonShape(-0.691f,0.398f, -0.691f,0.151f, 0.568f,0.16f, 0.55f,0.404f, 0.532f,0.404f
    );
    private static final BodyImage image =
            new BodyImage("data/metal.jpg", 3.00f);

    public Metal(World world) {
        super(world, metalShape);
        addImage(image);
    }
}



