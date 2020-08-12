package game;

import javax.swing.*;

public class MyFrame extends JFrame {

    private ImageIcon icon = new ImageIcon("data/door.png");
    public MyFrame(){

        getContentPane().add(new JLabel(icon));
        setSize(500,300);
        setVisible(true);
    }

    public static void main(String[] args){

        new MyFrame();
    }
}
