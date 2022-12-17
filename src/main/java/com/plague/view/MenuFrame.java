package com.plague.view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class MenuFrame extends JFrame {
    private final JPanel contentPane;
    private final JButton btnExit;
    private final JButton btnHighScore;
    private final JButton btnNewGame;

    public MenuFrame() {
        setIconImage(new ImageIcon("biohazard-warning-symbol.jpg").getImage());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);

        btnExit = new JButton("Exit");
        contentPane.add(btnExit);

        btnHighScore = new JButton("High Score");
        contentPane.add(btnHighScore);

        btnNewGame = new JButton("New Game");
        contentPane.add(btnNewGame);
    }

    public JButton getBtnExit() {
        return btnExit;
    }

    public JButton getBtnHighScore() {
        return btnHighScore;
    }

    public JButton getBtnNewGame() {
        return btnNewGame;
    }
}
