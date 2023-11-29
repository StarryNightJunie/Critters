import java.awt.*;
public class Bear extends Critter {
    private boolean polar;
    private int count;

    public Bear(boolean polar) {
        this.count = 0;
        this.polar = polar;
    }
    // Set the bear color
    public Color getColor() {
        if (this.polar) {
            return Color.white;
        } else {
            return Color.black;
        }
    }
    // decide the string if the bear is polar or not
    public String toString() {
        this.count += 1;
        if (count % 2 == 1) {
            return "/";
        } else {
            return "\\";
        }
    }
    // action for the bear
    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.EMPTY) {
            return Action.HOP;
        } else {
            return Action.LEFT;
        }
    }

}

