package at.edu.c02.puzzleroom.fields;

import at.edu.c02.puzzleroom.Direction;
import at.edu.c02.puzzleroom.GameBoard;

public class FieldIce extends BaseField {
    public FieldIce(GameBoard gameBoard, char name, int row, int col) {
        super(gameBoard, name, row, col);
    }

    @Override
    public void initialize() {
    }

    @Override
    public boolean enterField(Direction direction) {
        gameBoard.getPlayer().walkStep();
        setPlayerPositionToField();

        int nextRow = row;
        int nextCol = col;
        switch (direction) {
            case Up -> nextRow--;
            case Down -> nextRow++;
            case Left -> nextCol--;
            case Right -> nextCol++;
        }

        Field nextField = gameBoard.getField(nextRow, nextCol);
        nextField.enterField(direction);
        return true;
    }

    @Override
    public boolean leaveField(Direction direction) {
        return true;
    }
}
