
package game;

import city.cs.engine.*;
import game.GameLevel;
import org.jbox2d.common.Vec2;

import javax.swing.JFrame;

/**
 * @author Daniel Murphy
 */
public  class Level4 extends GameLevel {
    public void populate(Game game) {
        super.populate(game);


        World world = new World();

        int count = 20;
        {
            Body ground = new StaticBody(world, new BoxShape(100.0f, 20.0f));
            ground.setPosition(new Vec2(0.0f, -20.0f));
        }

        {
            float a = .5f;
            Shape shape = new BoxShape(a, a);

            float deltaX = 0.5625f;
            float deltaY = 1.25f;

            for (int i = 0; i < count; ++i) {
                float y = i * deltaY + 0.75f;
                for (int j = i; j < count; ++j) {
                    float x = (2 * j - i) * deltaX - 7.0f;
                    Body box = new DynamicBody(world, shape);
                    box.setPosition(new Vec2(x, y));
                }
            }
        }

        // make a view
        UserView view = new UserView(world, 500, 500);
        view.setCentre(new Vec2(0, 12));
        view.setZoom(10);

        // uncomment this to draw a 1-metre grid over the view
        // view.setGridResolution(1);

        // display the view in a frame
        final JFrame frame = new JFrame("Pyramid");

        // quit the application when the game window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationByPlatform(true);
        // display the world in the window
        frame.add(view);
        // don't let the game window be resized
        frame.setResizable(false);
        // size the game window to fit the world view
        frame.pack();
        // make the window visible
        frame.setVisible(true);

        // uncomment this to make a debugging view
        // JFrame debugView = new DebugViewer(world, 500, 500);

        // start!
        world.start();
    }

    @Override
    public Vec2 startPosition() {
        return null;
    }

    @Override
    public Vec2 doorPosition() {
        return null;
    }

    @Override
    public boolean isCompleted() {
        return false;
    }
}