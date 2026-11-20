package at.edu.c02.puzzleroom.commands;

import at.edu.c02.puzzleroom.GameBoard;
import at.edu.c02.puzzleroom.Player;
import at.edu.c02.puzzleroom.exceptions.PuzzleRoomException;
import at.edu.c02.puzzleroom.exceptions.PuzzleRoomInvalidArgumentsException;
import at.edu.c02.puzzleroom.exceptions.PuzzleRoomInvalidMoveException;

/**
 * This command allows the player to execute multiple moves (u, d, l, r) in sequence.
 * Example usage: `fastmove d r r u`
 */
public class CommandFastmove implements Command {
    private final String[] directions;

    public CommandFastmove(String[] arguments) throws PuzzleRoomException {
        if (arguments == null || arguments.length == 0) {
            throw new PuzzleRoomInvalidArgumentsException();
        }
        for (String arg : arguments) {
            if (!arg.equals("u") && !arg.equals("d") && !arg.equals("l") && !arg.equals("r")) {
                throw new PuzzleRoomInvalidArgumentsException();
            }
        }
        this.directions = arguments;
    }

    @Override
    public void execute(GameBoard gameBoard) throws PuzzleRoomException {
        Player player = gameBoard.getPlayer();
        if (player == null) {
            throw new PuzzleRoomInvalidMoveException();
        }

        for (String dir : directions) {
            boolean success = switch (dir) {
                case "u" -> player.moveUp();
                case "d" -> player.moveDown();
                case "l" -> player.moveLeft();
                case "r" -> player.moveRight();
                default -> throw new PuzzleRoomInvalidArgumentsException();
            };

            if (!success) {
                throw new PuzzleRoomInvalidMoveException();
            }
        }

        new CommandShow().execute(gameBoard);
    }
}
