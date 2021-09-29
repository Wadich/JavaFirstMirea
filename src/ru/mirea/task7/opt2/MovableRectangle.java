package ru.mirea.task7.opt2;

public class MovableRectangle extends MovablePoint implements Movable {
    private final MovablePoint topLeft;
    private final MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2,
                            int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public boolean checkSameSpeed() {
        return (this.topLeft.getxSpeed() == this.bottomRight.getxSpeed()) &&
                (this.topLeft.getySpeed() == this.bottomRight.getySpeed());
    }
}
