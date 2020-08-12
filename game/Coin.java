package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

public class Coin extends DynamicBody {
    private static final Shape coinShape = new PolygonShape(-0.012f,0.472f, 0.34f,0.312f, 0.462f,0.084f, 0.36f,-0.3f, -0.008f,-0.464f, -0.432f,-0.144f, -0.35f,0.306f, -0.034f,0.468f);
    private static final BodyImage image =
            new BodyImage("data/coin_PNG36944.png", 3.00f);

    public Coin(World world) {
        super(world, coinShape);
        addImage(image);
    }

}