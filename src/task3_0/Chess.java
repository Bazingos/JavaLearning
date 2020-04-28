package task3_0;

public class Chess {
    private int x;
    private int y;

    final private static char[] CELL_LETTERS = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};

    public Chess(int x, int y) throws IllegalArgumentException{
        if(x > 7 || x < 0 || y > 7 || y < 0){
            throw new IllegalArgumentException("X and Y must be in interval of 0 to 7. Your x: " + x + " y: " + y);
        }
        this.x = x;
        this.y = y;
    }

    public int getX() throws IllegalArgumentException{
        return x;
    }

    public int getY() throws IllegalArgumentException{
        return y;
    }

    public void setX(int x) {
        if (x > 7 || x < 0)
            throw new IllegalArgumentException("x must be in interval of 0 to 7. You`ve provided x: " + x + ".");
        this.x = x;
    }

    public void setY(int y) {
        if (y > 7 || y < 0)
            throw new IllegalArgumentException("y must be in interval of 0 to 7. You`ve provided x: " + y + ".");
        this.y = y;
    }

    @Override
    public String toString() {
        return String.valueOf(CELL_LETTERS[x]) + (y + 1);
    }
}
