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

        panelControls.add(buttonStartGame);
        panelControls.add(buttonEndGame);
    }

}
