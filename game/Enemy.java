package game;


import city.cs.engine.*;
import city.cs.engine.BodyImage;
import city.cs.engine.PolygonShape;
import city.cs.engine.Shape;
import city.cs.engine.World;


public class Enemy extends DynamicBody {
    private static final Shape enemyShape = new PolygonShape(-0.372f,0.444f, 0.276f,0.344f, 0.478f,-0.024f, 0.294f,-0.448f, -0.246f,-0.43f, -0.456f,0.03f
    );
    private static final BodyImage image =
            new BodyImage("data/dog.gif", 3.00f);

    public Enemy(World world) {
        super(world, enemyShape);
        addImage(image);
    }
}



