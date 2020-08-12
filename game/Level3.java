package game;

import city.cs.engine.*;
import city.cs.engine.Shape;
import org.jbox2d.common.Vec2;

import java.awt.*;

/**
 * Level 2 of the game
 */
public class Level3 extends GameLevel {



    private static final int NUM_COINS = 5;

    /**
     * Populate the world.
     */
    @Override
    public void populate(Game game) {
        super.populate(game);

        // make the ground
        Shape groundShape = new BoxShape(21, 0.5f);
        Body ground = new StaticBody(this, groundShape);
        ground.setPosition(new Vec2(0, -11.5f));

        // walls



        // make some platforms
        Shape platformShape = new BoxShape(4, 0.5f);
        Body platform1 = new StaticBody(this, platformShape);
        platform1.setPosition(new Vec2(-13.0f, 0.4f));
        platform1.setFillColor(Color.blue);
        //Body platform2 = new StaticBody(this, platformShape);
        // platform2.setPosition(new Vec2(2, -2.5f));

        
        Body platform3 = new StaticBody(this, platformShape);
        platform3.setPosition(new Vec2(-5.0f, 0.4f));
        platform3.setAngleDegrees(0);
        platform3.setFillColor(Color.blue);

        Body platform4 = new StaticBody(this, platformShape);
        platform4.setPosition(new Vec2(-20.9f, 0.4f));
        platform4.setAngleDegrees(0);
        platform4.setFillColor(Color.blue);

        Body platform5 = new StaticBody(this, platformShape);
        platform5.setPosition(new Vec2(10.5f, 0.4f));
        platform5.setAngleDegrees(0);
        platform5.setFillColor(Color.blue);

        Body platform6 = new StaticBody(this, platformShape);
        platform6.setPosition(new Vec2(3.0f, 0.4f));
        platform6.setAngleDegrees(0);
        platform6.setFillColor(Color.blue);

        Body platform7 = new StaticBody(this, platformShape);
        platform7.setPosition(new Vec2(9.5f, 7.4f));
        platform7.setAngleDegrees(0);
        platform7.setFillColor(Color.blue);

        Body platform8 = new StaticBody(this, platformShape);
        platform8.setPosition(new Vec2(20.5f, 7.4f));
        platform8.setAngleDegrees(0);
        platform8.setFillColor(Color.blue);

        Body platform9 = new StaticBody(this, platformShape);
        platform9.setPosition(new Vec2(-7.0f, 7.4f));
        platform9.setAngleDegrees(0);
        platform9.setFillColor(Color.blue);


        Body platform10 = new StaticBody(this, platformShape);
        platform10.setPosition(new Vec2(-14.5f, 7.4f));
        platform10.setAngleDegrees(0);
        platform10.setFillColor(Color.blue);

        Body platform11 = new StaticBody(this, platformShape);
        platform11.setPosition(new Vec2(0.5f, 7.4f));
        platform11.setAngleDegrees(0);
        platform11.setFillColor(Color.blue);


        Body platform12 = new StaticBody(this, platformShape);
        platform12.setPosition(new Vec2(7.0f, 7.4f));
        platform12.setAngleDegrees(0);
        platform12.setFillColor(Color.blue);

        Body platform13 = new StaticBody(this, platformShape);
        platform13.setPosition(new Vec2(12.5f, 7.4f));
        platform13.setAngleDegrees(0);
        platform13.setFillColor(Color.blue);

        Body platform14 = new StaticBody(this, platformShape);
        platform14.setPosition(new Vec2(27.5f, 7.4f));
        platform14.setAngleDegrees(0);
        platform14.setFillColor(Color.blue);

        Body platform15 = new StaticBody(this, platformShape);
        platform15.setPosition(new Vec2(17.5f, 13.0f));
        platform15.setAngleDegrees(0);
        platform15.setFillColor(Color.blue);

        Body platform16 = new StaticBody(this, platformShape);
        platform16.setPosition(new Vec2(-5.0f, 13.0f));
        platform16.setAngleDegrees(0);
        platform16.setFillColor(Color.blue);

        Body platform17 = new StaticBody(this, platformShape);
        platform17.setPosition(new Vec2(-20.9f, 13.0f));
        platform17.setAngleDegrees(0);
        platform17.setFillColor(Color.blue);

        Body platform18 = new StaticBody(this, platformShape);
        platform18.setPosition(new Vec2(10.5f, 13.0f));
        platform18.setAngleDegrees(0);
        platform18.setFillColor(Color.blue);

        Body platform19 = new StaticBody(this, platformShape);
        platform19.setPosition(new Vec2(3.0f, 13.0f));
        platform19.setAngleDegrees(0);
        platform19.setFillColor(Color.blue);

        Body platform20 = new StaticBody(this, platformShape);
        platform20.setPosition(new Vec2(9.5f, 13.0f));
        platform20.setAngleDegrees(0);
        platform20.setFillColor(Color.blue);

        Body platform21 = new StaticBody(this, platformShape);
        platform21.setPosition(new Vec2(-13.0f, 13.0f));
        platform21.setAngleDegrees(0);
        platform21.setFillColor(Color.blue);

        Body platform22 = new StaticBody(this, platformShape);
        platform22.setPosition(new Vec2(17.0f, 0.4f));
        platform22.setAngleDegrees(0);
        platform22.setFillColor(Color.blue);






        Door door = new Door(this);
        door.setPosition(new Vec2(-20.5f,19.5f));
        door.addCollisionListener(new DoorListener(game));
    }
    {
        Body ground = new StaticBody(this, new BoxShape(50.0f, 5.0f));
        ground.setPosition(new Vec2(0.0f, -12.0f));
    }
    {
        Body ground = new StaticBody(this, new BoxShape(13.0f, 0.25f));
        ground.setPosition(new Vec2(18.0f, 27.0f));
        ground.setAngle(0.25f);
    }


