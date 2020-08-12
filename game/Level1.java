package game;


import city.cs.engine.*;
import city.cs.engine.Shape;
import org.jbox2d.common.Vec2;

import java.awt.*;

/**
     * A level of the game.
     */
    public class Level1 extends GameLevel{


        /**
         * Populate the world of this level.
         * Child classes should this method with additional bodies.
         */
        public void populate(Game game) {
            super.populate(game);
            Shape groundShape = new BoxShape(11, 0.5f);
            Body ground2 = new StaticBody(this, groundShape);
            ground2.setPosition(new Vec2(0, -11.5f));

            // walls
//        Shape leftWallShape = new BoxShape(0.5f, 6, new Vec2(-11.5f, 5.5f));
//        Fixture leftWall = new SolidFixture(ground, leftWallShape);
//        Shape rightWallShape = new BoxShape(0.5f, 6, new Vec2(11.5f, 5.5f));
//        Fixture rightWall = new SolidFixture(ground, rightWallShape);


            Shape platformShape = new BoxShape(4, 0.5f);
            Body platform1 = new StaticBody(this, platformShape);
            platform1.setPosition(new Vec2(20.9f, -6.5f));
            platform1.setFillColor(Color.getHSBColor(30, 93, 28));

            Body platform2 = new StaticBody(this, platformShape);
            platform2.setPosition(new Vec2(13, -9));
            platform2.setAngleDegrees(0);
            platform2.setFillColor(Color.getHSBColor(30, 93, 28));

            Body platform3 = new StaticBody(this, platformShape);
            platform3.setPosition(new Vec2(9.5f, -3.4f));
            platform3.setAngleDegrees(0);
            platform3.setFillColor(Color.getHSBColor(30, 93, 28));

            Body platform4 = new StaticBody(this, platformShape);
            platform4.setPosition(new Vec2(-25.5f, 7.5f));
            platform4.setAngleDegrees(0);
            platform4.setFillColor(Color.getHSBColor(30, 93, 28));


            // make platforms
            {
                Body ground = new StaticBody(this, new BoxShape(6.0f, 0.25f));
                ground.setPosition(new Vec2(8.0f, 22.0f));
                ground.setAngle(-0.25f);
                ground.setFillColor(Color.getHSBColor(30, 93, 28));
            }
            {
                Body ground = new StaticBody(this, new BoxShape(0.25f, 1.0f));
                ground.setPosition(new Vec2(6.5f, 19.0f));
                ground.setFillColor(Color.getHSBColor(30, 93, 28));
            }
            {
                Body groundTopBar = new StaticBody(this, new BoxShape(13.0f, 0.25f));
                groundTopBar.setPosition(new Vec2(8.0f, 14.0f));
                groundTopBar.setAngle(0);
                groundTopBar.setFillColor(Color.getHSBColor(30, 93, 28));

                Body groundTopBar2 = new StaticBody(this, new BoxShape(5.0f, 0.25f));
                groundTopBar2.setPosition(new Vec2(-15.0f, 11.5f));
                groundTopBar2.setAngle(0);
                groundTopBar2.setFillColor(Color.getHSBColor(30, 93, 28));
            }

            {
                Body groundTopBar2 = new StaticBody(this, new BoxShape(13.0f, 0.25f));
                groundTopBar2.setPosition(new Vec2(0.0f, 24.0f));
                groundTopBar2.setAngle(0);
                groundTopBar2.setFillColor(Color.getHSBColor(30, 93, 28));

            }


            {
                Body ground = new StaticBody(this, new BoxShape(0.25f, 1.0f));
                ground.setPosition(new Vec2(-9.5f, 11.0f));
                ground.setFillColor(Color.getHSBColor(30, 93, 28));
            }

            {
                Body ground = new StaticBody(this, new BoxShape(13.0f, 0.25f));
                ground.setPosition(new Vec2(-8.0f, 3.0f));
                ground.setAngle(-0.2f);
                ground.setFillColor(Color.getHSBColor(6, 8, 44));
            }


            // make a character


//        for (int i = 0; i < 11; i++) {


            Enemy enemy = new Enemy(this);
            enemy.setPosition(new Vec2(11.5f, 18));
            enemy.addCollisionListener(new Pickup(getPlayer()));




            Pill pill = new Pill(this);
            pill.setPosition(new Vec2(1, 18));
            pill.addCollisionListener(new Pickup(getPlayer()));

            Pill pill1 = new Pill(this);
            pill1.setPosition(new Vec2(-15.4f, 13.5f));
            pill1.addCollisionListener(new Pickup(getPlayer()));

            Pill pill2 = new Pill(this);
            pill2.setPosition(new Vec2(-23.0f, 11.5f));
            pill2.addCollisionListener(new Pickup(getPlayer()));

            Pill pill3 = new Pill(this);
            pill3.setPosition(new Vec2(13, -8));
            pill3.addCollisionListener(new Pickup(getPlayer()));


            for (int i = 0; i < 5; i++) {
                FireBall fireBall = new FireBall(this);
                fireBall.setPosition(new Vec2(-6, 12));
                fireBall.addCollisionListener(new Pickup(getPlayer()));
            }
            for (int i = 0; i < 3; i++) {
                Coin coins = new Coin(this);
                coins.setPosition(new Vec2(3, -10));
                //orange.putOn(groundShape);
                coins.addCollisionListener(new Pickup(getPlayer()));

            }

            Door door = new Door(this);
            door.setPosition(new Vec2(doorPosition()));
            door.addCollisionListener(new DoorListener(game));
        }

        /** The initial position of the player. */


        @Override
        public Vec2 startPosition() {
            return new Vec2(-10, -10);
        }

        @Override
        public Vec2 doorPosition() {
            return new Vec2(18.0f, 21.0f);
        }

        @Override
        public boolean isCompleted() {
            //return getPlayer().getCoinCount() == NUM_COINS;
            return false;
        }
    }




