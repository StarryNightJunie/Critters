import java.awt.*;

public class Lion extends Critter {
    private int count;
    private Color iColor;


    public Lion() {
        this.count = 0;
    }
    //set the color of the lion
    public Color getColor() {
        this.count = this.count + 1;
        if ((this.count - 1) % 3 == 0) {
            Color randomColor = randomColor();
            this.iColor = randomColor;
            return randomColor;
        } else {
            return this.iColor;
        }
    }

    //represent the lion
    public String toString() {
        return "L";
    }

    // action of the lion
    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.WALL || info.getRight() == Neighbor.WALL) {
            return Action.LEFT;
        } else if (info.getFront() == Neighbor.SAME) {
            return Action.RIGHT;
        } else {
            return Action.HOP;
        }
    }
    // random number generaator to decide what color will the lion be
    private Color randomColor() {
        double number = Math.random();
        if (number < (1.0 / 3)) {
            return Color.RED;
        } else if (number > (2.0 / 3)) {
            return Color.GREEN;
        } else {
            return Color.BLUE;
        }
    }
}