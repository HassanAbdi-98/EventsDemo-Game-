package game;

import city.cs.engine.World;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlPanel extends javax.swing.JPanel{
    private Game game;
    private World world;

    public JPanel mainPanel;
    private JButton pauseButton;
    private JButton restartButton;
    private JButton quitButton;
    private JButton playButton;
    private JButton saveButton;
    private JComboBox Levels;
    private int i = 1;

    /**
     *
     * @param game
     */
    public ControlPanel(Game game){
        this.game = game;
        this.world = game.getWorld();

        restartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Restart");
                game.goAnyLevel();
            }
        });
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Quit");
                System.exit(0);
            }
        });
        pauseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Pause");
                game.pause();
            }
        });

        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Play");
                game.getWorld().start();
            }
        });

//        saveButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                try {
//                    game.save();
//                }
//                catch (Exception a){
//                    a.printStackTrace();
//                }
//            }
//        });

//        launchLevel.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String x = String.valueOf(levelSelector.getSelectedItem());
//                if (x.equals("Level 1")) {
//                    game.goAnyLevel(1);
//                } else if (x.equals("Level 2")) {
//                    game.goAnyLevel(2);
//                } else if (x.equals("Level 3")) {
//                    game.goAnyLevel(3);
//                } else if (x.equals("Level 4")) {
//                    game.goAnyLevel(4);
//                }
//            }
//        });

        Levels.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                game.goNextLevel();
            }
        });
    }
}