    {
        Coin coin = new Coin(this);
        coin.setPosition(new Vec2(-20.9f, 4.4f));
        coin.addCollisionListener(new Pickup(getPlayer()));

        Coin coin2 = new Coin(this);
        coin2.setPosition(new Vec2(-4.5f, 4.8f));
        coin2.addCollisionListener(new Pickup(getPlayer()));

        Coin coin3 = new Coin(this);
        coin3.setPosition(new Vec2(3.0f, 4.8f));
        coin3.addCollisionListener(new Pickup(getPlayer()));

        Coin coin4 = new Coin(this);
        coin4.setPosition(new Vec2(-13.0f, 4.8f));
        coin4.addCollisionListener(new Pickup(getPlayer()));

        Coin coin5 = new Coin(this);
        coin5.setPosition(new Vec2(11.0f, 4.8f));
        coin5.addCollisionListener(new Pickup(getPlayer()));



    }

    {
        Sun sun= new Sun(this);
        sun.setPosition(new Vec2(-6.0f, 12.8f));
        sun.addCollisionListener(new Pickup(getPlayer()));

        Sun sun2= new Sun(this);
        sun2.setPosition(new Vec2(-14.5f, 12.8f));
        sun2.addCollisionListener(new Pickup(getPlayer()));

        Sun sun3= new Sun(this);
        sun3.setPosition(new Vec2(3.5f, 12.8f));
        sun3.addCollisionListener(new Pickup(getPlayer()));
        sun3.setFillColor(Color.green);

        Sun sun4= new Sun(this);
        sun4.setPosition(new Vec2(12.5f, 12.8f));
        sun4.addCollisionListener(new Pickup(getPlayer()));

        Pill pill3 = new Pill(this);
        pill3.setPosition(new Vec2(6, 0));
        pill3.addCollisionListener(new Pickup(getPlayer()));

        KryptoniteBlock kryptoniteBlock = new KryptoniteBlock(this);
        kryptoniteBlock.setPosition(new Vec2(15,0));


        KryptoniteBlock kryptoniteBlock1 = new KryptoniteBlock(this);
        kryptoniteBlock1.setPosition(new Vec2(-20.0f,0));

        KryptoniteBlock kryptoniteBlock2 = new KryptoniteBlock(this);
        kryptoniteBlock2.setPosition(new Vec2(-5.0f,0));

        KryptoniteBlock kryptoniteBlock3 = new KryptoniteBlock(this);
        kryptoniteBlock3.setPosition(new Vec2(2.5f,0));

    }
    {


        {

        }
        Enemy enemy = new Enemy(this);
        enemy.setPosition(new Vec2(-14.5f, 20.0f));
        enemy.addCollisionListener(new Pickup(getPlayer()));
    }
    @Override
    public Vec2 startPosition() {
        return new Vec2(-8, -10);
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
