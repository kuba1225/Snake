package snakeLogic;

import java.util.Comparator;

/**
 *
 * @author Kuba
 */
public class PointsComparator implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        int u1 = o1.getPoints();
        int u2 = o2.getPoints();

        if (u1 < u2) {
            return 1;
        } else if (u1 > u2) {
            return -1;
        } else {
            return 0;
        }
    }
}
