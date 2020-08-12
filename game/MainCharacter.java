package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

/**
 * Simple character
 */
public class MainCharacter extends Walker {

    // Remember:  using the keyword static below means the fields shape and image belong to the class, rather than any instance. 
    // That means there is a single shape and image for all instances of the class.
    private static final Shape shape = new PolygonShape(-0.323f,0.015f, 0.288f,0.097f, 0.36f,-0.076f, -0.331f,-0.084f, -0.333f,0.012f);


    private static final BodyImage image =
            new BodyImage("data/200w.gif", 4.25f);

    private int coinCount;
    private int scoreCount;
    private int healthCount;
    private int strengthCount;
    private int burnCount;
    private Walker body;
    /**
     * Initiatialises the Main character object
     * @param world
     */
    public MainCharacter(World world) {
        super(world, shape);
        addImage(image);
        coinCount= 0;
        healthCount = 10;
        scoreCount = 0;
        strengthCount =0;
        burnCount = 0;
    }

    /**
     * This method return coin count
     * @return int value
     */
    public int getCoinCount() {
        return coinCount;
    }

    public int getHealthCount() {
        return healthCount;
    }

    /**
     * This method return score count
     * @return int value
     */
    public int getScoreCount() {
        return scoreCount;
    }

    public int getStrengthCount () { return strengthCount;}

    public int getBurnCount () { return burnCount;}


    public void decrementHealthCount() {
        healthCount --;
        System.out.println("Ouch!  Health count = " + healthCount);
    }


    public void incrementCoinCount() {
        coinCount++;

        System.out.println("I'm Rich!  Coin count = " + coinCount);
    }


    public void incrementStrengthCount() {
        coinCount++;
        System.out.println("I'm Getting Stronger!  Strength count = " + strengthCount);
    }

    public void incrementBurnCount() {
        burnCount++;
        System.out.println("I'm Burning!  Burning count = " + burnCount);
    }


    public void incrementScoreCount() {
        scoreCount++;
        System.out.println("Awesome!  Time count = " + coinCount);
    }

    public int getCount(){

        return coinCount;
    }


    public void addCollisionListener(Walker body) {
        this.body = body;
    }

    public void shootRight(){
        Bullet bullet = new Bullet(this.getWorld());
    bullet.setGravityScale(2);
bullet.setPosition(new Vec2(this.getPosition().x-1,this.getPosition().y));
//llet.setLinearVelocity(new Vec2(-10,0);
//llet.addCollisionListener(new Pickup(body);
    }
}