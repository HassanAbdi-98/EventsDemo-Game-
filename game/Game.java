package game;

import city.cs.engine.*;

import java.awt.*;
import java.io.IOException;

import javax.swing.*;

/**
 * The computer game.
 */
public class Game {

    private static final Object MainCharacter = 1 ;
    /**
     * The World in which the bodies move and interact.
     */
    private GameLevel world;

    /**
     * A graphical display of the world (a specialised JPanel).
     */
   // private UserView view;

    private int level;

    private Controller controller;

    private MyView view;

    private ImageIcon icon = new ImageIcon("data/door.png");

    private String name;

    private JLabel scoreLabel;







    /**
     * Initialise a new Game.
     */
    public Game() {



        scoreLabel = new JLabel();
        // make the world
        level = 1;
        world = new Level1();
        world.populate(this);
        //view = new UserView(world, 1000, 700);
        view = new MyView(world, world.getPlayer(), 1000, 700);







        // make a view
        // uncomment this to draw a 1-metre grid over the view
        // view.setGridResolution(1);

        // display the view in a frame
        final JFrame frame = new JFrame("Event handling");
        final JFrame frame1 = new JFrame("Pryamid Test");





        ControlPanelform buttons = new ControlPanelform(this);

        frame.add(buttons.menuBar(), BorderLayout.NORTH);


        frame.getContentPane().add(new JLabel(icon));


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
        // get keyboard focus
        frame.requestFocus();
        // give keyboard focus to the frame whenever the mouse enters the view
        view.addMouseListener(new GiveFocus(frame));


        controller = new Controller(world.getPlayer());
        frame.addKeyListener(controller);
//        getPlayer().addCollisionListener((CollisionListener) controller);






        // uncomment to make the view track the bird
        // world.addStepListener(new Tracker(view, world.getPlayer()));

        // uncomment this to make a debugging view
        // JFrame debugView = new DebugViewer(world, 500, 500);

        // start!
        world.start();



        }
    public void save(){

        try {

            System.out.println("Score before save "+getPlayer().getCoinCount());

            HighScoreWriter highScoreWriter = new HighScoreWriter("data/save.txt");
            highScoreWriter.writeHighScore(name, getPlayer().getCoinCount());



        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public MainCharacter getPlayer() {
        return world.getPlayer();
    }

    /**
     * Is the current level of the game finished?
     */
    public boolean isCurrentLevelCompleted() {
        return world.isCompleted();
    }

    /**
     * This method is responsible for taking the Game into next level
     * @return Nothing
     */
    public void goNextLevel() {
        world.stop();
        if (level == 3) {
            System.exit(0);
        } else {
            level++;
            // get a new world
            world = new Level2();
            if (level ==2 ) {
                level++;
                //world = new Level3();
            }
            // fill it with bodies
            world.populate(this);
           controller.setBody(world.getPlayer());
           //world.getPlayer().addCollisionListener();                        // switch the keyboard control to the new player
            //frame.addKeyListener(new Controller(world.getPlayer()));

            //dddddddgetPlayer().addCollisionListener((CollisionListener) controller);
            // show the new world in the view
            view.setWorld(world);

                world.start();



            }

            world.start();
        }

    /**
     * Run the game.
     * @param args Unused
     * @return Nothing
     */
    public static void main(String[] args) {
        new Game();


    }

    public World getWorld() {
        return getWorld();
    }

    public World goAnyLevel() {
        return goAnyLevel();
    }

    public void pause() {

        //while (true) {
            world.stop();
        //}
    }

    public void resume(){

        //world.start();

    }
}

