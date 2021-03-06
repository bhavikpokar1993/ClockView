package com.aqua30.clockview.clock.clock;

/**
 * Created by Saurabh 2017.
 */

public class ClockLine {

    /* xy coordinates of ticker from where it starts */
    Coordinates startXY;
    /* xy coordinates of ticker to where it stops */
    Coordinates endXY;

    public ClockLine() {
        startXY = new Coordinates();
        endXY = new Coordinates();
    }

    public Coordinates getStartXY() {
        return startXY;
    }

    public void setStartXY(int startX, int startY) {
        this.startXY.setCood_X(startX);
        this.startXY.setCood_Y(startY);
    }

    public Coordinates getEndXY() {
        return endXY;
    }

    public void setEndXY(int endX, int endY) {
        this.endXY.setCood_X(endX);
        this.endXY.setCood_Y(endY);
    }
}