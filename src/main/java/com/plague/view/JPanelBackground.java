package com.plague.view;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class JPanelBackground extends JPanel {
    private Image backgroundImage;

    public JPanelBackground() {
        try {
            File file = new File("map.png");
            backgroundImage = ImageIO.read(file);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImage, 0, 0, this);
    }
}
