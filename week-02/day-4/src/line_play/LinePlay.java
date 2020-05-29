package line_play;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics){

        int lines = 14;
        int margin = 10;
        Color purple = new Color(174, 91, 226);

        for (int i = 1; i <= lines; i++) {
            graphics.setColor(Color.green);
            graphics.drawLine((WIDTH / (lines + 2)) * i,HEIGHT - margin, margin, (HEIGHT / (lines + 2)) * i);
            graphics.setColor(purple);
            graphics.drawLine(HEIGHT - margin, (HEIGHT / (lines + 2)) * i, (WIDTH / (lines + 2)) * i, margin);
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