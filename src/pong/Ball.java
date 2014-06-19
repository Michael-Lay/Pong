package pong;

import java.awt.Point;

public class Ball extends Point {

    private Point nextLocation;

    public Point getNextLocation() {
        return nextLocation;
    }

    public void bounce(double angle) {
        nextLocation.x = (int) Math.round(this.x + (Math.cos(angle)));
        nextLocation.y = (int) Math.round(this.y + (Math.sin(angle)));
    }

}
