package purple_steps_3d;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {
    public static void mainDraw(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/assets/r4.png]

        int square = 6;
        int size = 10;
        Color purple = new Color(174, 91, 226);

//        for (int i = 0; i < square; i++) {
//            for (int j = size; j < square * size; j+= size) {
//                graphics.setColor(Color.black);
//                graphics.drawRect(i + j, i + j, size + j, size + j);
//                graphics.setColor(purple);
//                graphics.fillRect(i + j + 1,i + j + 1,size + j - 1,size + j - 1);
//            }
//        }


        for (int i = size; i < square * size; i+= size) {
            int init = 0;
            for (int j = 0; j < i / size; j++) {
                init += j * size;
            }
            graphics.setColor(Color.black);
            graphics.drawRect(size + init,size +  init, i, i);
            graphics.setColor(purple);
            graphics.fillRect(size + init + 1,size + init + 1,i - 1,i - 1);
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
