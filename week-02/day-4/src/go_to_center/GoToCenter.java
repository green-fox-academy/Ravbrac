package go_to_center;

import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a function that draws a single line and takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Draw at least 3 lines with that function using a loop.

        Random random = new Random();
        int counter = random.nextInt(999) + 3;

        for (int i = 0; i < counter; i++) {
            int r = random.nextInt(256);
            int g = random.nextInt(256);
            int b = random.nextInt(256);
            int randomX = random.nextInt(321);
            int randomY = random.nextInt(321);
            graphics.setColor(new Color(r, g, b));
            lineToCenter(randomX, randomY, graphics);
        }


    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }

public static void lineToCenter(int x, int y, Graphics graphics){
        graphics.drawLine(x, y, WIDTH / 2, HEIGHT / 2);
    }
}