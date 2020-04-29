package task3_1;

public class InvalidKnightMove extends Exception{
    public InvalidKnightMove(String currentCell, String nextCell) {
        super("knight can`t move from " + currentCell + " to " + nextCell + ".");
    }
}
