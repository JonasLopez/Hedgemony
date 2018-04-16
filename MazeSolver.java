/**
  Returns the boolean value of the statement
  "it is possible to get from starting point to treasure"
*/

public class MazeSolver {
    
    private Maze maze;
    private static Displayer display;
    private final static int[] DIRECTIONS = {Maze.EAST, Maze.SOUTH, Maze.WEST, Maze.NORTH};

    public MazeSolver(Maze mazeInput, int heightInput) {
        maze = mazeInput;
        display = new Displayer(heightInput);
        display.atTopOfWindow(maze.toString());
    }
    
    public boolean canMazeBeSolved() {

        //check for base cases
        if(maze.explorerIsOnA() == Maze.TREASURE) return true;
        else if(maze.explorerIsOnA() == Maze.WALL) return false;

        //recursive case
        else {

            //starts east, then goes counter-clockwise      
            for (int direction : DIRECTIONS) {
                
                Maze snapshot = new Maze(maze);
                maze.dropA(Maze.WALL);
                maze.go(direction);
                System.out.println("after moving to another stepping stone:");
                terminalDisplayer(maze);

                if (canMazeBeSolved()) return true;
                
                //recursively backtrack
                maze = new Maze(snapshot);                
                System.out.println("after recursively backtracking:");
                terminalDisplayer(maze);
            }
            //all 4 directions exhausted
            return false;
        }
    }

    //streamlines output in terminal
    public String toString() {
        if (canMazeBeSolved()) return "true" + System.lineSeparator();
        else return "false" + System.lineSeparator();
    }
    
    //streamlines display in terminal
    private void terminalDisplayer(Maze maze) {
        display.atTopOfWindow(maze.toString());
    }
}
