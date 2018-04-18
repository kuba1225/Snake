package snakeGUI;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author Kuba
 */
public class GraphicsTools {

    private final int SIZE = 50;

    void drawLines(Graphics2D g2d, Color linesColor) {
        g2d.setColor(linesColor);
        for (int i = 0; i < 13; i++) {
            g2d.drawLine(i * SIZE, 0, i * SIZE, 700);
        }
        for (int i = 0; i < 15; i++) {
            g2d.drawLine(0, i * SIZE, 600, i * SIZE);
        }
    }
}
