package hw7;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {

    private int winWidth;
    private int winHeight;
    private int winPosX;
    private int winPosY;

    private GameField gameField;

    private JPanel panelSettings;
    private JPanel panelControls;

    private JButton buttonStartGame;
    private JButton buttonEndGame;

    private JSlider sliderMapSize;
    private JLabel labelMapSize;
    private final String MAP_SIZE_PREFIX = "Map size is: ";


    private JSlider sliderWinLength;
    private JLabel labelWinLength;
    private final String WIN_LENGTH_PREFIX = "Win size is: ";

    private int minMapSize = 3;
    private int maxMapSize = 10;
    private int minWinLength = 3;


    GameWindow(){
        prepareWindow();
        prepareGameSettingPanel();
        prepareGameButtons();
        prepareGameControlsPanel();

        gameField = new GameField();
        panelSettings.add(panelControls, BorderLayout.NORTH);

        add(panelSettings, BorderLayout.EAST);
        add(gameField);












        setVisible(true);

    }
    private void prepareWindow() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.winWidth = 1024;
        this.winHeight = 768;
        this.winPosX = 300;
        this.winPosY = 150;
        setSize(winWidth,winHeight);
        setLocation(winPosX, winPosY);
        setTitle("TresEnRaya");

    }

    private void prepareGameSettingPanel() {
        panelSettings = new JPanel();
        panelSettings.setLayout(new GridLayout(2,1));

    }
    private void prepareGameButtons() {
        buttonStartGame = new JButton("Start Game");
        buttonEndGame = new JButton("Exit Game");

    }

    private void prepareGameControlsPanel() {
        panelControls = new JPanel();
        panelControls.setLayout(new GridLayout(6,1));

        labelMapSize = new JLabel(MAP_SIZE_PREFIX + maxMapSize);
        sliderMapSize = new JSlider(minMapSize, maxMapSize, minMapSize);

        labelWinLength = new JLabel(WIN_LENGTH_PREFIX, minWinLength);
        sliderWinLength = new JSlider(minWinLength, minMapSize, minWinLength);


        panelControls.add(buttonStartGame);
        panelControls.add(buttonEndGame);
        panelControls.add(labelMapSize);
        panelControls.add(sliderMapSize);
        panelControls.add(labelWinLength);
        panelControls.add(sliderWinLength);
    }

}
