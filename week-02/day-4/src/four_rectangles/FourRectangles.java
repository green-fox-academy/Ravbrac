package four_rectangles;

import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.

        Random random = new Random();
        int counter = random.nextInt(996) + 4;

        for (int i = 0; i < counter; i++) {
            int r = random.nextInt(256);
            int g = random.nextInt(256);
            int b = random.nextInt(256);
            graphics.setColor(new Color(r, g, b));

            int x = random.nextInt(159);
            int y = random.nextInt(159);
            int sizeA = random.nextInt(154) + 5;
            int sizeB = random.nextInt(154) + 5;
            int xpoints[] = {x, x + sizeA, x + sizeA, x};
            int ypoints[] = {y, y, y + sizeB, y + sizeB};
            int npoints = 4;

            graphics.drawPolygon(xpoints, ypoints, npoints);
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
}