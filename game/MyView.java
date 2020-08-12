package game;


import city.cs.engine.UserView;
import city.cs.engine.World;

import javax.swing.*;
import  java.awt.*;

//Creates planet background



public class MyView extends UserView {
    private Image background;
    private Bullet bullet;


    public MyView(World w, MainCharacter player, int width, int height) {
        super(w, width, height);
        background = new ImageIcon("data/p4.png").getImage(); {
        }
    }

    @Override
    protected void paintBackground(Graphics2D g) {
        g.drawImage(background,0,0, this);


    }

    @Override
    protected void paintForeground(Graphics2D g) {


        g.drawString("score: "  , 100, 100);

    }
}