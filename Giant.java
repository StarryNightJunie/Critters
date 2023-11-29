import java.awt.*;

public class Giant extends Critter{
    private int count;
    private String oldName;
    private final String[] Names = {"fee", "fie", "foe", "fum"};
    private int gIndex;

    public Giant() {
        this.count = 0;
        this.gIndex = 0;
    }
    // set color for giant
    public Color getColor() {
        return Color.gray;
    }
    // set the string for the giant. It will switch according to the array every 6 steps
    public String toString() {
        this.count += 1;
        if ((this.count - 1) % 6 == 0) {
            if (this.gIndex == 4) {
                this.gIndex = 0;
            }
            this.gIndex += 1;
            return Names[gIndex - 1].toString();
        } else {
            this.oldName = Names[gIndex - 1];
        }
        return this.oldName;
    }
    // set the action for the giant
    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.getFront() != Neighbor.EMPTY) {
            return Action.RIGHT;
        } else {
            return Action.HOP;
        }
    }
}
