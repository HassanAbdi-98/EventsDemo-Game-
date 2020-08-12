package game;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class creates all the menu items, menu and menubar
 */
public class ControlPanelform {

    // Declaration of reference variables
    private JPanel panel1;
    private JButton play;
    private JButton quitButtonButton;
    private JButton pauseButtonButton;
    private JButton savebuttonButton;
    private Game game;



    private JMenu menu;

    private JMenuBar menuBar;

    private JMenuItem pauseMenu, playMenu, quitMenu, saveMenu;


    /**
     *
     * @param game
     */
    public ControlPanelform(Game game) {

        // Creating a menu bar
        menuBar = new JMenuBar();

        // Creating all menu items
        pauseMenu = new JMenuItem("Pause");
        playMenu = new JMenuItem("Play");
        quitMenu = new JMenuItem("Quit");
        saveMenu = new JMenuItem("Save");

        // Creating menu
        menu = new JMenu("Game Actions");

        // Adding all menu items to the menu
        menu.add(pauseMenu);
        menu.add(playMenu);
        menu.add(quitMenu);
        menu.add(saveMenu);

        // adding menu to menu bar
        menuBar.add(menu);




        this.game = game;



         // Event Handling for all the menu items
        quitMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }
        });

        playMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });

        pauseMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("pause");
                game.pause();

            }
        });


        saveMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    game.save();
                }
                catch (Exception a){
                    a.printStackTrace();
                }



            }
        });





    }


    /**
     *
     * @return JMenuBar
     */
    public JMenuBar menuBar(){
        return menuBar;
    }

}
