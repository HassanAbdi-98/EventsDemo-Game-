package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

/**
 * Level 2 of the game
 */
public class Level2 extends GameLevel {



    private static final int NUM_COINS = 5;

    /**
     * Populate the world.
     */
    @Override
    public void populate(Game game) {
        super.populate(game);

        // make the ground
        Shape groundShape = new BoxShape(11, 0.1f);
        Body ground = new StaticBody(this, groundShape);
        ground.setPosition(new Vec2(0, -11.5f));

        // walls



        // make some platforms
        Shape platformShape = new BoxShape(4, 0.1f);
        Body platform1 = new StaticBody(this, platformShape);
        platform1.setPosition(new Vec2(-15, 3.5f));
        //Body platform2 = new StaticBody(this, platformShape);
       // platform2.setPosition(new Vec2(2, -2.5f));


        Body platform3 = new StaticBody(this, platformShape);
        platform3.setPosition(new Vec2(9.5f, 6.3f));
        platform3.setAngleDegrees(0);

        Body platform4 = new StaticBody(this, platformShape);
        platform4.setPosition(new Vec2(-20.5f, 0.5f));
        platform4.setAngleDegrees(0);

        Body platform5 = new StaticBody(this, platformShape);
        platform5.setPosition(new Vec2(9.5f, -3.4f));
        platform5.setAngleDegrees(0);

        Body platform6 = new StaticBody(this, platformShape);
        platform6.setPosition(new Vec2(-9.5f, 6.5f));
        platform6.setAngleDegrees(0);

        Body platform7 = new StaticBody(this, platformShape);
        platform7.setPosition(new Vec2(9.5f, -3.4f));
        platform7.setAngleDegrees(0);

        Body platform8 = new StaticBody(this, platformShape);
        platform8.setPosition(new Vec2(0, 7.5f));
        platform8.setAngleDegrees(0);

        Body platform9 = new StaticBody(this, platformShape);
        platform9.setPosition(new Vec2(16.5f, 2.5f));
        platform9.setAngleDegrees(0);

        Door door = new Door(this);
        door.setPosition(new Vec2(0.0f,7.5f));
        door.addCollisionListener(new DoorListener(game));
}
        {
            Body ground = new StaticBody(this, new BoxShape(50.0f, 5.0f));
            ground.setPosition(new Vec2(0.0f, -20.0f));
        }
    {
        Body ground = new StaticBody(this, new BoxShape(13.0f, 0.1f));
        ground.setPosition(new Vec2(8.0f, 22.0f));
        ground.setAngle(0.25f);
    }

    {

    }


       {
            Coin coin = new Coin(this);
            coin.setPosition(new Vec2(NUM_COINS, 10));
            coin.addCollisionListener(new Pickup(getPlayer()));
        }

    {
        Sun sun= new Sun(this);
        sun.setPosition(new Vec2(16.5f, 5.0f));
        sun.addCollisionListener(new Pickup(getPlayer()));

        Pill pill3 = new Pill(this);
        pill3.setPosition(new Vec2(7.5f, 3.5f));
        pill3.addCollisionListener(new Pickup(getPlayer()));

        KryptoniteBlock kryptoniteBlock = new KryptoniteBlock(this);
        kryptoniteBlock.setPosition(new Vec2(13,0));

    }
    {





        Enemy enemy = new Enemy(this);
        enemy.setPosition(new Vec2(0.5f, 10.0f));
        enemy.addCollisionListener(new Pickup(getPlayer()));
    }
    @Override
    public Vec2 startPosition() {
        return new Vec2(8, -10);
    }

    @Override
    public Vec2 doorPosition() {
        return new Vec2(-10.4f, -9.6f);
    }

    @Override
    public boolean isCompleted() {
        int NUM_COINS = 5;
        return getPlayer().getCoinCount() == NUM_COINS;
    }
}
