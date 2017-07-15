/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;

import java.util.Comparator;
import snake.HighScoresPanel.User;

/**
 *
 * @author Kuba
 */
public class PointsComparator implements Comparator<HighScoresPanel.User> {

    @Override
    public int compare(User o1, User o2) {
        int u1 = o1.points;
        int u2 = o2.points;

        if (u1 < u2) {
            return 1;
        } else if (u1 > u2) {
            return -1;
        } else {
            return 0;
        }
    }
}
