package game;

import city.cs.engine.*;

/**
 * Collision listener that allows the bird to collect things.
 */
public class Pickup implements CollisionListener {
    private MainCharacter mainCharacter;

    public Pickup(MainCharacter bird) {
        this.mainCharacter = mainCharacter;
    }

    @Override
    public void collide(CollisionEvent e) {
        if (e.getOtherBody() == mainCharacter) {
            if (e.getReportingBody() instanceof Enemy) {
                mainCharacter.decrementHealthCount();
            }

            if (e.getReportingBody() instanceof FireBall) {
                mainCharacter.incrementBurnCount();
            }

            if (e.getReportingBody() instanceof Pill) {
                mainCharacter.incrementStrengthCount();
            }

            if (e.getReportingBody() instanceof Pill) {
                mainCharacter.incrementBurnCount();
            }

            if (e.getReportingBody() instanceof KryptoniteBlock) {
                mainCharacter.incrementBurnCount();
            }


                if (e.getReportingBody() instanceof Bullet){
                    mainCharacter.decrementHealthCount();
            }

            if (e.getReportingBody() instanceof Pill) {
                mainCharacter.incrementBurnCount();
            }
            if(e.getReportingBody() instanceof Door){
               mainCharacter.incrementStrengthCount();
            }

            if(e.getReportingBody() instanceof Bullet){
                mainCharacter.incrementStrengthCount();
            }


            else if (e.getReportingBody() instanceof Coin){
                mainCharacter.incrementCoinCount();
            }


            e.getReportingBody().destroy();
        }
    }
    
}
