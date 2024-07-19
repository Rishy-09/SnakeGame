package snake.game;

import javax.swing.*;

public class SnakeGame extends JFrame {
    SnakeGame(){
        super("Snake Game");
//        this board class has been extended with panel so to make it as a component
        add(new Board());
//        refreshing the window for every move
        pack();



//        setSize(300, 300);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String[] args) {
        new SnakeGame().setVisible(true);
    }
}