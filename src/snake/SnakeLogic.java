/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import static snake.SnakePanel.timer;

/**
 *
 * @author Kuba
 */
public class SnakeLogic implements KeyListener {

    private Snake snake;
    private int points = 0;
    private static int move = 2;
    private boolean ate = true;
    private boolean gameOver = false;
    private static int level = 1;

    private Position fruitPosition = null;
    private Random rand = new Random();

    public void initSnake() {
        snake = new Snake();
        Position head = new Position(3, 6);
        snake.getPosition().add(head);
        move = 2;
        snake.length++;
    }

    public Snake getSnake() {
        return snake;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public boolean isAte() {
        return ate;
    }

    public void setAte(boolean ate) {
        this.ate = ate;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

    public Position getFruitPosition() {
        return fruitPosition;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void generateFruit() {
        int r = rand.nextInt(14);
        int c = rand.nextInt(12);

        Position tmp = new Position(r, c);

        for (int i = 0; i < snake.getLength(); i++) {
            if (tmp.equals(snake.getPosition().get(i))) {
                i = 0;
                r = rand.nextInt(14);
                c = rand.nextInt(12);
                tmp.setR(r);
                tmp.setC(c);
            }
        }

        fruitPosition = tmp;
    }

    public void updatePosition() {
        int hr = snake.getPosition().get(0).getR();
        int hc = snake.getPosition().get(0).getC();

        int tr = snake.getPosition().get(snake.length - 1).getR();
        int tc = snake.getPosition().get(snake.length - 1).getC();

        switch (move) {
            case 0:
                hr--;
                break;
            case 1:
                hc++;

                break;
            case 2:
                hr++;
                break;
            case 3:
                hc--;
                break;
        }

        for (int j = 0; j < snake.length; j++) {
            if ((snake.getPosition().get(j).getR() == hr) && (snake.getPosition().get(j).getC() == hc)) {
                gameOver = true;
            }
        }

        if (hr >= 0 && hr < 14 && hc >= 0 && hc < 12 && !gameOver) {

            for (int i = snake.length - 1; i > 0; i--) {
                snake.getPosition().get(i).setR(snake.getPosition().get(i - 1).getR());
                snake.getPosition().get(i).setC(snake.getPosition().get(i - 1).getC());
            }

            snake.getPosition().get(0).setR(hr);
            snake.getPosition().get(0).setC(hc);

            Position tmp2 = new Position(hr, hc);

            if (tmp2.equals(fruitPosition)) {
                Position tmp = new Position(tr, tc);
                snake.getPosition().add(tmp);
                points += 10 * level;
                snake.length++;
                ate = true;

            }
        } else {
            gameOver = true;

        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_UP:
                move = 0;
                break;
            case KeyEvent.VK_DOWN:
                move = 2;
                break;
            case KeyEvent.VK_LEFT:
                move = 3;
                break;
            case KeyEvent.VK_RIGHT:
                move = 1;
                break;
            case KeyEvent.VK_ENTER:
                timer.start();
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //
    }
}
