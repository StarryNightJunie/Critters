import java.awt.*;

public class Orca extends Critter {
    public Orca() {
    }
    public String toString() {
        return "o";
    }
    // color of the orca
    public Color getColor() {
        return Color.black;
    }
    // set the action for the orca
    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.SAME || info.getFront() == Neighbor.EMPTY) {
            return Action.HOP;
        } else {
            return Action.LEFT;
        }
    }
}
