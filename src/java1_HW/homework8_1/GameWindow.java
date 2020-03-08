package java1_HW.homework8_1;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {
    private static final int WINDOW_POS_X = 450;
    private static final int WINDOW_POS_Y = 150;
    private static final int WINDOW_HIGHT = 555;
    private static final int WINDOW_WIDTH = 507;

    StartNewGameWindow startNewGameWindow;
    BattleMap field;


    public GameWindow() {
        setTitle("Tic TAc Toe");
        setBounds(WINDOW_POS_X, WINDOW_POS_Y, WINDOW_HIGHT, WINDOW_WIDTH);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(1, 2));
        JButton btnNewGame = new JButton("NewGame");
        JButton btnExit = new JButton("Exit");
        panel.add(btnNewGame);
        panel.add(btnExit);
        add(panel, BorderLayout.SOUTH);

        startNewGameWindow = new StartNewGameWindow();
        field = new BattleMap();
        add(field, BorderLayout.CENTER);


        btnExit.addActionListener(event -> {
            System.exit(0);
        });

        btnNewGame.addActionListener(event -> {
            startNewGameWindow.setVisible(true);
        });

        setVisible(true);
    }
}
