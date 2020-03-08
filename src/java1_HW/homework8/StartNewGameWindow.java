package java1_HW.homework8;

import javax.swing.*;
import java.awt.*;

public class StartNewGameWindow extends JFrame {
    private static final int WINDOW_POS_X = 500;
    private static final int WINDOW_POS_Y = 200;
    private static final int WINDOW_HIGHT = 455;
    private static final int WINDOW_WIDTH = 407;

    private static final int MIN_FIELD_SIZE = 3;
    private static final int MAX_FIELD_SIZE = 10;
    private static final int MIN_WIN_LINE = 3;
    private static final int MAX_WIN_LINE = 10;


    private JRadioButton jrbHumVsAi;
    private JRadioButton jrbHumVsHum;
    private ButtonGroup gameMode;
    private JSlider slFieldSize;
    private JSlider slWinLength;


    public StartNewGameWindow() {
        setTitle("NewGame setting");
        setBounds(WINDOW_POS_X, WINDOW_POS_Y, WINDOW_HIGHT, WINDOW_WIDTH);
        setLayout(new GridLayout(10, 1));

        jrbHumVsAi = new JRadioButton("Human vs Ai", true);
        jrbHumVsHum = new JRadioButton("Human vs Human");
        gameMode = new ButtonGroup();
        gameMode.add(jrbHumVsAi);
        gameMode.add(jrbHumVsHum);


        add(new JLabel("Game Mode"));
        add(jrbHumVsAi);
        add(jrbHumVsHum);

        slFieldSize = new JSlider(MIN_FIELD_SIZE, MAX_FIELD_SIZE, MAX_FIELD_SIZE);
        slWinLength = new JSlider(MIN_WIN_LINE, MAX_WIN_LINE, MIN_WIN_LINE);
        slFieldSize.setMajorTickSpacing(1);
        slFieldSize.setPaintTicks(true);
        slFieldSize.setPaintLabels(true);

        slWinLength.setMajorTickSpacing(1);
        slWinLength.setPaintTicks(true);
        slWinLength.setPaintLabels(true);

        add(new JLabel("Choose field size"));
        add(slFieldSize);
        add(new JLabel("Choose WinLength"));
        add(slWinLength);


        setVisible(false);
    }
}
